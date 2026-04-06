
/**
 * Write a description of class Efectivo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MecanicoEfectivo extends MecanicoCinta
{
    public MecanicoEfectivo(String nombres, String apellidos, String dni, String direccion, String numSegSec,
                        String puesto, double salario, String fechaIngreso, int numReparaciones)
    {
        super(nombres, apellidos, dni, direccion, numSegSec, puesto, salario,
                fechaIngreso, numReparaciones);
    }
    
    public int getTiempoReparaciones()
    {
        return 1;
    }
    
    public String toString()
    {
        return "Mecanico Efectivo [" + super.toString() + "]";
    }
}