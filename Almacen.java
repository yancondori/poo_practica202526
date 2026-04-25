import java.util.HashMap;
import java.util.ArrayList;

/**
Almacen es la clase principal de almacenamiento de datos de la fabrica ademas es independiente 
(decouple -  modular y facil mantenimiento) del resto de sistema de gestion (trabajadores, dashboard, 
planificador o cadena de montaje) por lo tanto, es la clase adecuada para empezar el diseño
   */
public class Almacen
{
    private HashMap<String, Trabajador> trabajadores; // usamos un hashmap , clave-valor para realizar un busqueda eficiente lookup de los trabajadores 
                                                        // a traves de la clave string DNI y el valor Trabajador Object,
    private ArrayList<Motor> motores;   // usamos arraylist porque es una coleccion flexible que mantiene el orden de los elementos guardados 
    private ArrayList<Tapiceria> tapicerias;
    private ArrayList<Rueda> ruedas;
    private ArrayList<Vehiculo> vehiculosFabricados;
    
    public Almacen()
    {
        this.trabajadores = new HashMap<>(); // aplicamos el constructor para instanciar el campo trabajadores 
        this.motores = new ArrayList<>(); // explicitamos la variable con this para reforzar la idea de que no se trata de una variable local, es una variable permanente
        this.tapicerias = new ArrayList<>();
        this.ruedas = new ArrayList<>();
        this.vehiculosFabricados = new ArrayList<>();

    }
    
    
    /**
     * Nivel 2, b. Gestion de trabajadores: Dar de alta a los distintos tipos de empleados del sistema con
     *  sus datos personales. 
     *       
     */
    
    public void addTrabajador(String dni, Trabajador trabajador)
    {
        trabajadores.put(dni, trabajador); // setter
    }
    
    public Trabajador getTrabajador(String dni) // usamos el dni como key para la busqueda de la coleccion hashmap trabajadores
    {
        return trabajadores.get(dni); // return valordevuelto(); nombreObjeto.metodo(), los metodos : getters or setters
    }
    
    public void listarTrabajadores()
    {
        for (Trabajador t : trabajadores.values())
        {
            System.out.println(t.toString());
        }
    }
    
    /**
     * Busquedas sencillas de trabajador por dni, nombres y nombres y apellidos
     */
    
    public Trabajador buscarTrabajadorDni(String dni) // estrategia hacer busqueda directa al hashmap con la clave string dni
    {
        Trabajador t = trabajadores.get(dni); // creamos variable local 't' que recupera al objeto trabajador buscado
        //  de la coleccion de trabajadores. cuando le pidemos al mapa Hashmap trabajadores que extraiga
        //  la información de un dni que no existe, la propia coleccion responde directamente entregando un vacío.
        // La variable t nace ya conteniendo el valor nulo.
        
        if (t != null) 
        {
            System.out.println("Trabajador encontrado: " + t);
        }
        else 
        {
            System.out.println("No se ha encontrado al trabajador con DNI: " + dni);    
        }
        
        return t;             
    }
    
    public void buscarTrabajadorNombres(String nombres) //una de las busquedas sencillas de los empleados sera por los nombres
    {
        // Trabajador t = trabajadores.get(nombre);
        boolean encontrado = false; // flag variable 
        for(Trabajador t : trabajadores.values())
        {
            if(t.getNombres().equalsIgnoreCase(nombres)) // getNombres() de metodos de clase Trabajador, donde no tenemos case sensitive 
            {
                System.out.println(t);
                encontrado = true;
            }
        }
        
        if (!encontrado) // encontrado = true, por tanto pasa a ejecutar la orden del condicional, no significa que el trabajador haya sido encontrado !!
        {
            System.out.println("No se ha encontrado al trabajador con nombres: " + nombres);
        }
    }
    
    
    public void buscarTrabajadorNombresApellidos(String nombres, String apellidos) //busqueda por de los empleados por el nombres y apellidos
    {
         boolean encontrado = false;
         for (Trabajador t : trabajadores.values())
         {
             if(t.getNombres().equalsIgnoreCase(nombres)
             && t.getApellidos().equalsIgnoreCase(apellidos))
             {
                 System.out.println(t);
                 encontrado = true;
             }
         }
         
         if (!encontrado)
         {
             System.out.println("No se ha encontrado al trabajador: " + nombres + " " + apellidos);
         }
    }
    
    /** nivel 2, a. Ahora implementamos los statements(actions) de los metodos en la Gestion del Almacen :
     * Añadir y actualizar los datos de vehículos a producir en el sistema y todos los componentes asociados: motores, tapicería y ruedas
     */ 
    
    public void addMotor(Motor motor)
    {
        motores.add(motor); // añadimos motores
    }
    
    public Motor quitarMotor()
    {
        if (!motores.isEmpty())
        {
            return motores.remove(0); // se elimina el item actual motor y los demas se desplazan, tomando su indice.
        }                               // asegurandonos que al menos la coleccion tenga un elemnto para evitar el error IndexOutOfBoundsException
            return null; // la coleccion motor estaria vacia
        
    }
    
    public void addTapiceria(Tapiceria tapiceria)
    {
        tapicerias.add(tapiceria);
    }
    
    public Tapiceria quitarTapiceria()
    {
        if(!tapicerias.isEmpty())
        {
            return tapicerias.remove(0);    
        }
            return null;
    }
    
    public void addRueda(Rueda rueda)
    {
        ruedas.add(rueda);
    }
    
    public Rueda quitarRueda()
    {
        if(!ruedas.isEmpty()) // aplicamos al objeto, en este caso la coleccion las estoy llamando con plural ruedaS, MotorES...
        {
            return ruedas.remove(0); //aplicamos al objeto-coleccion
        }
            return null; 
    }
    
    public void addVehiculosFabricados(Vehiculo vehiculo)
    {
        vehiculosFabricados.add(vehiculo);
    }
    
    public ArrayList<Vehiculo> getVehiculosFabricados() // tener el return como arraylist, nos permite leer su tamaño e iterar posteriormente en la clase dashboard
    {
        return vehiculosFabricados;
    }
    
    // algunos getters utiles para el dashboard
    
    public int getMotoresSize()
    {
        return motores.size();
    }
    
    public int getRuedasSize()
    {
        return ruedas.size();
    }
    
    public int getTapiceriasSize()
    {
        return tapicerias.size();
    }
    
    public int getVehiculosFabricadosSize()
    {
        return vehiculosFabricados.size();
    }
    
// impresion consolidada de datos del almacen
    public void mostrarInventario() {
        System.out.println("--- Inventario del Almacen ---");
        System.out.println("Trabajadores registrados: " + trabajadores.size());
        System.out.println("Motores en stock: " + motores.size());
        System.out.println("Tapicerias en stock: " + tapicerias.size());
        System.out.println("Ruedas en stock: " + ruedas.size());
        System.out.println("Vehiculos terminados: " + vehiculosFabricados.size());
    }

    // Nivel 3: listados y estadisticas

    /**
     * Devuelve una lista de todos los operarios del sistema (eficientes y estandar).
     * Se usa para los listados de productividad del Dashboard.
     */
    public ArrayList<Operario> getOperarios()
    {
        ArrayList<Operario> lista = new ArrayList<>();
        for (Trabajador t : trabajadores.values())
        {
            if (t instanceof Operario)
            {
                lista.add((Operario) t);
            }
        }
        return lista;
    }

    /**
     * Devuelve todos los trabajadores como una lista para permitir iteracion
     * y ordenacion en el Dashboard.
     */
    public ArrayList<Trabajador> getTrabajadoresLista()
    {
        return new ArrayList<>(trabajadores.values());
    }

    /**
     * Muestra el listado detallado de vehiculos fabricados ensamblados con sus componentes
     */
    public void listarVehiculosFabricados()
    {
        System.out.println("--- Vehiculos fabricados (" + vehiculosFabricados.size() + ") ---");
        for (int i = 0; i < vehiculosFabricados.size(); i++)
        {
            System.out.println((i + 1) + ". " + vehiculosFabricados.get(i));
        }
        if (vehiculosFabricados.isEmpty())
        {
            System.out.println("  (ninguno)");
        }
    }
}

/** NIVEL 3 de practica POO
 * Producir diferentes listados y estadísticas del funcionamiento del sistema:
o Listado de operarios con opciones de filtrado por productividad y opciones de
ordenación alfabética.
o Listado de vehículos ensamblados, con opciones de filtrado por componentes y
opciones de ordenación alfabética.
o Listado de configuraciones de vehículos con mayor tasa de ensamblaje.
o Listado de cadenas de montaje con filtrado de fecha, donde se muestran en esas
fechas los vehículos producidos con sus componentes
 */