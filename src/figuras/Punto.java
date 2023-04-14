package figuras;
/**
 * Representa un objeto de tipo Punto
 * @author ALUMNO
 * @since 11/04/2023
 */
public class Punto {
private double x;
private double y;

/**
 * Constructor vacío para un punto
 */
public Punto(){
x = 0;
y= 0;
}

/**
 * Constructor con parámetros para un punto
 * @param x: Coordenadas para el punto en el eje de abscisas
 * @param y: Coordenadas para el punto en el eje de ordenadas
 */
public Punto(double x, double y){
this.x = x;
this.y = y;
}

/**
 * Constuctor para un punto desde otro punto
 * @param p: punto externo
 */
public Punto(Punto p){
x = p.x;
y = p.y;
}

/**
 * gets the x of the X
 * @return the x of the X
 */

public double getX(){
return x;
}

/**
 * gets the y of the Y
 * @return the y of the Y
 */

public double getY(){
return y;
}

/**
 * sets the x
 * @param x the x to set
 */

public void setX(double x){
this.x = x;
}

/**
 * sets the y
 * @param y the y to set
 */

public void setY(double y){
this.y = y;
}

/**
 * Metodo que nos devolverá el valor de la distancia entre dos puntos
 * @param p: punto externo
 * @return valor de la distancia entre dos puntos
 */

public double distancia(Punto p){
return Math.sqrt (Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
}

/**
 * Metodo que nos devolvera un punto simetrico a nuestro punto
 * @return nuevo punto simetrico a nuestro punto
 */

public Punto simetrico(){
Punto nuevoP = new Punto (this.x * -1, this.y);	
return nuevoP ;
}

/**
 * Metodo que nos compara dos puntos y nos muestra si son identicos o no
 * @param p: punto externo
 * @return booleano que nos dirá si los puntos son iguales o no
 */

public boolean compara(Punto p){
if (p.x == x && p.y == y)
   return true;
else
   return false;
}


/**
 * Método que transformara a String los datos de la posicion del punto
 * @return posicion del punto p en cadena de caracteres
 */
public String toString() {
	return "(" + getX() + "," + getY() + ")";
}
}
