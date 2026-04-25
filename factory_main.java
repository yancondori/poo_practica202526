import java.util.ArrayList;
import java.util.Scanner;

/**
 * factory_main es clase principal de la aplicacion, es el  Sistema de Gestion de Fabrica de Vehiculos
 * El punto de entrada: main() contiene el menu textual/usuario para interactuar con el sistema
 *
 
 * @author Yan Condori
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
     * Carga datos de ejemplo para probar el sistema.
     * Incluye operarios, mecanicos, admin, componentes y vehiculos para las 3 cadenas
     */
    public void cargarDatosEjemplo()
    {
        // Operarios (4 por cadena = 12 total)
        OperarioEficiente op1 = new OperarioEficiente(
            "Juan", "Garcia", "12345678A", "Calle Mayor 1",
            "28/1234567/09", "Operario", 1800.0, "2024-01-15", 15);
        OperarioEstandar op2 = new OperarioEstandar(
            "Maria", "Lopez", "87654321B", "Calle Sol 5",
            "28/7654321/09", "Operario", 1600.0, "2024-03-10", 5);
        OperarioEficiente op3 = new OperarioEficiente(
            "Pedro", "Martinez", "11111111C", "Av Libertad 10",
            "28/1111111/09", "Operario", 1850.0, "2023-06-01", 20);
        OperarioEstandar op4 = new OperarioEstandar(
            "Ana", "Ruiz", "22222222D", "Calle Luna 3",
            "28/2222222/09", "Operario", 1550.0, "2024-09-01", 3);
        OperarioEficiente op5 = new OperarioEficiente(
            "Luis", "Fernandez", "33333333E", "Paseo del Rio 7",
            "28/3333333/09", "Operario", 1900.0, "2022-11-20", 25);
        OperarioEstandar op6 = new OperarioEstandar(
            "Elena", "Diaz", "44444444F", "Calle Norte 15",
            "28/4444444/09", "Operario", 1500.0, "2025-01-10", 2);

        almacen.addTrabajador(op1.getDni(), op1);
        almacen.addTrabajador(op2.getDni(), op2);
        almacen.addTrabajador(op3.getDni(), op3);
        almacen.addTrabajador(op4.getDni(), op4);
        almacen.addTrabajador(op5.getDni(), op5);
        almacen.addTrabajador(op6.getDni(), op6);

        //  Mecanicos para el Nivel 3
        MecanicoEfectivo mec1 = new MecanicoEfectivo(
            "Carlos", "Vega", "55555555G", "Calle Taller 1",
            "28/5555555/09", "Mecanico", 2000.0, "2021-03-01", 25);
        MecanicoEstandar mec2 = new MecanicoEstandar(
            "Rosa", "Navarro", "66666666H", "Calle Taller 2",
            "28/6666666/09", "Mecanico", 1700.0, "2024-05-15", 10);

        almacen.addTrabajador(mec1.getDni(), mec1);
        almacen.addTrabajador(mec2.getDni(), mec2);

        // AdminSistema para el Nivel 3
        AdminSistema admin = new AdminSistema(
            "Miguel", "Sanchez", "77777777I", "Calle Sistema 1",
            "28/7777777/09", "Administrador", 2200.0, "2020-01-01");

        almacen.addTrabajador(admin.getDni(), admin);

        // GestorPlanta
        GestorPlanta gestor = new GestorPlanta(
            "Laura", "Torres", "88888888J", "Calle Planta 1",
            "28/8888888/09", "Gestor", 2100.0, "2019-06-15");

        almacen.addTrabajador(gestor.getDni(), gestor);

        // Componentes: 3 motores, 3 tapicerias, 3 ruedas
        MotorGasolina motor1 = new MotorGasolina(150.0, 2.0, 4);
        MotorElectrico motor2 = new MotorElectrico(200.0);
        MotorHibrido motor3 = new MotorHibrido(180.0, 1.8, 4);

        TapiceriaCuero tap1 = new TapiceriaCuero("Negro", 4.5);
        TapiceriaTela tap2 = new TapiceriaTela("Gris", 5.0);
        TapiceriaAlcantara tap3 = new TapiceriaAlcantara("Beige", 4.0);

        RuedaDeportiva rueda1 = new RuedaDeportiva(225, 17.0, 91, 240);
        RuedaNormal rueda2 = new RuedaNormal(195, 15.0, 85, 190);
        RuedaTodoT rueda3 = new RuedaTodoT(265, 18.0, 110, 180);

        almacen.addMotor(motor1);
        almacen.addMotor(motor2);
        almacen.addMotor(motor3);
        almacen.addTapiceria(tap1);
        almacen.addTapiceria(tap2);
        almacen.addTapiceria(tap3);
        almacen.addRueda(rueda1);
        almacen.addRueda(rueda2);
        almacen.addRueda(rueda3);

        // Vehiculos: 1 por tipo para las 3 cadenas 
        BiplazaDeportivo coche1 = new BiplazaDeportivo(
            "Rojo", 2, 1100.0, 1500.0, motor1, tap1, rueda1);
        Turismo coche2 = new Turismo(
            "Azul", 5, 1300.0, 1800.0, motor2, tap2, rueda2);
        Furgoneta coche3 = new Furgoneta(
            "Blanco", 3, 1800.0, 3500.0, motor3, tap3, rueda3);

        // Configurar las 3 cadenas de montaje
        // Cadena 0: BiplazaDeportivo con 4 operarios
        ArrayList<Operario> equipo1 = new ArrayList<>();
        equipo1.add(op1); equipo1.add(op1); equipo1.add(op2); equipo1.add(op2);
        planificador.configurarCadenas(0, coche1, equipo1);

        // Cadena 1: Turismo con 4 operarios
        ArrayList<Operario> equipo2 = new ArrayList<>();
        equipo2.add(op3); equipo2.add(op3); equipo2.add(op4); equipo2.add(op4);
        planificador.configurarCadenas(1, coche2, equipo2);

        // Cadena 2: Furgoneta con 4 operarios
        ArrayList<Operario> equipo3 = new ArrayList<>();
        equipo3.add(op5); equipo3.add(op5); equipo3.add(op6); equipo3.add(op6);
        planificador.configurarCadenas(2, coche3, equipo3);

        System.out.println("Datos de ejemplo cargados: 10 trabajadores, 3 vehiculos, 3 cadenas configuradas.");
    }

    /**
     * Menu textual principal — interfaz de Nivel 3.
     */
    public void menuPrincipal()
    {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n========================================");
            System.out.println("   FABRICA DE VEHICULOS - MENU PRINCIPAL");
            System.out.println("========================================");
            System.out.println(" [Datos]");
            System.out.println("  1. Cargar datos de ejemplo");
            System.out.println("  2. Mostrar inventario del almacen");
            System.out.println("  3. Listar trabajadores");
            System.out.println("  4. Buscar trabajador por DNI");
            System.out.println(" [Simulaciones]");
            System.out.println("  5. Ejecutar simulacion Simple");
            System.out.println("  6. Ejecutar simulacion Compleja");
            System.out.println("  7. Ejecutar simulacion Muy Compleja");
            System.out.println(" [Dashboard y listados]");
            System.out.println("  8. Mostrar dashboard consolidado");
            System.out.println("  9. Estado detallado de cadenas");
            System.out.println(" 10. Operarios por productividad");
            System.out.println(" 11. Operarios en orden alfabetico");
            System.out.println(" 12. Vehiculos fabricados");
            System.out.println("  0. Salir");
            System.out.println("----------------------------------------");
            System.out.print("Opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // consumir salto de linea

            switch (opcion) {
                case 1:
                    cargarDatosEjemplo();
                    break;
                case 2:
                    almacen.mostrarInventario();
                    break;
                case 3:
                    almacen.listarTrabajadores();
                    break;
                case 4:
                    System.out.print("Introduzca DNI: ");
                    String dni = scanner.nextLine();
                    almacen.buscarTrabajadorDni(dni);
                    break;
                case 5:
                    planificador.ejecutarSimple();
                    break;
                case 6:
                    ejecutarCompleja(scanner);
                    break;
                case 7:
                    ejecutarMuyCompleja(scanner);
                    break;
                case 8:
                    dashboard.mostrarConsolidado();
                    break;
                case 9:
                    dashboard.mostrarEstadoCadenasDetallado();
                    break;
                case 10:
                    dashboard.listarOperariosPorProductividad();
                    break;
                case 11:
                    dashboard.listarOperariosAlfabetico();
                    break;
                case 12:
                    dashboard.listarVehiculosFabricados();
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

    /**
     * Busca un MecanicoEfectivo y un MecanicoEstandar en el almacen
     * y lanza la simulacion Compleja. Si no existen, avisa al usuario
     */
    private void ejecutarCompleja(Scanner scanner)
    {
        MecanicoEfectivo mecEf = null;
        MecanicoEstandar mecEs = null;
        for (Trabajador t : almacen.getTrabajadoresLista())
        {
            if (t instanceof MecanicoEfectivo && mecEf == null) mecEf = (MecanicoEfectivo) t;
            if (t instanceof MecanicoEstandar && mecEs == null) mecEs = (MecanicoEstandar) t;
        }
        if (mecEf == null || mecEs == null)
        {
            System.out.println("Error: se necesita al menos 1 MecanicoEfectivo y 1 MecanicoEstandar.");
            System.out.println("Cargue datos de ejemplo primero (opcion 1).");
            return;
        }
        planificador.ejecutarCompleja(mecEf, mecEs);
    }

    /**
     * Busca un MecanicoEstandar y un AdminSistema en el almacen
     * y lanza la simulacion Muy Compleja. Si no existen, avisa al usuario.
     */
    private void ejecutarMuyCompleja(Scanner scanner)
    {
        MecanicoEstandar mecEs = null;
        AdminSistema admin = null;
        for (Trabajador t : almacen.getTrabajadoresLista())
        {
            if (t instanceof MecanicoEstandar && mecEs == null) mecEs = (MecanicoEstandar) t;
            if (t instanceof AdminSistema && admin == null) admin = (AdminSistema) t;
        }
        if (mecEs == null || admin == null)
        {
            System.out.println("Error: se necesita al menos 1 MecanicoEstandar y 1 AdminSistema.");
            System.out.println("Cargue datos de ejemplo primero (opcion 1).");
            return;
        }
        planificador.ejecutarMuyCompleja(mecEs, admin);
    }

    public static void main(String[] args)
    {
        factory_main app = new factory_main();
        app.menuPrincipal();
    }
}
/**
* Aqui algunas notas de uso: inicializacion (para resolver la referencia circular):
 * 1. Almacen (sin dependencias)
 * 2. Planificador (recibe Almacen, dashboard=null)
 * 3. Dashboard (recibe Almacen + cadenas del Planificador)
 * 4. planificador.setDashboard(dashboard) — cierra el ciclo
 *
 */

