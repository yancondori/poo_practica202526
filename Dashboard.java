import java.util.ArrayList;

/**
 * Cuadro de mandos que muestra el estado de las cadenas de montaje
 * y el balance de componentes en el almacen.
 * Diseño desacoplado: Dashboard lee datos de Almacen y de las cadenas de montaje
 * pero no modifica nada — solo visualiza.
 */
public class Dashboard
{
    private Almacen almacen;
    private ArrayList<CadenaMontaje> cadenas;

    public Dashboard(Almacen almacen, ArrayList<CadenaMontaje> cadenas)
    {
        this.almacen = almacen;
        this.cadenas = cadenas;
    }
    
    public void mostrarEstadoCadenas()
    {
        //No podemos unas cadenas.getvalues puesto que cadenas es un ArrayList
        System.out.println("Estado de cadenas de montaje");
        for (int i = 0; i < cadenas.size(); i++) // usamos for classic para el numero de cadena relacionado al indice del array 
                                                // y asi sea amigable para la lectura
        {
            System.out.println("Cadena " + (i + 1) + ": " + cadenas.get(i)); // tenemos que invocar manualmente al metodo get(i) para recuperar el dato, en contraste
                                                                                // con el for each loop
        }
    //for (CadenaMontaje c : cadenas) { // For-Each : (If we didn't care about numbering them):
    // 'c' is already the item! We don't need .get() at all.
    // However, we lost our 'i' counter, so we can't easily print "Cadena 1, Cadena 2"
    //System.out.println("Cadena: " + c);
    
    }
    
    public void mostrarStockAlmacen() // void no mutator, solo aplica getter + prints
    {
        System.out.println("Stock del Almacen");
        System.out.println("Motores: " + almacen.getMotoresSize()); // getMotoresSize() de clase Almacen
        System.out.println("Tapicerias: " + almacen.getTapiceriasSize());
        System.out.println("Ruedas: " + almacen.getRuedasSize());
        System.out.println("Vehiculos completados: " + almacen.getVehiculosFabricadosSize());    
    }
    
    //mostrando el consolidado de Estado Cadenas y del Stock del almacen, se llama despues de cada segundo de avanzarTiempo - Almacen 
    
    public void mostrarConsolidado()
    {
        System.out.println("\n=============================="); // cabecera visual
        mostrarEstadoCadenas();
        mostrarStockAlmacen();
        System.out.println("\n==============================");
    }

    
}
    
/**
 * Notice: Dashboard receives Almacen and the cadenas as constructor parameters — it doesn't create them. 
 * It only reads and displays. That's the decoupling the enunciado asks for. 
 * If you later change how Almacen stores data internally,
 * Dashboard doesn't need to change — it just calls the same getters.
 * 
 * Para solucionar esto, el ciclo de vida de tu simulación debe tener siempre dos pasos por cada segundo que pasa:
El cálculo (El tick): El Planificador hace su trabajo matemático modificando los atributos del Almacen y las CadenasMontaje.
La visualización (El método de tu consulta): Inmediatamente después del tick, se 
llama a tu clase Dashboard para que lea cómo han quedado los datos tras el cambio y los imprima en la consola.

patron MVC - importante
Conexión con el Patrón MVC (Modelo-Vista-Controlador): Como habrás visto comentado por compañeros en el grupo de Telegram de la asignatura,
este diseño responde a un patrón arquitectónico fundamental. Tus clases Almacen y CadenaMontaje son el Modelo (contienen los datos puros).
Tu Planificador es el Controlador (modifica los datos). Y tu Dashboard es exclusivamente la Vista (solo lee e imprime el Modelo)

 */