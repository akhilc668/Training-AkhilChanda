class CarShowRoom{
void listCars(){
System.out.println("1.Benz\n2.BMW\n3.Sokda\n4.Maruti Suzuki");
}
void takeCar(String order){
System.out.println("Car ordered is "+order);
}
String giveCar(){
return "BMW";
}
int bill(){
return 2500000;
}
String payBill(int amount){
System.out.print("The bill amount "+amount);
return "paid";
}
}

class CarMethods{
public static void main(String args[]){
CarShowRoom cars=new CarShowRoom();
cars.listCars();
cars.takeCar("BMW");
System.out.println("Car given is: " + cars.giveCar());
System.out.println("Bill amount is: "+ cars.bill());
System.out.println(" is " + cars.payBill(cars.bill()));
}
}