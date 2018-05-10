import java.util.Scanner;


public class Reto1{

public static void main(String[] args){
Scanner entrada=new Scanner(System.in);
int num1;
int num2;

System.out.print(" Ingrese el primer numero: ");
num1=entrada.nextInt();
System.out.print(" Ingrese el segundo numero");
num2=entrada.nextInt();
if (num1 == num2)
System.out.print("%d == %d\n", num1, num2);
if (num1 != num2)
System.out.print("%d == %d\n", num1, num2);
if (num1 < num2)
System.out.print("%d == %d\n", num1, num2);
if (num1 > num2)
System.out.print("%d == %d\n", num1, num2);
if (num1 <= num2)
System.out.print("%d == %d\n", num1, num2);
if (num1 >= num2)
System.out.print("%d == %d\n", num1, num2);
}
}
