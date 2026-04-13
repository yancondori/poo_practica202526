
/**
 * Enum que define los 4 estados secuenciales de un vehiculo en la cadena de montaje.
 * El ordinal (CHASIS=0, MOTOR=1, TAPICERIA=2, RUEDAS=3) se usa como indice
 * para mapear cada estado al operario correspondiente en CadenaMontaje.
 *
 * @author Yan Condori
 */
public enum EstadoMontaje
{
    CHASIS, MOTOR, TAPICERIA, RUEDAS
}