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

public class VariableTask1{
public static void main(String args[]){
Laptop Pavilion=new Laptop();
Pavilion.ram = "4GB";
Pavilion.hard_disk = "1TB";
Pavilion.processor = "core i3";
Pavilion.graphiccard = "Rtx2080";
Pavilion.display = 15;
Laptop.company_name = "HP";
Laptop.processor_company_name = "intel";
Laptop.graphiccard_company_name = "gigabyte";
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