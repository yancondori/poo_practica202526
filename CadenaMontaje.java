import java.util.ArrayList;
/**
Presentamos la clase que muestra la dinamica y logica de pasos en la cadena de montaje de las 4 estados de vehiculo:
    Clase EstadoMontaje: CHASIS, MOTOR, TAPICERIA, RUEDAS
    Asumimos que cada estado tiene un operario controlando un robot
 */
public class CadenaMontaje
{
    private Vehiculo vehiculo;
    private EstadoMontaje estadoActual;
    private ArrayList<Operario> operarios;
    private boolean funcionando; // boolean que se comporta como apagado/encendido (false/true) de la cinta especifica.
    private int tiempoRestante; // tiempo restante de la operacion en curso
    
    public CadenaMontaje()
    {
        this.operarios = new ArrayList<>();
        this.estadoActual = EstadoMontaje.CHASIS; // empezador el montaje del vehiculo con el valor CHASIS del enum EstadoMontaje
        this.funcionando = false; // apagado incialmente y luego en el final del metodo tick()
        this.tiempoRestante = 0; // reloj de cuenta atras, indica cual es el tiempo restante para completar la pieza actual
        
    }
    
    public void asignarVehiculo(Vehiculo vehiculo) // la clase Planificador indicara derivara un vehiculo vacio a este metodo asignarVehiculo()
    {
        this.vehiculo = vehiculo;
        this.estadoActual = EstadoMontaje.CHASIS;
        this.funcionando = true;
    }
    
    public void addOperario(Operario operario) // cuando tenemos la cinta funcionando funcionando = true, añadimos un operario con addOperario()
                                                // en el orden de las fases 1ero Chasis, 2do Motor, 3ro Tapicería y 4to Ruedas.
    {
        operarios.add(operario);
    }
    
    public boolean avanzarTiempo()
    {
        if (!funcionando || vehiculo == null) // 2 escenarios si no se ha asignado vehiculo (vehiculo = null) entonces !funcionando = true, puesto
                                                // que el valor previo, del constructor fue false, "indica la cadena esta detenida o no hay coche" asi solo 
        {                                       // obtendriamos un return false. 2do escenario, si hay coche (vehiculo == null es false) entonces !funcionando = false,
                                                // puesto que su valor previo es true, luego seria un condicional de false || false, lo cual nos haria pasar
                                                // al segundo condicional con 0> 0, false, lo cual nos deriva a switch.
            return false; 
        }
        
        if (tiempoRestante > 0)
        {
            tiempoRestante--;
            return false; // ejecucion por omision return directo, el lugar de colocar un "else" 
        }
       
        switch(estadoActual) // switch estructura de control (selection statement) nativa de java, no es un metodo como tal.
                            // es natural la combinacion de los tipos enum con switch para mapear distintos  casos de ejecucion. 
                            // veremos el switch como transicion de estados de chasis, motor, tapiceria y ruedas 
        {
            case CHASIS: // si el tiempoRestante = 0 , entonces la fase en curso se ha completado, en este caso, CHASIS
                estadoActual = EstadoMontaje.MOTOR; // luego pasamos la siguiente fase, montaje del motor
                tiempoRestante = getOperarioActual().getTiempoTarea() - 1; //getOperarioActual se declara mas abajo en la designacion del operario
                                                                        // Obtenemos el tiempo que tarda el operario de la nueva fase (Motor)
                                                                        // ademas getTiempoTarea aprovecha el poliformismo del operarioestandar y eficiente 
                                                                        // Restamos 1 segundo porque este "tiempoRestante" ya cuenta como el primer segundo de trabajo.
                
                getOperarioActual().registrarMontaje(); // registramos el numero de montajes para asignarlos a la experiencia del operario
                break;
                
             case MOTOR:
                 estadoActual = EstadoMontaje.TAPICERIA;
                 tiempoRestante = getOperarioActual().getTiempoTarea() - 1;
                 getOperarioActual().registrarMontaje();
                 break;
                 
             case TAPICERIA:
                 estadoActual = EstadoMontaje.RUEDAS;
                 tiempoRestante = getOperarioActual().getTiempoTarea() - 1;
                 getOperarioActual().registrarMontaje();
                 break;

             case RUEDAS: // si terminamos las ruedas, entonces el coche ya esta completo
                 funcionando = false; // detenemos o apagamos la cinta
                 getOperarioActual().registrarMontaje();
                 return true; // se indica al planificador que el vehiculo esta completo                                                               
        }
        return false;    // cierre del switch
        
    } // cierre de avanzarTiempo
    
    
    /**
     * Declaramos getOperarioActual() que devuelve el operario que esta trabajando en este momento.
     * aprovechamos la caracteristica ordinal de los enums con  .ordinal() que devuelve la posición del estado del montaje
     * con (CHASIS=0, MOTOR=1, TAPICERIA=2, RUEDAS=3) que coincide exactamente 
     * con la posición del operario en el ArrayList.
     *
     */
    
    public Operario getOperarioActual()
    {
        return operarios.get(estadoActual.ordinal());
        
    }
    
    public void detener()
    {
        this.funcionando = false; 
    }

    public void reanudar()
    {
        this.funcionando = true; 
    }
    
    // declaramos getters de las campos iniciales que nos devuelve los valores actuales de la consulta
    public EstadoMontaje getEstadoActual()
    {
        return estadoActual;
    }
    
    public Vehiculo getVehiculo()
    {
        return vehiculo;
    }
    
    public boolean estaFuncionando()
    {
        return funcionando;
    }
    
    public String toString()
    {
        if (vehiculo == null)
        {
            return "Cadena de montaje vacia ";
        }
        return "Cadena de montaje [vehiculo = " + vehiculo + ", estado =" + estadoActual 
                + ", funcionando=" + funcionando + "]";
        
    }
}

/**
 * Key design notes: estadoActual.ordinal() returns the enum's position (CHASIS=0, MOTOR=1, TAPICERIA=2, RUEDAS=3), 
 * which maps directly to the operario index in the ArrayList — operario 0 handles chasis, operario 1 handles motor, etc. 
 * The tick() method returns true when the vehicle is fully assembled, which the Planificador will use to know when 
 * to move a finished vehicle to Almacen.
 */