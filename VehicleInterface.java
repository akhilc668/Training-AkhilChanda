interface Vehicle{
 void cost();
 void milage();
 void capacity();
 void fuel();
}

abstract class Car {
 void viper(){
  System.out.println("Car has two vipers");
 }
 void doors(){
  System.out.println("Car has 4 doors");
 }
 Car(){
  System.out.println("In car constructor");
 }
 Car(String name){
  System.out.println("In car paramterized constructor");
  System.out.println("Car name is "+name);
 }
}

abstract class Bike{
 void stand(){
  System.out.println("Car has two stands");
 }
 Bike(){
  System.out.println("In Bike constructor");
 }
 Bike(String name){
  System.out.println("In Bike paramterized constructor");
  System.out.println("Bike name is "+name);
 }
}

class Audi extends Car implements Vehicle{
 public void cost(){
  System.out.println("Audi cost is: 50lakhs");
 }
 public void milage(){
  System.out.println("Audi milage is: 10km");
 }
 public void capacity(){
  System.out.println("Audi capacity is: 5");
 }
 public void fuel(){
  System.out.println("Audi fuel is: diesel");
 }
}

class BMW extends Car implements Vehicle{
 BMW(){
  super("BMW");
 }
 public void cost(){
  System.out.println("BMW cost is: 40lakhs");
 }
 public void milage(){
  System.out.println("BMW milage is: 15km");
 }
 public void capacity(){
  System.out.println("BMW capacity is: 5");
 }
 public void fuel(){
  System.out.println("BMW fuel is: diesel");
 }
}

class Hornet extends Bike implements Vehicle{
 public void cost(){
  System.out.println("Hornet cost is: 1.2lakhs");
 }
 public void milage(){
  System.out.println("Hornet milage is: 60km");
 }
 public void capacity(){
  System.out.println("Hornet capacity is: 2");
 }
 public void fuel(){
  System.out.println("Hornet fuel is: petrol");
 }
}

class Activa extends Bike implements Vehicle{
 Activa(){
  super("Activa");
 }
 public void cost(){
  System.out.println("Activa cost is: 82500");
 }
 public void milage(){
  System.out.println("Activa milage is: 65km");
 }
 public void capacity(){
  System.out.println("Activa capacity is: 2");
 }
 public void fuel(){
  System.out.println("Activa fuel is: petrol");
 }
}

class VehicleInterface {
  public static void main(String[] args) {
    Audi item = new Audi();
    item.cost();
    item.milage();
    item.capacity();
    item.fuel();
    item.viper();
    item.doors();
    BMW item1 = new BMW();
    item1.cost();
    item1.milage();
    item1.capacity();
    item1.fuel();
    item1.viper();
    item1.doors();
    Hornet ride= new Hornet();
    ride.cost();
    ride.milage();
    ride.capacity();
    ride.fuel();
    ride.stand();
    Activa ride1= new Activa();
    ride1.cost();
    ride1.milage();
    ride1.capacity();
    ride1.fuel();
    ride1.stand();
  }
}