import java.util.ArrayList;
import java.util.Random;
/**
 * Componente principal que hace funcionar las cadenas de montaje
 * Se comporta como un reloj: cada segundo ejecuta una accion
 * Implementa tres tipos de simulacion: Simple, Compleja, MuyCompleja
 */
public class Planificador
{
    private ArrayList<CadenaMontaje> cadenas;
    private Almacen almacen;
    private Dashboard dashboard;
    
    public Planificador(Almacen almacen, Dashboard dashboard)
    {
        this.almacen = almacen;
        this.dashboard = dashboard;
        this.cadenas = new ArrayList<>(); // instanciamos un nuevo array , cadenas.
    
    // de acuerdo a la practica cada cadena de montaje esta asociada a un tipo de motor y vehiculo por tanto tendremos 3 cadenas
    
        cadenas.add(new CadenaMontaje());
        cadenas.add(new CadenaMontaje());
        cadenas.add(new CadenaMontaje());
    }
    
    public ArrayList<CadenaMontaje> getCadenas()
    {
        return cadenas;
    }
    /**
     * Configuramos cada una de las 3 cadena de montaje con un vehiculo y operarios.
     * indice: 0, 1, o 2 (una por tipo de vehiculo)
     */
    
    public void configurarCadenas(int indice, Vehiculo vehiculo, ArrayList<Operario> operarios)
    {
        CadenaMontaje cadena = cadenas.get(indice);
        cadena.asignarVehiculo(vehiculo);
        for ( Operario op: operarios)
        {
            cadena.addOperario(op);
        }
    }
    
    /**
     * Simulacion Simple (Nivel 2):No se produce ningun problema en las cintas
     * Solo hay que considerar los tipos de operarios, seleccionados aleatoriamente
     */
    
    public void ejecutarSimple()
    {
        System.out.println("== Simulacion Simple ==");
        int segundo = 0;
        boolean todasCompletas = false;
        
        while (!todasCompletas)
        {
            segundo++;
            System.out.println("--- Segundo " + segundo + " ---");
            todasCompletas = true;
            
            for (int i = 0; i < cadenas.size(); i++)
            {
                CadenaMontaje cadena = cadenas.get(i);
                if (cadena.estaFuncionando()) 
                {
                    boolean completado = cadena.avanzarTiempo();
                    if (completado) 
                    {
                        System.out.println("Cadena " + (i + 1) + ": vehiculo completado!");
                        almacen.addVehiculosFabricados(cadena.getVehiculo());
                    }
                    todasCompletas = false;
                }
            }
            
            dashboard.mostrarConsolidado();
        }
        
        System.out.println("=== Simulacion Simple finalizada ===");        
    }        
    
    public void setDashboard(Dashboard dashboard)
    {
         this.dashboard = dashboard; // para evitar referencia circular en factory_main   
    }

    /**
     * Nivel 3: Simulacion Compleja:
     * Entran en juego los mecanicos, al menos uno de cada perfil debe reparar
     * al menos dos problemas en cada cinta.
     *
     * Estrategia: se pre-programan 2 averias por cadena en segundos determinados
     * se alternan mecanico efectivo y estandar para cumplir que al menos 1 de cada
     * perfil repare al menos 2 problemas.
     */
    public void ejecutarCompleja(MecanicoEfectivo mecEfectivo, MecanicoEstandar mecEstandar)
    {
        System.out.println("== Simulacion Compleja ==");
        int segundo = 0;
        boolean todasCompletas = false;
        Random rand = new Random();

        // Preprogramamos en que segundo ocurre cada averia por cadena
        // 2 averias por cadena = 6 averias totales
        // averiasProgram[cadena][averia] = segundo en el que ocurre
        int[][] averiasProgram = new int[3][2];
        for (int i = 0; i < 3; i++)
        {
            averiasProgram[i][0] = 2 + rand.nextInt(2); // segunda 2 o 3
            averiasProgram[i][1] = 5 + rand.nextInt(2); // segunda 5 o 6
        }

        // Contadores: cuantas averias ha reparado cada perfil por cadena
        int[] reparacionesEfectivo = new int[3];
        int[] reparacionesEstandar = new int[3];

        while (!todasCompletas)
        {
            segundo++;
            System.out.println("--- Segundo " + segundo + " ---");
            todasCompletas = true;

            for (int i = 0; i < cadenas.size(); i++)
            {
                CadenaMontaje cadena = cadenas.get(i);

                // Comprobar si toca provocar averia en este segundo
                if (cadena.estaFuncionando() && !cadena.estaAveriada())
                {
                    for (int a = 0; a < 2; a++)
                    {
                        if (segundo == averiasProgram[i][a])
                        {
                            cadena.provocarAveria();
                            System.out.println("  ** Averia en cadena " + (i + 1) + " en segundo " + segundo + " **");
                            // Asignar mecanico alternando: averia 0 -> efectivo, averia 1 -> estandar
                            if (a == 0)
                            {
                                cadena.iniciarReparacion(mecEfectivo.getTiempoReparacion());
                                reparacionesEfectivo[i]++;
                                mecEfectivo.registrarReparaciones();
                                System.out.println("  -> Mecanico efectivo asignado (1 seg)");
                            }
                            else
                            {
                                cadena.iniciarReparacion(mecEstandar.getTiempoReparacion());
                                reparacionesEstandar[i]++;
                                mecEstandar.registrarReparaciones();
                                System.out.println("  -> Mecanico estandar asignado");
                            }
                        }
                    }
                }

                // Procesar reparacion si hay averia activa
                if (cadena.estaAveriada())
                {
                    boolean reparada = cadena.avanzarReparacion();
                    if (reparada)
                    {
                        System.out.println("  Cadena " + (i + 1) + ": reparacion completada.");
                    }
                    else
                    {
                        System.out.println("  Cadena " + (i + 1) + ": reparando...");
                    }
                    todasCompletas = false;
                }
                // Procesar avance normal si no hay averia
                else if (cadena.estaFuncionando())
                {
                    boolean completado = cadena.avanzarTiempo();
                    if (completado)
                    {
                        System.out.println("Cadena " + (i + 1) + ": vehiculo completado!");
                        almacen.addVehiculosFabricados(cadena.getVehiculo());
                    }
                    todasCompletas = false;
                }
            }

            dashboard.mostrarConsolidado();
        }

        // Resumen de reparaciones
        System.out.println("=== Resumen de reparaciones ===");
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Cadena " + (i + 1) + ": "
                + reparacionesEfectivo[i] + " por mec. efectivo, "
                + reparacionesEstandar[i] + " por mec. estandar");
        }
        System.out.println("=== Simulacion Compleja finalizada ===");
    }

    /**
     * Nivel 3: Simulacion Muy Compleja:
     * Entran en juego operarios, mecanicos estandar y administrador.
     * De 2 a 3 problemas por cadena + al menos 1 caida de luz.
     *
     * Estrategia: se preprograman 2-3 averias por cadena (mecanicos estandar)
     * mas 1 caida de luz global que detiene todas las cadenas (AdminSistema).
     */
    public void ejecutarMuyCompleja(MecanicoEstandar mecEstandar, AdminSistema admin)
    {
        System.out.println("== Simulacion Muy Compleja ==");
        int segundo = 0;
        boolean todasCompletas = false;
        Random rand = new Random();

        // Pre-programar averias: 2-3 por cadena
        int[][] averiasProgram = new int[3][3];
        int[] numAveriasPorCadena = new int[3];
        for (int i = 0; i < 3; i++)
        {
            numAveriasPorCadena[i] = 2 + rand.nextInt(2); // 2 o 3 averias
            averiasProgram[i][0] = 2 + rand.nextInt(2);
            averiasProgram[i][1] = 5 + rand.nextInt(2);
            if (numAveriasPorCadena[i] == 3)
            {
                averiasProgram[i][2] = 8 + rand.nextInt(2);
            }
        }

        // Caida de luz en segundo 4
        int segundoCaidaLuz = 4;
        boolean caidaLuzOcurrida = false;
        int tiempoRestaurarGestion = 0;
        int tiempoRestaurarCadenas = 0;
        boolean sistemaDetenido = false;

        while (!todasCompletas)
        {
            segundo++;
            System.out.println("--- Segundo " + segundo + " ---");
            todasCompletas = true;

            // Comprobar caida de luz
            if (segundo == segundoCaidaLuz && !caidaLuzOcurrida)
            {
                caidaLuzOcurrida = true;
                sistemaDetenido = true;
                tiempoRestaurarGestion = admin.getTiempoRestaurarGestion(); // 2 seg
                tiempoRestaurarCadenas = admin.getTiempoRestaurarCadenas(); // 3 seg
                System.out.println("  *** CAIDA DE LUZ *** Todas las cadenas detenidas.");
                System.out.println("  -> AdminSistema restaurando (2s gestion + 3s cadenas)");
            }

            // Procesar restauracion por caida de luz
            if (sistemaDetenido)
            {
                if (tiempoRestaurarGestion > 0)
                {
                    tiempoRestaurarGestion--;
                    System.out.println("  Restaurando sistema de gestion... (" + tiempoRestaurarGestion + "s restante)");
                    todasCompletas = false;
                    dashboard.mostrarConsolidado();
                    continue; // todas las cadenas pausadas, no se procesa nada mas
                }
                else if (tiempoRestaurarCadenas > 0)
                {
                    tiempoRestaurarCadenas--;
                    System.out.println("  Restaurando cadenas de montaje... (" + tiempoRestaurarCadenas + "s restante)");
                    todasCompletas = false;
                    dashboard.mostrarConsolidado();
                    continue;
                }
                else
                {
                    sistemaDetenido = false;
                    System.out.println("  Sistema completamente restaurado. Cadenas reanudadas.");
                }
            }

            for (int i = 0; i < cadenas.size(); i++)
            {
                CadenaMontaje cadena = cadenas.get(i);

                // Comprobar si toca provocar averia
                if (cadena.estaFuncionando() && !cadena.estaAveriada())
                {
                    for (int a = 0; a < numAveriasPorCadena[i]; a++)
                    {
                        if (segundo == averiasProgram[i][a])
                        {
                            cadena.provocarAveria();
                            System.out.println("  ** Averia en cadena " + (i + 1) + " **");
                            cadena.iniciarReparacion(mecEstandar.getTiempoReparacion());
                            mecEstandar.registrarReparaciones();
                            System.out.println("  -> Mecanico estandar asignado");
                        }
                    }
                }

                // Procesar reparacion
                if (cadena.estaAveriada())
                {
                    boolean reparada = cadena.avanzarReparacion();
                    if (reparada)
                    {
                        System.out.println("  Cadena " + (i + 1) + ": reparacion completada.");
                    }
                    todasCompletas = false;
                }
                else if (cadena.estaFuncionando())
                {
                    boolean completado = cadena.avanzarTiempo();
                    if (completado)
                    {
                        System.out.println("Cadena " + (i + 1) + ": vehiculo completado!");
                        almacen.addVehiculosFabricados(cadena.getVehiculo());
                    }
                    todasCompletas = false;
                }
            }

            dashboard.mostrarConsolidado();
        }

        System.out.println("=== Simulacion Muy Compleja finalizada ===");
    }
}