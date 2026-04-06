
/**
 * Write a description of class MotorCombustion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class  MotorCombustion extends Motor
{
    private double cilindrada;
    private int numCilindros;
    
    public MotorCombustion(double potencia, double cilindrada, int numCilindros)
    {
        super(potencia);
        this.cilindrada = cilindrada;// siempre usar this por el conflicto de los nombres
        //entre parametro y field, en el contructor
        this.numCilindros = numCilindros; 
    }
    
    public double getCilindrada()
    {
        return cilindrada;
    }
    
    public int getNumCilindros()
    {
        return numCilindros;
    }
    
    public String toString()
    {
        return super.toString() + ", cilindrada=" + cilindrada + 
        ", cilindros= " + numCilindros;
    }
 
    /**
     * no es necesario seguir la estrructura constructor - getter - setters
     * podemos omitir setters (serCilidrada , set numCilidros)porque ya fueron declarados en la clase padre Motor 
     */
    
}