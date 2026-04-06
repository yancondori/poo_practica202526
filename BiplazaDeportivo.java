
/**
 * Write a description of class BiplazaDeportivo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BiplazaDeportivo extends Vehiculo
{
    public BiplazaDeportivo(String color, int numPlaza, double tara, double pesoMax, 
                            Motor motor, Tapiceria tapiceria, Rueda rueda) // constructor
    {
        super(color, numPlaza, tara, pesoMax, motor, tapiceria, rueda);
    }
    
    public String toString()
    {
        return "Biplaza Deportivo [" + super.toString() + "]";
    }

}