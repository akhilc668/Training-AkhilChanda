abstract class Mobile{
abstract void cost();
abstract void ram();
abstract void harddisk();
abstract void camera_pexcel();
void open(){
System.out.println("open with power botton");
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
 void cost(){
  System.out.println("Prize of Oneplus is: 45000");
 }
 void ram(){
  System.out.println("Ram of Oneplus is: 8GB");
 }
 void harddisk(){
  System.out.println("Harddisk of Oneplus is: 256GB");
 }
 void camera_pexcel(){
  System.out.println("camera_pexcel of Oneplus is: 45px");
 }
}

class MobileFactory{
 static Mobile getMobile(String mobileName){
  if(mobileName.equalsIgnoreCase("Redmi")){
   return new Redmi();
  }
  else if(mobileName.equalsIgnoreCase("Oneplus")){
   return new Oneplus();
  }
  else {
   return null;
  }
 }
}
class FactoryMethodDemo{
public static void main(String args[]){
Mobile x=MobileFactory.getMobile(args[0]);
x.cost();
x.ram();
x.camera_pexcel();
x.harddisk();
x.open();
}
}