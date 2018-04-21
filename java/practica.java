class Bicycle {
int cadence = 0;
int speed =0;
int gear =1;
void changeCadence (int newValue) {
cadence =newVslue;
}
void changeGear (int newValue){
gear=newValue;
}
void speedUp(inf increment) {
speed=speed+increment;
}
void applyBrakes(int decrement){
speed =speed - decrement;
}
void printStates(){
system.out.println[("cadence: " + cadence + " speed :" + speed +" gear:" + gear);
}
}
