import javax.swing.*;
import java.awt.event.*;

public class FormularioA extends JFrame implements ActionListener{
	private JButton boton1,boton2, boton3;
private JLabel label1;

	public FormularioA (){
 setLayout(null);
boton1=new JButton("1");
boton1.setBounds(10,100,90,30);
	add(boto1);
boton1.addActionListener(this);
	
boton2=new JButton("2");
	boton2.setBounds(100,100,90,30);
	add(boton2);
boton2.addActionListener(this);

boton3=new JButton("3");
	boton3.setBounds(210,10,90,30);
	add(boton3);
	boton3.addActionListener(this);

label1= new JLabel("En espera .ñ.,-ñ.");
label1.setBounds(10,10,300,30);
add(label1);
}
public static void actionperformed(ActionEvent e){
	if (e.getSource()==boton1){
	label.setTex("Has precionado el boton 1 ");

} if (e.getSource()==boton2){
 	label1.setText(" Has precionado el boton 2 ");
} if(e.getSource()==boton3){
label1.setText(" Has precionado el boton 3");

}
}
	public static void main(String args[]){
		FormularioA formulario1=new FormularioA();
		formulario1.setBounds(0,0,350,200);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	
	
}
}

