
/**
 * Write a description of class Furgoneta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Furgoneta extends Vehiculo
{
    public Furgoneta(String color, int numPlaza, double tara, double pesoMax, Motor motor, 
                    Tapiceria tapiceria, Rueda rueda)
    {
        super(color, numPlaza, tara, pesoMax, motor, tapiceria, rueda);
    }
    
    public String toString()
    {
        return "Furgoneta [" + super.toString() + "]";
    }
}