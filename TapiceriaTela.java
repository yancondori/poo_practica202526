
/**
 * Tapiceria de tela. Hereda color y metrosCuadrados de Tapiceria.
 *
 * @author Yan Condori
 */
public class TapiceriaTela extends Tapiceria
{
    public TapiceriaTela(String color, double metrosCuadrados)
    {
        super(color, metrosCuadrados);
    }
    
    public String toString()
    {
        return "TapiceriaTela [" + super.toString() + "]";
    }
}