package figuras;

import java.awt.Color;

/**
 * Representa un objeto de tipo Triangulo que extiende de la clase Figura
 * @author ALUMNO
 * @since 11/04/2023
 */

public class Triangulo extends Figura{
	/*variable privada que almacena el valor del lado1 del triangulo*/
private double lado1;
	/*variable privada que almacena el valor del lado2 del triangulo*/
private double lado2;
	/*variable privada que almacena el valor del lado3 del triangulo*/
private double lado3;

/**
 * Constructor del triangulo pasandole parametros
 * @param x: determina la posicion del centro del triangulo en el eje de abscisas
 * @param y: determina la posicion del centro del triangulo en el eje de ordenadas
 * @param color: determina el color del triangulo
 * @param lado1: determina la longitud del lado 1 del triangulo
 * @param lado2: determina la longitud del lado 2 del triangulo
 * @param lado3: determina la longitud del lado 3 del triangulo
 */

public Triangulo(double x, double y, Color color, double lado1, double lado2, double lado3){
super (x, y, color);
this.lado1 = lado1;
this.lado2 = lado2;
this.lado3 = lado3;
}

/**
 * Gets the lado1 of the Lado1
 * @return the lado1 of the Lado1
 */

public double getLado1(){
return lado1;
}

/**
 * gets the lado2 of the Lado2
 * @return the lado2 of the Lado2
 */

public double getLado2(){
return lado2;
}

/**
 * gets the lado 3 of the Lado3
 * @return the lado3 of the Lado3
 */

public double getLado3(){
return lado3;
}

/**
 * Sets lado1
 * @param lado1 the lado1 to set
 */

public void setLado1(double lado1){
this.lado1 = lado1;
}

/**
 * sets lado2
 * @param lado2 the lado2 to set
 */

public void setLado2(double lado2){
this.lado2 = lado2;
}

/**
 * sets lado3
 * @param lado3 the lado3 to set
 */

public void setLado3(double lado3){
this.lado3 = lado3;
}

/**
 * Metodo que calcula el perimetro del triangulo
 * @return el valor numerico de la suma de todos los lados del triangulo
 */

public double perimetro (){
   return lado1 + lado2 + lado3;
}

/**
 * Metodo que calcula el area del triangulo
 * @return el valor numerico del calculo del area del triangulo
 */

public double area (){ 
   double sp = perimetro() / 2;
   return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3)); 
}
}
