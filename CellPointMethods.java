class CellPoint{
void items(){
System.out.println("1.Redmi\n2.Realmi\n3.Oneplus\n4.Vivo");
}
void takeItem(String order){
System.out.println("Mobile ordered is "+order);
}
String giveItem(){
return "Oneplus";
}
int bill(){
return 45000;
}
String payBill(int amount){
System.out.print("The bill amount "+amount);
return "paid";
}
}

class CellPointMethods{
public static void main(String args[]){
CellPoint phone=new CellPoint();
phone.items();
phone.takeItem("Oneplus");
System.out.println("Mobile given is: " + phone.giveItem());
System.out.println("Bill amount is: "+ phone.bill());
System.out.println(" is " + phone.payBill(phone.bill()));
}
}