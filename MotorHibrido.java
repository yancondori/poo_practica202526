
/**
 * Motor hibrido. Hereda potencia, cilindrada y numCilindros de MotorCombustion.
 *
 * @author Yan Condori
 */
public class MotorHibrido extends MotorCombustion
{
 public MotorHibrido(double potencia, double cilindrada, int numCilindros)
 {
     super(potencia, cilindrada, numCilindros);
 }
 
 public String toString()
 {
     return "MotorHIbrido [" + super.toString() + "]";
 }
}