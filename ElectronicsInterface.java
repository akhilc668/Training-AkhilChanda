interface Electronics{
 void cost();
 void ram();
 void harddisk();
 void display();
}

abstract class Laptop {
 void keybord(){
  System.out.println("Laptop has Keybord");
 }
 void mouse(){
  System.out.println("Laptop has mouse");
 }
 void webcam(){
  System.out.println("Laptop has Webcam");
 }
 Laptop(){
  System.out.println("In car constructor");
 }
 Laptop(String name){
  System.out.println("In Laptop paramterized constructor");
  System.out.println("Laptop name is "+name);
 }
}

abstract class Mobile{
 void camera(){
  System.out.println("Mobile has rare and front cameras");
 }
 Mobile(){
  System.out.println("In Mobile constructor");
 }
 Mobile(String name){
  System.out.println("In Mobile paramterized constructor");
  System.out.println("Mobile name is "+name);
 }
}

class Hp extends Laptop implements Electronics{
 public void cost(){
  System.out.println("Hp cost is: 50000");
 }
 public void ram(){
  System.out.println("Hp ram is: 8GB");
 }
 public void harddisk(){
  System.out.println("Hp harddisk is: 1TB");
 }
 public void display(){
  System.out.println("Hp display is: 15inches");
 }
}

class Dell extends Laptop implements Electronics{
 Dell(){
  super("Dell");
 } 
 public void cost(){
  System.out.println("Dell cost is: 45000");
 }
 public void ram(){
  System.out.println("Dell ram is: 6GB");
 }
 public void harddisk(){
  System.out.println("Dell harddisk is: 1TB");
 }
 public void display(){
  System.out.println("Dell display is: 13.5inches");
 }
}

class Redmi extends Mobile implements Electronics{
 public void cost(){
  System.out.println("Redmi cost is: 15000");
 }
 public void ram(){
  System.out.println("Redmi ram is: 6GB");
 }
 public void harddisk(){
  System.out.println("Redmi harddisk is: 128GB");
 }
 public void display(){
  System.out.println("Redmi display is: 6.5inches");
 }
}

class Oneplus extends Mobile implements Electronics{
 Oneplus(){
  super("oneplus");
 } 
 public void cost(){
  System.out.println("Oneplus cost is: 45000");
 }
 public void ram(){
  System.out.println("Oneplus ram is: 8GB");
 }
 public void harddisk(){
  System.out.println("Oneplus harddisk is: 256GB");
 }
 public void display(){
  System.out.println("Oneplus display is: 6.5inches");
 }
}

class ElectronicsInterface {
  public static void main(String[] args) {
    Hp lap=new Hp();
    lap.cost();
    lap.ram();
    lap.harddisk();
    lap.display();
    lap.keybord();
    lap.mouse();
    lap.webcam();
    Dell lap1=new Dell();
    lap1.cost();
    lap1.ram();
    lap1.harddisk();
    lap1.display();
    lap1.keybord();
    lap1.mouse();
    lap1.webcam();
    Redmi phone=new Redmi();
    phone.cost();
    phone.ram();
    phone.harddisk();
    phone.display();
    phone.camera();
    Oneplus phone1=new Oneplus();
    phone1.cost();
    phone1.ram();
    phone1.harddisk();
    phone1.display();
    phone1.camera();
  }
}