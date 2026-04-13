
/**
 * Mecanico efectivo: ha realizado mas de 20 reparaciones.
 * Repara cualquier problema en 1 segundo (getTiempoReparacion() retorna 1).
 *
 * @author Yan Condori
 */
public class MecanicoEfectivo extends MecanicoCinta
{
    public MecanicoEfectivo(String nombres, String apellidos, String dni, String direccion, String numSegSec,
                        String puesto, double salario, String fechaIngreso, int numReparaciones)
    {
        super(nombres, apellidos, dni, direccion, numSegSec, puesto, salario,
                fechaIngreso, numReparaciones);
    }
    
    public int getTiempoReparacion()
    {
        return 1;
    }
    
    public String toString()
    {
        return "Mecanico Efectivo [" + super.toString() + "]";
    }
}