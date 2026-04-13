
/**
 * Clase concreta que representa un vehiculo de tipo Turismo.
 * Hereda de Vehiculo todos sus atributos (color, plazas, tara, pesoMax, motor, tapiceria, rueda).
 * No añade campos propios — su rol es identificar el tipo de vehiculo en la jerarquia.
 *
 * @author Yan Condori
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
        return "Turismo [" + super.toString() + "]"; // FIX: antes decia "Deportivo" por error de copy-paste
    }
}