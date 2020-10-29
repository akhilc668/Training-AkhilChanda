class Restaurant{
void menu(){
System.out.println("1.Idly\n2.Wada\n3.Dosa\n4.Poori");
}
void takeOrder(String order){
System.out.println("Order given is "+order);
}
String serveOrder(){
return "Dosa";
}
int bill(){
return 45;
}
String payBill(int amount){
System.out.print("The bill amount "+amount);
return "paid";
}
}

class RestaurantMethods{
public static void main(String args[]){
Restaurant runway9=new Restaurant();
runway9.menu();
runway9.takeOrder("Dosa");
System.out.println("Order Served is: " + runway9.serveOrder());
System.out.println("Bill amount is: "+ runway9.bill());
System.out.println(" is " + runway9.payBill(runway9.bill()));
}
}