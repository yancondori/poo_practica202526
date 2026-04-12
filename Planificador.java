import java.util.ArrayList;
import java.util.Random;
/**
 * Componente principal que hace funcionar las cadenas de montaje.
 * Se comporta como un reloj: cada segundo ejecuta una accion.
 * Implementa tres tipos de simulacion: Simple, Compleja, MuyCompleja.
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
     * Simulacion Simple (Nivel 2):No se produce ningun problema en las cintas.
     * Solo hay que considerar los tipos de operarios, seleccionados aleatoriamente.
     */
    
    public void ejecutarSimple()
    {
        System.out.print("==Simulacion Simple==");
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
     * Simulacion Compleja (Nivel 3):
     * Entran en juego los mecanicos.
     * Al menos uno de cada perfil debe reparar al menos 
     * dos problemas en cada cinta.
     */
    
    
       
}