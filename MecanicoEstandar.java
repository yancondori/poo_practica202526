import java.util.Random;
/**
 * Write a description of class Estandar here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        return rand.nextInt(4) + 2; // numero aleatorio entre 1 y 5 
        // en parametro "n" en rand.nextInt(n), es la frontera superior, si es n = 6, daria de 0,1,2,3,4,5,
        // nunca se mostraria n.
    }
    
    public String toString()
    {
        return "Mecanico Estandar [" + super.toString() + "]";
    }
}   