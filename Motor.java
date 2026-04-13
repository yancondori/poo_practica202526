
/**
 * Clase abstracta raiz de la jerarquia de motores.
 * Solo contiene potencia como atributo comun a todos los motores.
 *
 * Asuncion de diseño: cilindrada y numCilindros solo se aplican a motores de combustion,
 * por eso se ubican en la subclase MotorCombustion y no aqui.
 * MotorElectrico hereda directamente de Motor (solo potencia).
 *
 * @author Yan Condori
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