
/**
 * Write a description of class MotorGasolina here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MotorGasolina extends MotorCombustion
{
    public MotorGasolina(double potencia, double cilindrada, int numCilindros)
    {
        super(potencia, cilindrada, numCilindros); // invoco los campos heredados en Motor 
        //y MotorCombustion
    }    
    public String toString()
    {
            return "MotorGasolina [" + super.toString() + "]";
    }
    
    /**
     * Aqui no es necesario setters ni getter porque no hay ningua decalracion de campos , solo hay
     * INVOCACION DE HERERENCIA con super
     */

}