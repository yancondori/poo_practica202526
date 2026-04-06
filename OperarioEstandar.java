
/**
 * Write a description of class Estandar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OperarioEstandar extends Operario  
{
    public OperarioEstandar(String nombres, String apellidos, String dni, String direccion, String numSegSec,
                        String puesto, double salario, String fechaIngreso, int montajesPieza)
    {
        super(nombres, apellidos, dni, direccion, numSegSec, puesto, salario,
                fechaIngreso, montajesPieza);    
    }
    
    public int getTiempoTarea()
    {
        return 3; // el triple de tiempo en realizar una tarea
    }
    
    public String toString()
    {
        return "Operario Estandar [" + super.toString() + "]";
    }

}