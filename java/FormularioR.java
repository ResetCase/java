import javax.swing.*;
import java.awt.event.*;

public class FormularioR extends JFrame implements ActionListener {

	private JLabel label1;
	private JLabel  label2;	
	JButton boton1;

   public FormularioR(){

  	setLayout(null);

	label1=new JLabel("Interface Grafica.  -->Emperator <--");
	label1.setBounds(10,20,300,30);
	add(label1);
	label2=new JLabel("Version 0.0.1.1");
	label2.setBounds(10,100,100,30);
	add(label2);


	setLayout(null);
	boton1=new JButton("Cerrar");
	boton1.setBounds(300,250,100,30);
	add(boton1);
	boton1.addActionListener(this);
		}

	public void actionPerformed(ActionEvent e){
  		if (e.getSource() == boton1){
			System.exit(0);
				}	
		}

public static void main (String args[]) {


	FormularioR formulario1=new FormularioR();
	formulario1.setBounds(0,0,450,350);
	formulario1.setVisible(true);
	formulario1.setResizable(false);
	formulario1.setLocationRelativeTo(null);
	}
}
