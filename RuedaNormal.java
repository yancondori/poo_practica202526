
/**
 * Write a description of class RuedaNormal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RuedaNormal extends Rueda
{
    public RuedaNormal(int ancho, double diametro, int carga, int codigo)
    {
        super(ancho, diametro, carga, codigo);
    }
    
    public String toString()
    {
        return "Rueda Normal [" + super.toString() + "]";
    }

}