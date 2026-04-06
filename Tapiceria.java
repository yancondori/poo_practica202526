
/**
 * Write a description of class Taoiceria here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        return "color =" + color + "metros cuadrados =" + metrosCuadrados;
     }
}

