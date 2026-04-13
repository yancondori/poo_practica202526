
/**
 * Motor de gasolina. Hereda potencia, cilindrada y numCilindros de MotorCombustion.
 *
 * @author Yan Condori
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