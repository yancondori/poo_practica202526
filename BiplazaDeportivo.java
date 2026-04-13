
/**
 * Clase concreta que representa un vehiculo de tipo Biplaza Deportivo.
 * Hereda todos los atributos de Vehiculo sin añadir campos propios.
 *
 * @author Yan Condori
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