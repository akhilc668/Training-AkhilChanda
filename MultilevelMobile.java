class Mobile{
 void show(){
  System.out.println("It is Best Mobile");
 }
}

class Redmi extends Mobile{
 void output(){
  System.out.println("It a brand in Mobile");
 }
}

class RedmiNote9 extends Redmi{
 void giveValue(){
  System.out.println("It is a model in Redmi ");
 }
}

class MultilevelMobile{
 public static void main(String args[]){
  RedmiNote9 r=new RedmiNote9();
  r.giveValue();
  r.output();
  r.show();
 }
}