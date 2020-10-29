import java.util.Scanner;
class Laptop{
String ram;
String hard_disk;
String processor;
String graphiccard;
int display;
static String company_name;
static String processor_company_name;
static String graphiccard_company_name;
}

public class LaptopScanner{
public static void main(String args[]){
Laptop Pavilion=new Laptop();
Scanner sc=new Scanner(System.in);
Pavilion.ram = sc.next();
Pavilion.hard_disk = sc.next();
Pavilion.processor = sc.next();
Pavilion.graphiccard = sc.next();
Pavilion.display = sc.nextInt();
Laptop.company_name = sc.next();
Laptop.processor_company_name = sc.next();
Laptop.graphiccard_company_name = sc.next();
System.out.println("Laptop Name = Pavilion");
System.out.println("Company Name = " + Laptop.company_name);
System.out.println("Ram = " + Pavilion.ram);
System.out.println("Hard_disk = " + Pavilion.hard_disk);
System.out.println("Processor = " + Pavilion.processor);
System.out.println("Processor company name = " + Laptop.processor_company_name);
System.out.println("Graphiccard = " + Pavilion.graphiccard );
System.out.println("Graphiccard company name= " + Laptop.graphiccard_company_name);
System.out.println("Display in inches = " + Pavilion.display);

}
}