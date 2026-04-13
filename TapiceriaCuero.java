
/**
 * Tapiceria de cuero. Hereda color y metrosCuadrados de Tapiceria.
 *
 * @author Yan Condori
 */
public class TapiceriaCuero extends Tapiceria
{
    public TapiceriaCuero(String color, double metrosCuadrados)
    {
        super(color, metrosCuadrados);
    }
    
    public String toString()
    {
        return "Tapiceria Cuero [" + super.toString() + "]";
    }
}