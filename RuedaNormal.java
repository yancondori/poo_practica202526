
/**
 * Rueda de tipo normal. Hereda todos los atributos de Rueda.
 *
 * @author Yan Condori
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