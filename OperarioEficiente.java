
/**
 * Write a description of class Eficiente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OperarioEficiente extends Operario
{
    public OperarioEficiente(String nombres, String apellidos, String dni, String direccion, String numSegSec,
                        String puesto, double salario, String fechaIngreso, int montajesPieza)
    {
        super(nombres, apellidos, dni, direccion, numSegSec, puesto, salario,
                fechaIngreso, montajesPieza);    
    }
    
    public int getTiempoTarea()
    {
        return 1;
    }
    
    public String toString()
    {
        return "Operario Eficiente [" + super.toString() + "]";
    }
    
    
}