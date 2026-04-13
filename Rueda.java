
/**
 * Clase abstracta base de la jerarquia de ruedas.
 * Atributos: ancho (mm), diametro de llanta (pulgadas), indice de carga (kg),
 * codigo de velocidad (km/h).
 * Subclases concretas: RuedaNormal, RuedaDeportiva, RuedaTodoT.
 *
 * @author Yan Condori
 */
public abstract class Rueda
{
    private int ancho;
    private double diametro;
    private int carga;
    private int codigo;
    
    public Rueda(int ancho, double diametro, int carga, int codigo)
    {
        this.ancho = ancho;
        this.diametro = diametro;
        this.carga = carga;
        this.codigo = codigo;
    }
    
    public int getAncho()
    {
        return ancho;
    }
    
    public void setAncho(int ancho)
    {
        this.ancho = ancho;
    }
    
    public double getDiametro()
    {
        return diametro;
    }

    public void setDiametro(double diametro)
    {
        this.diametro = diametro;
    }
    
    public int getCarga()
    {
        return carga;
    }
    
    public void setCarga(int carga)
    {
        this.carga = carga;
    }
    
    public int getCodigo()
    {
        return codigo;
    }
    
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    
    public String toString()
    {
        return "Rueda: ancho=" + ancho + "mm, diametro=" + diametro
        + "pulg, carga=" + carga + "kg, velocidad=" + codigo + "km/h";
    }
    
}