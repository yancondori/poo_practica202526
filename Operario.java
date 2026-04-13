
/**
 * Clase abstracta intermedia para los operarios de la cadena de montaje.
 * Añade el campo montajesPieza (experiencia) y el metodo abstracto getTiempoTarea()
 * que cada subclase concreta (OperarioEficiente, OperarioEstandar) implementa
 * con tiempos distintos — esto es polimorfismo.
 *
 * Segun enunciado: eficiente (>10 montajes) = 1 seg, estandar (<=10) = 3 seg.
 *
 * @author Yan Condori
 */
public abstract class Operario extends Trabajador // abstract como padre que fuerza a sus hijos  
                                                    // a tener su propio comportamiento, estos
                                                    // hijos realizan la herencia, y concretan su comportamiento
{
    private int montajesPieza; // campo que Planificador llamara con getTiempoTarea() y determinara 
                                // si corresponde a un operario eficiente o estandar, de modo que
                                // usamos el poliformismo de cada tipo de operario para obtener 
                                //el tiempo de tarea que sera distinto en cada uno.
    
    public Operario(String nombres, String apellidos, String dni, String direccion, String numSegSec,
                        String puesto, double salario, String fechaIngreso, int montajesPieza)
    {
        super(nombres, apellidos, dni, direccion, numSegSec, puesto, salario, fechaIngreso);
        this.montajesPieza = montajesPieza;
        
    }
    
    public int getmontajesPieza()
    {
        return montajesPieza;
    }
    
    public void registrarMontaje() // en lugar de un setter porque no queremos un valor arbitrario
                                    // sino el incremento unitario del montaje, ensamblaje.
    {
        montajesPieza++;
    }
    
    public abstract int getTiempoTarea();
    
    
    public String toString()
    {
        return "Operario [" + super.toString() + ", montajes =" + montajesPieza +  "]";
    }
}