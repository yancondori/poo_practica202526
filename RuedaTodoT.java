
/**
 * Rueda de tipo todoterreno. Hereda todos los atributos de Rueda.
 *
 * @author Yan Condori
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