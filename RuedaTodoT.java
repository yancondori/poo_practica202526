
/**
 * Write a description of class RuedaTodot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RuedaTodoT extends Rueda
{
    public RuedaTodoT(int ancho, double diametro, int carga, int codigo)
    {
        super(ancho, diametro, carga, codigo);
    }
    
    public String toString()
    {
        return "Rueda TodoTerreno [" + super.toString() + "]";
    }
}