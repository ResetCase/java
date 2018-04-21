class Bicyledemo {
public static void main (string[] args) {
//Create two different
//Bicycle objects
Bicycle bike1 =new Bicycle();
Bicycle bike2= new Bicycle();

//invoke methods on
// those objects
bike1.changeCadence(50);
bike.speedup(10);
bike1.printstates();

bike2.changeCadence(50);
bike2.speedup(10);
bike2.changeGear(2);
bike2.changeCadence(40);
bike2.speedUp(10);
bike2.chageGear(3);
bike2.prinStates();
}
}
the output of this test prints the ending pedal cadence, speed and gear for the two bicycles

cadence:50 speed:10 gear:2
cadence:40 speed:20 gear:3
