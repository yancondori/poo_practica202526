//import java.util.Date;
//import java.time.LocalDateTime; elegire usar String para las FECHAS

/**
 * clase abstracta - generiaca que es la raiz de la jerarquia de trabajadores de la fabrica
 * Almacena los datos personales comunes a todos los perfiles:
 * nombres, apellidos, DI, direccion, numSegSoc, puesto, salario, fechaIngreso.
 *
 * Supuesto: las fechas se almacenan como String (decision del curso, no se usa Date/LocalDateTime).
 *
 * Subclases directas: Operario, MecanicoCinta, GestorPlanta, AdminSistema.
 *
 * @author Yan Condori
 */
public abstract class Trabajador
{
    private String nombres;
    private String apellidos;
    private String dni;
    private String direccion;
    private String numSegSoc; // utilizare String en lugar de int, 
    //las campos siempre empiezan con lower case
    private String puesto;
    private double salario;
    private String fechaIngreso; // utilzo String en lugar de Date
     
    
    public Trabajador(String nombres, String apellidos, String dni, String direccion,
                        String numSegSoc, String puesto, double salario, String fechaIngreso)
    {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.numSegSoc = numSegSoc;
        this.puesto = puesto;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    
    }
    
    public String getNombres()
    {
        return nombres;
    }
    
    public void setNombres(String nombres)
    {
        this.nombres = nombres;
    }
    
    public String getApellidos()
    {
        return apellidos;
    }
    
    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }
    
    public String getDni()
    {
        return dni;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }
    
    public String getDireccion()
    {
        return direccion;
    }
    
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }
    
    public String getNumSegSoc()
    {
        return numSegSoc;
    }
    
    public void setNumSegSoc(String numSegSoc)
    {
        this.numSegSoc = numSegSoc;
    }
    
    public String getPuesto()
    {
        return puesto;
    }

    public void setPuesto(String puesto)
    {
        this.puesto = puesto;
    }

    public double getSalario()
    {
        return salario;
    }
    
    public void setSalario(double salario)
    {
        this.salario = salario;
    }
    
    public String getFechaIngreso()
    {
        return fechaIngreso;
    }
    
    public void setFechaIngreso(String fechaIngreso)
    {
        this.fechaIngreso = fechaIngreso;
    }
    
    public String toString()
    {
        return "Trabajador con nombres=" + nombres + " Apellidos=" + apellidos +
        " DNI=" + dni + " Direccion=" + direccion + " Numero de Seguridad Social=" + numSegSoc +
        " Puesto=" + puesto + " Salario=" + salario + " Fecha de Ingreso=" + fechaIngreso;
    }
}


/**
 * ## The camelCase Naming Cheat Sheet
```
numsegsoc       ← wrong (all lowercase, unreadable)
num_seg_soc     ← wrong (snake_case — that's Python, not Java)
NumSegSoc       ← wrong for fields/variables (starts with capital)
numSegSoc       ← correct for fields, params, local variables, methods
 */
