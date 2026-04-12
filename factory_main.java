import java.util.ArrayList;
import java.util.Scanner; // comenta su utilidad

/**
 *
 * Esta es la clase principal de la aplicacion
 */
public class factory_main
{
    private Almacen almacen;
    private Planificador planificador;
    private Dashboard dashboard;
    
    public factory_main()
    {
        this.almacen = new Almacen();
        this.planificador = new Planificador(almacen, null); // 1ro planificador, aun sin dashboard
        this.dashboard = new Dashboard(almacen, planificador.getCadenas()); // 2do dashboard, ya puede usar planificador
        this.planificador.setDashboard(dashboard); // 3ro cerramos la referencia circular
    }
    
        /**
     * Carga datos de ejemplo para probar el sistema
     */
    public void cargarDatosEjemplo()
    {
        // Create some workers
        OperarioEficiente op1 = new OperarioEficiente(
            "Juan", "Garcia", "12345678A", "Calle Mayor 1",
            "28/1234567/09", "Operario", 1800.0, "2024-01-15", 15);
        OperarioEstandar op2 = new OperarioEstandar(
            "Maria", "Lopez", "87654321B", "Calle Sol 5",
            "28/7654321/09", "Operario", 1600.0, "2024-03-10", 5);

        almacen.addTrabajador(op1.getDni(), op1);
        almacen.addTrabajador(op2.getDni(), op2);

        // Create components
        MotorGasolina motor1 = new MotorGasolina(150.0, 2.0, 4);
        TapiceriaCuero tap1 = new TapiceriaCuero("Negro", 4.5);
        RuedaDeportiva rueda1 = new RuedaDeportiva(225, 17.0, 91, 240);

        almacen.addMotor(motor1);
        almacen.addTapiceria(tap1);
        almacen.addRueda(rueda1);

        // Create a vehicle
        BiplazaDeportivo coche1 = new BiplazaDeportivo(
            "Rojo", 2, 1100.0, 1500.0, motor1, tap1, rueda1);

        // Configure assembly line 0 with the vehicle and 4 operators
        ArrayList<Operario> equipoCadena1 = new ArrayList<>();
        equipoCadena1.add(op1);  // chasis station
        equipoCadena1.add(op1);  // motor station
        equipoCadena1.add(op2);  // tapiceria station
        equipoCadena1.add(op2);  // ruedas station
        planificador.configurarCadenas(0, coche1, equipoCadena1);
    }

    /**
     * Menu textual para Level 3
     */
    public void menuPrincipal()
    {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== Fabrica de Vehiculos ===");
            System.out.println("1. Mostrar inventario");
            System.out.println("2. Listar trabajadores");
            System.out.println("3. Ejecutar simulacion simple");
            System.out.println("4. Mostrar dashboard");
            System.out.println("5. Cargar datos de ejemplo");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    almacen.mostrarInventario();
                    break;
                case 2:
                    almacen.listarTrabajadores();
                    break;
                case 3:
                    planificador.ejecutarSimple();
                    break;
                case 4:
                    dashboard.mostrarConsolidado();
                    break;
                case 5:
                    cargarDatosEjemplo();
                    System.out.println("Datos cargados.");
                    break;
                case 0:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }
        scanner.close();
    }

    public static void main(String[] args)
    {
        factory_main app = new factory_main();
        app.menuPrincipal();
    }
}
