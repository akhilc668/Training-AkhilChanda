import java.util.Scanner;
class Square{
 int val;
 void input(int a){
  val=a;
 }
 int square(){
  return val*val;
 }
}

class Sum extends Square{
 int val1;
 void takeValue(int b){
  val1 = b;
 }
 int addition(){
  return val+val1;
 }
}

class Calculation{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  Sum add=new Sum();
  int a=sc.nextInt(),b=sc.nextInt();
  add.input(a);
  System.out.println("Square is : "+add.square());
  add.takeValue(b);
  System.out.println("sum is : "+add.addition());
 }
}