/* 
* Clase para las funciones logicas de una lavadora
*/
package llfunciones;
/**
* programacion en poo y encapsulacmiento
* @author Emperator
*/
public class llfunciones{
	private int kilos=0, llenandoCompleto=0, lavadoraCompleto=0, secadoCompleto=0;

	public llfunciones (int kilos, int TipoDeRopa){
this.kilos=kilos;
this.TipoDeRopa=TipoDeRopa;
}
private void Llenado(){
	if (kilos <= 12){
		llenandoCompleto=1;
System.out.println("Llenando .....");
System.out.println("Llenado Completo.");
}else {
	System.out.println("La carga de ropa es muy pesada, Reduce la carga porfavor")}
}
private void Lavado(){
	Llenando();
if(LlenadoCompleto==1){
if (TipoDeRopa ==1 ){
System.out.println("Ropa blanca / Lavando Suave");
System.out.println("Lavando ....");
LavadoCompleto=1;
}else if (TipoDeRopa==2){
	System.out.println("Ropa de color / lavando intenso");
System.out.println("Lavando .....");
lavandoCompleto=1;
}else{
System.out.println("El tipo de ropa no esta disponible");
System.out.println("Se lavara como ropa de color / Lavando intenso");
LavadoCompleto]=1;
}}
}
private void Secado(){
Lavado();
if (LavadoCompleto==1){
System.out.println("Secando.....");
SecandoCompleto=1;
}}
public void CicloFinalizado(){
Secado();
if (SecadoCompleto ==1){
System.out.println("Tu Ropa esta lista! ");
}}
}
