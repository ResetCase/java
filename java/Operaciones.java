public class Operaciones{
	public static void main (String args[]){

	int operacion=3;
	int	numero_uno=8;
	int numero_dos=4;
	int resultado=0;

	if (operacion==1){

	resultado = numero_uno +numero_dos;
	System.out.println("El resultado de la suma es: "+ resultado);

} else if(operacion==2){
 	resultado=numero_uno - numero_dos;
	System.out.println("El resultaddo de la resta es: "+ resultado);

}else if (operacion==3){
	resultado=numero_uno*numero_dos;
	System.out.println("El resultado de la multiplicacion es :" + operacion);

}else if (operacion==4){
	resultado=numero_uno/numero_dos;
	System.out.println("El resultado de la division es: "+ operacion);

}else {
	System.out.println("Opcion invalida");
}
}
}


