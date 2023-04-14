package figuras;

import java.util.Scanner;
import java.awt.Color;

/**
 * Clase principal en la que operaremos para comprobar los métodos que hemos implementado en el resto de clases
 * @author ALUMNO
 *
 */
public class PruebaFigura {

/**
 * Método principal que nos permite crear objetos de diferentes figuras y calcular su área y perímetro a través de un menú interactivo
 * @param args
 */
public static void main(String[] args) {
	/*Variable que nos va a permitir seleccionar la accion que queremos realizar con nuestos distintos parametros de las figuras*/
int opcion;
Scanner teclado = new Scanner (System.in);

do { 
   opcion = mostrarMenu();
   if (opcion != 4){
      System.out.print ("Introduzca la coordenada x del centro: ");
      /*Variable que almacenara la cordenada x de l centro de la figura, introducida por el usuario*/
      double x = teclado.nextDouble();
      System.out.print ("Introduzca la coordenada y del centro: ");
      /*Variable que almacenara la cordenada y de l centro de la figura, introducida por el usuario*/
      double y = teclado.nextDouble();
   switch (opcion)
	   {  case 1:
	         System.out.print ("Introduzca el lado 1 del tri�ngulo: ");
	         /*En caso de que la figura sea un triángulo, esta variable almacenará el valor del lado 1 del triangulo, introducido por el usuario*/
        	 double lado1 = teclado.nextDouble();
	         System.out.print ("Introduzca el lado 2 del tri�ngulo: ");
	         /*En caso de que la figura sea un triángulo, esta variable almacenará el valor del lado 2 del triangulo, introducido por el usuario*/
        	 double lado2 = teclado.nextDouble();
        	 System.out.print ("Introduzca el lado 3 del tri�ngulo: ");
        	 /*En caso de que la figura sea un triángulo, esta variable almacenará el valor del lado 3 del triangulo, introducido por el usuario*/
        	 double lado3 = teclado.nextDouble();
        	 /*Creacion de un triángulo con los parámetros introducidos por el usuario*/
        	 Triangulo t = new Triangulo(x, y, Color.red, lado1, lado2, lado3);
        	 System.out.println ("El per�metro es " + t.perimetro());
        	 System.out.println ("El �rea es " + t.area());
        	 break;
         case 2:
	         System.out.print ("Introduzca la base del rect�ngulo: ");
	         /*En caso de que la figura sea un rectángulo, esta variable almacenará el valor de la base del rectángulo, introducida por el usuario*/
        	 double base = teclado.nextDouble();
	         System.out.print ("Introduzca la altura del rect�ngulo: ");
	         /*En caso de que la figura sea un rectángulo, esta variable almacenará el valor de la altura del rectángulo, introducida por el usuario*/
        	 double altura = teclado.nextDouble();
        	 /*Creacion de un rectángulo con los parámetros introducidos por el usuario*/
        	 Rectangulo r = new Rectangulo(x, y, Color.red, base, altura);
        	 System.out.println ("El per�metro es " + r.perimetro());
        	 System.out.println ("El �rea es " + r.area());
        	 break;
         case 3:
	         System.out.print ("Introduzca el lado del cuadrado: ");
	         /*En caso de que la figura sea un cuadrado, esta variable almacenará el valor del lado del cuadrado, introducido por el usuario*/
        	 double lado = teclado.nextDouble();
	         Cuadrado c = new Cuadrado(x, y, Color.red, lado);
	         System.out.println ("El per�metro es " + c.perimetro());
	         System.out.println ("El �rea es " + c.area());
	         break;
        }
   }
}while (opcion != 4); 
teclado.close();
}

/**
 * Metodo que nos permitirá mostrar al usuario un menú interactivo en el que seleciconará el tipo de figura con la que vamos a operar
 * @return opcionVariable, valor de la opcion seleccionada
 */
public static int mostrarMenu(){
	/*Variable numérica que almacenará el valor de la opción seleccionada por el usuario*/
int opcionVariable;
System.out.println ("1) Tri�ngulo");
System.out.println ("2) Rect�ngulo");
System.out.println ("3) Cuadrado");
System.out.println ("4) Salir");
Scanner teclado = new Scanner (System.in);
/*Codigo que pedira al usuario que seleccione la opcion deseada dentrod el menú por teclado*/
do {
    System.out.print ("Introduzca una opci�n (1-4): ");
    opcionVariable = teclado.nextInt();
    if (opcionVariable < 1 || opcionVariable > 4)
	   System.out.println ("Debe introducir un n�mero entre 1 y 4");
   } while (opcionVariable < 1 || opcionVariable > 4);
return opcionVariable;
}
}
