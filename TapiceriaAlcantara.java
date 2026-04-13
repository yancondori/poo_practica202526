
/**
 * Tapiceria de alcantara. Hereda color y metrosCuadrados de Tapiceria.
 *
 * @author Yan Condori
 */
public class TapiceriaAlcantara extends Tapiceria
{
    public TapiceriaAlcantara(String color, double metrosCuadrados)
    {
        super(color, metrosCuadrados);
    }
    
    public String toString()
    {
        return "TapiceriaAlcantara [" + super.toString() + "]";
    }
}