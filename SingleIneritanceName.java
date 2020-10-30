import java.util.Scanner;
class FirstName{
 String firstName;
 void input(String name){
  firstName = name;
 }
}

class LastName extends FirstName{
 String lastName;
 void takeValue(String name){
  lastName = name;
 }
}

class SingleIneritanceName{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  LastName name=new LastName();
  name.input(sc.next());
  name.takeValue(sc.next());
  System.out.println("Name is: "+name.firstName+" "+name.lastName);
 }
}