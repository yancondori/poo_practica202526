
/**
 * Operario estandar: ha realizado 10 o menos montajes de piezas.
 * Necesita el triple de tiempo que el eficiente: 3 segundos por tarea.
 *
 * @author Yan Condori
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