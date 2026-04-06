
/**
 * Write a description of class Vehiculo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Vehiculo
{
    private String color;
    private int numPlaza;
    private double tara;
    private double pesoMax;
    private Motor motor;
    private Tapiceria tapiceria;
    private Rueda rueda;
    
    public Vehiculo(String color, int numPlaza, double tara, double pesoMax, Motor motor, 
                    Tapiceria tapiceria, Rueda rueda)
    {
        this.color = color;
        this.numPlaza = numPlaza;
        this.tara = tara;
        this.pesoMax = pesoMax;
        this.motor = motor;
        this.tapiceria = tapiceria;
        this.rueda = rueda;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }

    public int getNumPlaza()
    {
        return numPlaza;
    }
    
    public void setNumPlaza(int numPlaza)
    {
        this.numPlaza = numPlaza;
    }
    
    public double getTara()
    {
        return tara;
    }
    
    public void setTara(double tara)
    {
        this.tara = tara;
    }
    
    public double getPesoMax()
    {
        return pesoMax;
    }
    
    public void setPesoMax(double pesoMax)
    {
        this.pesoMax = pesoMax;
    }
    
    public Motor getMotor()
    {
        return motor;
    }
    
    public void setMotor(Motor motor)
    {
        this.motor = motor;
    }
       
    public Tapiceria getTapiceria()
    {
        return tapiceria;
    }

    public void setTapiceria(Tapiceria tapiceria)
    {
        this.tapiceria = tapiceria;
    }

    public Rueda getRueda()
    {
        return rueda;
    }

    public void setRueda(Rueda rueda)
    {
        this.rueda = rueda;
    }

    public String toString()
    {
        //return "Motor= " + motor + "Tapiceria= " + tapiceria + "Rueda= " + rueda;
        // no es necesario colocar  "Motor= " porque se invoca autmaticamente a 
        // motor.toString() desde la clase Moto
        
        return "color=" + color + ", plazas=" + numPlaza + ", tara=" + tara
        + ", peso maximo=" + pesoMax + ", " + motor + ", " + tapiceria +
        ", " + rueda;
    }
       
}