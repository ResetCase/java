import javax.swing.JOptionPane;

public class Ejer1 {
	public static void main(String[] args){
int num;
num=Integer.parseInt(JOptionPane.showInputDialog(" Digite un numero : "));

if (num%10==0){
JOptionPane.showMessageDialog(null," El numero  "+num + " es multipo de 10");
}else {
 JOptionPane.showMessageDialog(null, " EL  nomero no es multiplo de  10");
}
}
}
