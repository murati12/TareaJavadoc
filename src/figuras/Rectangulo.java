package figuras;

import java.awt.Color;

/**
 * Representa un objeto de tipo Rectangulo que extiende de la clase Figura
 * @author ALUMNO
 * @since 11/04/2023
 */

public class Rectangulo extends Figura{
private double base;
private double altura;

/**
 * Constructor con parametros para el rectangulo
 * @param x representa la posicion del centro del rectangulo en el eje de abscisas
 * @param y representa la posicion del centro del rectangulo en el eje de ordenadas
 * @param color representa el color del rectangulo
 * @param base representa el valor numerico de la base del rectangulo
 * @param altura representa el valor numerico de la altura del rectangulo
 */

public Rectangulo (double x, double y, Color color, double base, double altura){
super (x, y, color);
this.base = base;
this.altura = altura;
}

/**
 * Gets the base of the Base
 * @return the vase of the Base
 */
public double getBase(){
return base;
}

/**
 * gets the altura of the Altura
 * @return the altura of the Altura
 */

public double getAltura(){
return altura;
}

/**
 * sets the base
 * @param base the base to set
 */

public void setBase(double base){
this.base = base;
}

/**
 * sets the altura
 * @param altura the altura to set
 */

public void setAltura(double altura){
this.altura = altura;
}

/**
 * Metodo para calcular el perímetro del rectángulo
 * @return valor del perimetro
 */

public double perimetro (){
   return 2 * base + 2 * altura;
}

/**
 * Metodo para calcular el area del rectangulo
 * @return valor del area
 */

public double area (){ 
   return base * altura;
}
}
