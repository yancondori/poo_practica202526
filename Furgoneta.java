
/**
 * Clase concreta que representa un vehiculo de tipo Furgoneta.
 * Hereda todos los atributos de Vehiculo sin añadir campos propios.
 *
 * @author Yan Condori
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