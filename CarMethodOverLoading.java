class CarShowRoom{
void listCars(){
System.out.println("1.Benz\n2.BMW\n3.Sokda\n4.Maruti Suzuki");
}
void takeCar(String order){
System.out.println("item ordered is "+order);
}
void takeCar(String order1,String order2){
System.out.println("item ordered is "+order1+" and "+order2);
}
void takeCar(String order1,String order2,String order3){
System.out.println("item Ordered is "+order1+" and "+order2+" and "+order3);
}
}

class CarMethodOverLoading{
public static void main(String args[]){
CarShowRoom cars=new CarShowRoom();
cars.listCars();
cars.takeCar("Benz");
cars.takeCar("Benz","BMW");
cars.takeCar("Benz","BMW","Sokda");
}
}