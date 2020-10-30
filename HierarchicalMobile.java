class Mobile{
 void phone(){
  System.out.println("List of Phones");
  System.out.println("Redmi");
  System.out.println("Oneplus");
  System.out.println("Realme");
 }
}

class Redmi extends Mobile{
 void ram(){
  System.out.println("Ram of Redmi is: 6GB");
 }
 void harddisk(){
  System.out.println("Harddisk of Redmi is: 128GB");
 }
}

class Oneplus extends Mobile{
 void cost(){
  System.out.println("Prize of Redmi is: 45000");
 }
 void camera_pexcel(){
  System.out.println("camera_pexcel of Redmi is: 45px");
 }
}

class HierarchicalMobile{
 public static void main(String args[]){
  Mobile m=new Mobile();
  m.phone();
  System.out.println("==============Redmi details================");
  Redmi r=new Redmi();
  r.ram();
  r.harddisk();
  System.out.println("==============Oneplus details================");
  Oneplus o=new Oneplus();
  o.cost();
  o.camera_pexcel();
 }
}