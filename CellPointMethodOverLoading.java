class CellPoint{
void items(){
System.out.println("1.Redmi\n2.Realmi\n3.Oneplus\n4.Vivo");
}
void takeItem(String order){
System.out.println("item ordered is "+order);
}
void takeItem(String order1,String order2){
System.out.println("item ordered is "+order1+" and "+order2);
}
void takeItem(String order1,String order2,String order3){
System.out.println("item Ordered is "+order1+" and "+order2+" and "+order3);
}
}

class CellPointMethodOverLoading{
public static void main(String args[]){
CellPoint phone=new CellPoint();
phone.items();
phone.takeItem("Oneplus");
phone.takeItem("Oneplus","Realme");
phone.takeItem("Oneplus","Realme","Redmi");
}
}