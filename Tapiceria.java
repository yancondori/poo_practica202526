
/**
 * Clase abstracta base de la jerarquia de tapicerias.
 * Atributos comunes: color y metrosCuadrados.
 * Subclases concretas: TapiceriaCuero, TapiceriaAlcantara, TapiceriaTela.
 *
 * @author Yan Condori
 */
public abstract class Tapiceria
{
    private String color;
    private double metrosCuadrados; // atributos de la tapiceria
    
    public Tapiceria(String color, double metrosCuadrados)
    {
        this.color = color;
        this.metrosCuadrados = metrosCuadrados;
    }
    
     public String getColor()
     {
         return color;
     }
     
     public void setColor(String color)
     {
         this.color = color;
     }
     
     public double getMetrosCuadrados()
     {
         return metrosCuadrados;
     }
     
     public void setMetrosCuadrados(double metrosCuadrados)
     {
         this.metrosCuadrados = metrosCuadrados;
     }
     
     public String toString()
     {
        return "color=" + color + ", metrosCuadrados=" + metrosCuadrados;
     }
}

