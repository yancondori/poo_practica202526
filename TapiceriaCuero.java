
/**
 * Write a description of class TapiceriaCuero here.
 *
 * @author (your name)
 * @version (a version number or a date)
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