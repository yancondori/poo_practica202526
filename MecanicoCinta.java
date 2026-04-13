
/**
 * Clase abstracta intermedia para los mecanicos de cinta.
 * Añade numReparaciones (experiencia) y el metodo abstracto getTiempoReparacion().
 * Subclases: MecanicoEfectivo (>20 reparaciones, 1 seg) y MecanicoEstandar (<=20, 2-5 seg).
 *
 * Nivel 3: los mecanicos intervienen en la simulacion Compleja y MuyCompleja.
 *
 * @author Yan Condori
 */
public abstract class MecanicoCinta extends Trabajador
{
    private int numReparaciones;
    public MecanicoCinta(String nombres, String apellidos, String dni, String direccion, String numSegSec,
                    String puesto, double salario, String fechaIngreso, int numReparaciones)
    {
        super(nombres, apellidos, dni, direccion, numSegSec, puesto, salario, fechaIngreso);
        this.numReparaciones = numReparaciones; // FIELD name numReparaciones (this.numReparaciones) 
                                                //= PARAMETER named potencia (int numReparaciones)
    }
    
    public int getNumReparaciones()
    {
        return numReparaciones;
    }
    
    public void registrarReparaciones()
    {
        numReparaciones++;
    }
    
    public abstract int getTiempoReparacion();
    
    public String toString()
    {
        return "Mecanico [" + super.toString() + ", reparaciones =" + numReparaciones +  "]";
    }

}