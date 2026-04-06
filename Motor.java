
/**
 * Write a description of class Motor here.
 *
 * @author Yan Condori
 * @version (a version number or a date)
 */
public abstract class Motor // abstract como generador de las demas clases
{
     private double potencia;
     
     public Motor(double potencia)
     {
         this.potencia = potencia; // FIELD name potencia (this.potencia) = PARAMETER named potencia (double potencia)
     }

     public double getPotencia()
     {
         return potencia;
     }
     
     public void setPotencia(double potencia) // se tiene que colocar el parametro dentro
     // para que no haga referencia asi mismo,
     {
          this.potencia = potencia;   
     }
     
     public String toString()
     {
         return "Motor: potencia=" + potencia;
     }
}