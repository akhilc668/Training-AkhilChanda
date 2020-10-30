abstract class Mobile{
abstract void cost();
abstract void ram();
abstract void harddisk();
abstract void camera_pexcel();
void open(){
System.out.println("open with power botton");
}
Mobile(){
System.out.println("In constructor");
}
Mobile(String name){
System.out.println("In Paramterized constructor");
System.out.println("Mobile name: "+name);
}
}

class Redmi extends Mobile{
 void cost(){
  System.out.println("Prize of Redmi is: 15000");
 }
 void ram(){
  System.out.println("Ram of Redmi is: 6GB");
 }
 void harddisk(){
  System.out.println("Harddisk of Redmi is: 128GB");
 }
 void camera_pexcel(){
  System.out.println("camera_pexcel of Redmi is: 64px");
 }
}

class Oneplus extends Mobile{
 Oneplus(){
 super("Oneplus");
 } 
 void cost(){
  System.out.println("Prize of Redmi is: 45000");
 }
 void ram(){
  System.out.println("Ram of Redmi is: 8GB");
 }
 void harddisk(){
  System.out.println("Harddisk of Redmi is: 256GB");
 }
 void camera_pexcel(){
  System.out.println("camera_pexcel of Redmi is: 45px");
 }
}

class MobileAbstraction{
public static void main(String args[]){
System.out.println("==============Redmi details================");
Mobile x=new Redmi();
x.cost();
x.ram();
x.camera_pexcel();
x.harddisk();
x.open();
System.out.println("==============Oneplus details================");
x=new Oneplus();
x.cost();
x.ram();
x.camera_pexcel();
x.harddisk();
x.open();
}
}