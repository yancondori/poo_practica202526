
/**
 * Write a description of class GestorPlanta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GestorPlanta extends Trabajador
{
    public GestorPlanta(String nombres, String apellidos, String dni, String direccion, String numSegSec,
                        String puesto, double salario, String fechaIngreso)
    {
        super(nombres, apellidos, dni, direccion, numSegSec, puesto, salario,fechaIngreso);
    }
    
    public String toString()
    {
        return "Gestor Planta [" + super.toString() + "]";
    }
}