import javax.swing.*;

public class FormulariosT extends JFrame{

public FormulariosT (){
	setLayout(null);
}

	public static void main(String args[]){
FormulariosT formulario1=new FormulariosT();
	formulario1.setBounds(350,100,400, 550);
formulario1.setVisible(true);

//reafirmamos la locacion y restringimos la interface. Con False
	formulario1.setLocationRelativeTo(null);
 	formulario1.setResizable(false);
}
}
