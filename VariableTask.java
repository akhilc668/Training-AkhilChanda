class Mobile{
String ram;
String hard_disk;
int no_of_rare_cameras;
int display;
static String company_name;
static int no_of_front_cameras;
static String network;
}

public class VariableTask{
public static void main(String args[]){
Mobile RedmiNote9pro=new Mobile();
RedmiNote9pro.ram = "6GB";
RedmiNote9pro.hard_disk = "128GB";
RedmiNote9pro.no_of_rare_cameras = 4;
RedmiNote9pro.display = 6;
Mobile.company_name = "Redmi";
Mobile.no_of_front_cameras = 1;
Mobile.network = "4G";
System.out.println("Mobile Name = RedmiNote9pro");
System.out.println("Company Name = " + Mobile.company_name);
System.out.println("Ram = " + RedmiNote9pro.ram);
System.out.println("Hard_disk = " + RedmiNote9pro.hard_disk);
System.out.println("No of rare cameras = " + RedmiNote9pro.no_of_rare_cameras);
System.out.println("No of front cameras = " + Mobile.no_of_front_cameras);
System.out.println("Mobile Network = "+ Mobile.network);
System.out.println("Mobile Display in inches = " + RedmiNote9pro.display);
}
}