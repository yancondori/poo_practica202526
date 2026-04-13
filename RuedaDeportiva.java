
/**
 * Rueda de tipo deportiva. Hereda todos los atributos de Rueda.
 *
 * @author Yan Condori
 */
public class RuedaDeportiva extends Rueda
{
    public RuedaDeportiva(int ancho, double diametro, int carga, int codigo)
    {
        super(ancho, diametro, carga, codigo);
    }
    
    public String toString()
    {
        return "Rueda Deportiva [" + super.toString() + "]";
    }
}