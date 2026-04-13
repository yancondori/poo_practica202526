
/**
 * Gestor de planta: monitoriza las cadenas de montaje y configura los componentes.
 * Es el encargado de consultar el dashboard y llamar a los mecanicos cuando hay averias.
 * No añade campos propios — hereda directamente de Trabajador.
 *
 * <!-- TODO Nivel 3: implementar logica de monitoreo y llamada a mecanicos -->
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