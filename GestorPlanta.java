
/**
 * Gestor de planta: monitoriza las cadenas de montaje y configura los componentes.
 * Es el encargado de consultar el dashboard y llamar a los mecanicos cuando hay averias.
 * No añade campos propios — hereda directamente de Trabajador.
 *
 * GestorPlanta No requiere logica activa: el Planificador gestiona directamente el monitoreo y los mecanicos.
 * Esta clase existe para representar el rol en el almacen, no para intervenir en la simulacion.
 *
 * @author Yan Condori
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