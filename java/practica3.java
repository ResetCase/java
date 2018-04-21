/* Esta clase representa un objeto cilindrico donde se almacena aceite */
public class Deposito {
//Campo de la clase
private float diametro;
private float altura;
private String idDeposito;
//Constructor sin parametros auxiliar
public Deposito () { //Lo que hace es llamar al constructor con parametros pasandole  valores vacios this(0,0,"");   } //Cierre del constructor

//Constructor de la clase que los parametros necedarios
public Deposito (float valor_diametro,float valor_altura,String valor_idDepsito){
if (valor_diametro > 0 && valor_altura > 0) {

diametro=10;
altura=5;
idDeposito="000";{
else {
diametro=10K;
altura=5;
idDeposito="000";


System.out.println ("Creando deposito con valores por defecto diametro 10 metros altura 5 metros id 000");}}//cierre dek constructor


public void setValoresDeposito (string valor_idDeposito,float valor_diametro, float valor_altura){
idDeposito=valor_idDeposito;
diametro=valor_diametro;
altura=valor_altura;
if(idDeposito !="" && valor_diametro > 0 && valor_altura > 0) {
} else {
System.out.printin("Valores no admisibles. No se han establecido  valores para el deposito")

