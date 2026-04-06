
/**
 * Write a description of class Mecanico here.
 *
 * @author (your name)
 * @version (a version number or a date)
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