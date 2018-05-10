import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormularioTO extends JFrame implements ActionListener {

private JMenuBar menu bar;
private JMenu menu1;
private JMenuItem menuitem1, menuitem2, menuitem3;

public FormularioTO(){
setLayout(null);
menubar=new JMenuBar();
setJMenuBar(menubar);

menu1=new JMenu("Opciones");
menubar.add(menu1);

menuitem1=new JMenuItem("Rojo");
menuitem1.addActionListener(this);
menu1 .add(menuitem1);

menuitem2= new JMenuItem("Verde");
menuitem2.addActionListener(this);
menu1.add(menuitem2);

menuitem3= new JMenuItem("Azul");
menuitem3.addActionListener(this);
menu1.add(menuitem3);
}

public void actionPerformed(ActionEventet e){
	Container fondo= this.getContentPane();
	
if(e.getSource == menuitem1){
	fondo.setBackground(new Color(255,0,0) );
}
if(e.getSource == menuitem2){
	fondo.setBackground(new Color(0,255,0) );
}
if(e.getSource == menuitem3){
	fondo.setBackground(new Color(0,0,255) );
}
}
	public static void main (String args[]){
FormularioTO formulario= new FormularioTO();
formulario1.setBound(0,0,350,200);
formulario1.setVisible(true);
formulario1.setResizable(false);
formulario.setLocationRelativeTo(null);

}
}
