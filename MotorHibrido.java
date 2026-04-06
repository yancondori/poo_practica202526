
/**
 * Write a description of class MotorHibrido here.
 *
 * @author (your name)
 * @version (a version number or a date)
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