
/**
 * Motor electrico. Hereda directamente de Motor (solo potencia).
 * No tiene cilindrada ni numCilindros ya que no es un motor de combustion.
 *
 * @author Yan Condori
 */
public class MotorElectrico extends Motor
{
    // private double cilindrada;
    // private int numCilindros;
    
    public MotorElectrico(double potencia)
    {
        super(potencia); // no se consideran campos como cilidrada y numcilindros
    }
    
    
    public String toString()
    {
        return " MotorElectrico [" + super.toString() + "]";   
    }
        
            
}