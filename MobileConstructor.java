class Mobile{
String ram;
String hard_disk;
int no_of_rare_cameras;
int display;
String company_name;
int no_of_front_cameras;
String network;
Mobile(String ram,String hard_disk,int no_of_rare_cameras,int display,String company_name,int no_of_front_cameras,String network){
this.ram=ram;
this.hard_disk=hard_disk;
this.no_of_rare_cameras=no_of_rare_cameras;
this.display=display;
this.company_name=company_name;
this.no_of_front_cameras=no_of_front_cameras;
this.network=network;
this.display();
}
void display(){
System.out.println("============Mobile Details===========");
System.out.println("Company Name = " + company_name);
System.out.println("Ram = " + ram);
System.out.println("Hard_disk = " + hard_disk);
System.out.println("No of rare cameras = " + no_of_rare_cameras);
System.out.println("No of front cameras = " + no_of_front_cameras);
System.out.println("Mobile Network = "+ network);
System.out.println("Mobile Display in inches = " + display);
}
}

public class MobileConstructor{
public static void main(String args[]){
Mobile Redmi=new Mobile("6GB","128GB",4,6,"Redmi Note 9 pro Max",1,"4G");
Mobile oneplus=new Mobile("8GB","256GB",4,6,"oneplus nord",2,"5G");
}
}