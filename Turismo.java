
/**
 * Write a description of class Turismo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Turismo extends Vehiculo
{
    public Turismo(String color, int numPlaza, double tara, double pesoMax, Motor motor, 
                    Tapiceria tapiceria, Rueda rueda)
    {
         super(color, numPlaza, tara, pesoMax, motor, tapiceria, rueda);   
    }
    
    public String toString()
    {
        return "Deportivo [" + super.toString() + "]";// se invoca el super toString de Vehiculo
    }
}