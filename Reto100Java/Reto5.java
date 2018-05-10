// 
import javax.swing.*;
public class Reto5 
{
	public static void main (String args[])
	{	
 		String[] Texto= new String[9];
			for (int i=0; i<9;i++)
			{ Texto[i]=JOptionPane.showInputDialog("Ingresa el texto" + (i+1) );	}

			for (String elemento:Texto)
			{ System.out.println("El Texto ingresado es: "+elemento);	}
 	}
}
