class Mobile{
void cost(){
 System.out.println("No Cost");
}
void ram(){
 System.out.println("No Ram");
}
void harddisk(){
 System.out.println("No harddisk");
}
void camera_pexcel(){
 System.out.println("No camera_pexcel");
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

class MobileMethodoverriding{
public static void main(String args[]){
System.out.println("==============Redmi details================");
Mobile x=new Redmi();
x.cost();
x.ram();
x.camera_pexcel();
x.harddisk();
System.out.println("==============Oneplus details================");
x=new Oneplus();
x.cost();
x.ram();
x.camera_pexcel();
x.harddisk();
}
}