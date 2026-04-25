
/**
 * Clase abstracta intermedia para motores de combustion (gasolina e hibrido).
 * Añade cilindrada y numCilindros que no aplican a motores electricos.
 *
 * @author Yan Condori
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
     * no es necesario seguir la estructura constructor - getter - setters
     * podemos omitir setters (serCilidrada , set numCilidros)porque ya fueron declarados en la clase padre Motor 
     */
    
}