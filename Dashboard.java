import java.util.ArrayList;

/**
 * Cuadro de mandos que muestra el estado de las cadenas de montaje
 * y el balance de componentes en el almacen.
 * Diseño desacoplado: Dashboard lee datos de Almacen y de las cadenas de montaje
 * pero no modifica nada (solo se visualiza)
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
        // cadenas es ArrayList, no HashMap — no existe .getValues()
        System.out.println("Estado de cadenas de montaje");
        for (int i = 0; i < cadenas.size(); i++) // for clásico: necesitamos i para imprimir "Cadena 1, Cadena 2..."
        {
            System.out.println("Cadena " + (i + 1) + ": " + cadenas.get(i)); // get(i) recupera el elemento por índice
        }
    // Alternativa for-each — descartada porque perdemos el índice i:
    //for (CadenaMontaje c : cadenas) {
    //    System.out.println("Cadena: " + c); // c ya es el elemento, no necesita .get(), pero no sabemos su número
    //}
    
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
        System.out.println("==============================");
    }

    // --- Nivel 3: listados y estadisticas ---

    /**
     * Listado de operarios ordenados por productividad (montajes, de mayor a menor).
     * Usa ordenacion burbuja para no depender de Collections.sort().
     */
    public void listarOperariosPorProductividad()
    {
        ArrayList<Operario> operarios = almacen.getOperarios();
        // Ordenacion burbuja por montajesPieza descendente
        for (int i = 0; i < operarios.size() - 1; i++)
        {
            for (int j = 0; j < operarios.size() - i - 1; j++)
            {
                if (operarios.get(j).getmontajesPieza() < operarios.get(j + 1).getmontajesPieza())
                {
                    Operario temp = operarios.get(j);
                    operarios.set(j, operarios.get(j + 1));
                    operarios.set(j + 1, temp);
                }
            }
        }
        System.out.println("--- Operarios por productividad (mayor a menor) ---");
        for (Operario op : operarios)
        {
            System.out.println("  " + op.getNombres() + " " + op.getApellidos()
                + " - montajes: " + op.getmontajesPieza()
                + " - tipo: " + (op instanceof OperarioEficiente ? "Eficiente" : "Estandar"));
        }
        if (operarios.isEmpty())
        {
            System.out.println("  (no hay operarios registrados)");
        }
    }

    /**
     * Listado de operarios ordenados alfabeticamente por apellidos.
     */
    public void listarOperariosAlfabetico()
    {
        ArrayList<Operario> operarios = almacen.getOperarios();
        // Ordenacion burbuja por apellidos
        for (int i = 0; i < operarios.size() - 1; i++)
        {
            for (int j = 0; j < operarios.size() - i - 1; j++)
            {
                if (operarios.get(j).getApellidos().compareToIgnoreCase(
                    operarios.get(j + 1).getApellidos()) > 0)
                {
                    Operario temp = operarios.get(j);
                    operarios.set(j, operarios.get(j + 1));
                    operarios.set(j + 1, temp);
                }
            }
        }
        System.out.println("--- Operarios en orden alfabetico ---");
        for (Operario op : operarios)
        {
            System.out.println("  " + op.getApellidos() + ", " + op.getNombres()
                + " - montajes: " + op.getmontajesPieza());
        }
        if (operarios.isEmpty())
        {
            System.out.println("  (no hay operarios registrados)");
        }
    }

    /**
     * Listado de vehiculos fabricados con detalle de componentes.
     */
    public void listarVehiculosFabricados()
    {
        almacen.listarVehiculosFabricados();
    }

    /**
     * Muestra el estado de cada cadena incluyendo averias (Nivel 3).
     */
    public void mostrarEstadoCadenasDetallado()
    {
        System.out.println("--- Estado detallado de cadenas ---");
        for (int i = 0; i < cadenas.size(); i++)
        {
            CadenaMontaje c = cadenas.get(i);
            System.out.println("Cadena " + (i + 1) + ": " + c
                + (c.estaAveriada() ? " [AVERIADA]" : "")
                + " | averias totales: " + c.getTotalAverias());
        }
    }
}

/**
 * Nota de diseno (patron MVC):
 * Almacen y CadenaMontaje son el Modelo (datos puros).
 * Planificador es el Controlador (modifica los datos).
 * Dashboard es la Vista (solo lee e imprime el Modelo).
 * Si se quisiera cambiar la visualizacion (ej. interfaz grafica),
 * solo habria que crear un nuevo Dashboard sin tocar el resto.
 */