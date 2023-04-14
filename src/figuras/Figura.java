
package figuras;
import java.awt.Color;

/**
 * Clase en la que se almacenarán los distintos elementos de una figura, 
 * también sirve para calcular el perímetro y el área de la figura y para 
 * @author ALUMNO
 * @since 11/04/2023
 */

public abstract class Figura{
	/*variable centro numerica*/
private Punto centro;
	/*variable color String*/
private Color color;

/**
 * Constructor para generar una figura con sus distintos parámetros
 * @param x: Determina la posición del centro de la figura en el eje de abscisas
 * @param y: Determina la posición del centro de la figura en el eje de ordenadas
 * @param color: Determina el color de la figura
 */
public Figura(double x, double y, Color color){
centro = new Punto (x, y);
this.color = color;
}

/**
 * Gets the X of the Centro
 * @return the X of the Centro
 */
public double getXCentro(){
return centro.getX();
}

/**
 * Gets the Y of the Centro
 * @return the Y of the Centro
 */
public double getYCentro(){
return centro.getY();
}

/**
 * Gets the color of the Color
 * @return the color of the color
 */
public Color getColor(){
return color;
}

/**
 * Sets the x
 * @param x the x to set
 */
public void setXCentro(double x){
centro.setX (x);
}

/**
 * Sets the Y
 * @param y the y to set
 */
public void setYCentro(double y){
centro.setY (y);
}

/**
 * Sets the color
 * @param color
 */
public void setColor(Color color){
this.color = color;
}

/**
 * Devuelve el valor del perimetro dependiendo de la figura en la que se utilize este método
 * @return variable con el valor del perimetro
 */
public abstract double perimetro();  

/**
 * Devuelve el valor del area dependiendo de la figura en la que se utilize este método
 * @return variable con el valor del area
 */
public abstract double area();  

/**
 * Metodo que nos va a comunicar si el area es mayor, menor o igual que el de otra
 * @param otraFigura: Importamos otra figura para compararla
 * @return valores numéricos que nos indicarán si nuestra figura es mayor, menor o igual que la comparada
 */
public int esMayorQue (Figura otraFigura) {
	   if (this.area() > otraFigura.area())
		   return 1;
	   else
		   if (this.area() < otraFigura.area())
			   return -1;
		   else
			   return 0;
	}

}
