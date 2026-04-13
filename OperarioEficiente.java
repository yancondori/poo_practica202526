
/**
 * Operario eficiente: ha realizado mas de 10 montajes de piezas.
 * Completa cada tarea en 1 segundo (getTiempoTarea() retorna 1).
 *
 * @author Yan Condori
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