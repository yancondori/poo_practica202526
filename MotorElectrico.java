
/**
 * Write a description of class MotorElectrico here.
 *
 * @author (your name)
 * @version (a version number or a date)
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