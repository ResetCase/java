import  java.util.Scanner;

	public class Matrices
{
	public static void main (String args[])
	{
int filas=0, columnas=0,contador=1;

Scanner entrada= new Scanner(System.in);

	System.out.println("Cuantas filas quieres");
	filas=entrada.nextInt();

	System.out.println ("Cuantas columnas quieres");
columnas= entrada.nextInt();

int numero [] [] =new int [filas] [columnas];

	for (int j=0; j <filas; j++)
{
		for (int i=0; i<columnas;i++)
{
numero [j] [i]=contador;
contador++;
System.out.print("[ "+ numero[j][i]+" ]");
} 
	System.out.println(" ");

}
}
	}
