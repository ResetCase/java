import javax.swing.JOptionPane;
/*************************************************
* Este es un programa deEjercicio, Y practica  *
* Teclado y programacion.                                  *
* @author : Emperator                                        *
*                                                                            *
**************************************************/
public class Ejer2{
	public static void main(String[] args){
int dia,mes,año;
dia= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia: "));
mes=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
año=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));

	if ((dia>=1) &&(dia<=30)){ //Si el Dia es correcto..
		if((mes>=1) && (mes <=12)){ //Si el Mes es correcto ...
			if ((año!=0)){
JOptionPane.showMessageDialog(null, " A ingresado Correctamete");
}
else { 
JOptionPane.showMessageDialog(null," fecha incorrrecta ");
} 
}
else{
JOptionPane.showMessageDialog(null,"La fecha es incorrecta");
}}
else {
JOptionPane.showMessageDialog(null,"La Fecha es Incorrecta ");
}
}
}
