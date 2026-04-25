
/**
 * Administrador del sistema: vela por el correcto funcionamiento del software.
 * Ante un apagon, restaura el sistema de gestion (2 seg) y las cadenas de montaje (3 seg).
 *
 * Nivel 3 IMPLEMENTADO: getTiempoRestaurarGestion() y getTiempoRestaurarCadenas() son llamados
 * directamente por Planificador.ejecutarMuyCompleja() para gestionar la caida de luz.
 *
 * @author Yan Condori
 */
public class AdminSistema extends Trabajador
{
    public AdminSistema(String nombres, String apellidos, String dni, String direccion, String numSegSec,
                        String puesto, double salario, String fechaIngreso)
    {
        super(nombres, apellidos, dni, direccion, numSegSec, puesto, salario,fechaIngreso);
    }
    
    public int getTiempoRestaurarGestion()
    {
        return 2; // se necesitan 2 segundos para restaurar el sistema de gestion de la fabrica 
    }
    
    public int getTiempoRestaurarCadenas()
    {
        return 3; // se necesitan 3 segundos para restaurar cadenas de montaje
    }
    
    public String toString()
    {
        return "Administrador Sistema [" + super.toString() + "]";
    }
}