
/**
 * Write a description of class RuedaDeportiva here.
 *
 * @author (your name)
 * @version (a version number or a date)
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