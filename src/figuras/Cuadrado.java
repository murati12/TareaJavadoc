package figuras;

import java.awt.Color;

/** 
 * Representa un objeto de tipo Cuadrado que extiende de la clase Rectangulo.
 * @author ALUMNO
 * @extends Rectangulo
 * @since 11/04/2023
 */

public class Cuadrado extends Rectangulo{

/**
 * Constructor para crear un cuadrado
 * @param x: Indica la posicion en el eje abscisas del centro del cuadrado
 * @param y: Indica la posicion en el eje de ordenadas del centro del cuadrado
 * @param color: determina el color que tendrá el cuadrado
 * @param lado: determinará la longitud de los lados del cuadrado
 * 
 */

public Cuadrado (double x, double y, Color color, double lado){
super (x, y, color, lado, lado);
}
}
