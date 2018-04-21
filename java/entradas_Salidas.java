/* Entrada y Salida de datos Formato resultado */


// Clases scanner

/* esta clase tiene 3 metodos [No Es estatico] 
 nextLine() linea de textos
nextInt() Numeros enteros
nextdouble() Numeros decimales
*/

/* clase JOptionPane
Es un metodo estatico */

import java.util.*;

public class Entrada1 {

public static void main[(String[] args) {

Scanner entrada=new Scanner (System.in);

System.out.println("Introduce tu nombre, por favor");
String nombre_usuario=entrada.nextLine();
System.out.println ("Introduce edad, por fvor");
int edad= entrada.nextInt();
System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad+1) + "años");
}
}

