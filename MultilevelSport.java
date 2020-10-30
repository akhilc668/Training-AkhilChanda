class Sport{
 void show(){
  System.out.println("It is good for health");
 }
}

class Outdoor extends Sport{
 void output(){
  System.out.println("is a outdoor game");
 }
}

class Cricket extends Outdoor{
 void giveValue(){
  System.out.print("Cricket ");
 }
}

class MultilevelSport{
 public static void main(String args[]){
  Cricket c=new Cricket();
  c.giveValue();
  c.output();
  c.show();
 }
}