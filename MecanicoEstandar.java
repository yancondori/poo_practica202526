import java.util.Random;
/**
 * Mecanico estandar: ha realizado 20 o menos reparaciones.
 * Tarda entre 2 y 5 segundos en reparar (aleatorio con Random).
 * Nivel 3 IMPLEMENTADO: usado en Planificador.ejecutarCompleja() y ejecutarMuyCompleja().
 *
 * @author Yan Condori
 */
public class MecanicoEstandar extends MecanicoCinta
{
    public MecanicoEstandar(String nombres, String apellidos, String dni, String direccion, String numSegSec,
                        String puesto, double salario, String fechaIngreso, int numReparaciones)
    {
        super(nombres, apellidos, dni, direccion, numSegSec, puesto, salario,
                fechaIngreso, numReparaciones);
    }
    
    public int getTiempoReparacion()
    {
        Random rand = new Random();
        return rand.nextInt(4) + 2; // numero aleatorio entre 2 y 5 (segun enunciado: de 2 a 5 segundos)
        // rand.nextInt(4) genera 0,1,2,3 → sumando 2 obtenemos 2,3,4,5
    }
    
    public String toString()
    {
        return "Mecanico Estandar [" + super.toString() + "]";
    }
}   