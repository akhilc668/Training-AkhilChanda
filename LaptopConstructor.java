class Laptop{
String ram;
String hard_disk;
String processor;
String graphiccard;
int display;
String company_name;
String processor_company_name;
String graphiccard_company_name;

Laptop(String ram,String hard_disk,String processor,String graphiccard,int display,String company_name,String processor_company_name,String graphiccard_company_name){
this.ram=ram;
this.hard_disk=hard_disk;
this.processor=processor;
this.graphiccard=graphiccard;
this.display=display;
this.company_name=company_name;
this.processor_company_name=processor_company_name;
this.graphiccard_company_name=graphiccard_company_name;
this.display();
}

void display(){
System.out.println("============Laptop Details===========");
System.out.println("Company Name = " + company_name);
System.out.println("Ram = " + ram);
System.out.println("Hard_disk = " + hard_disk);
System.out.println("Processor = " + processor);
System.out.println("Processor company name = " + processor_company_name);
System.out.println("Graphiccard = " + graphiccard );
System.out.println("Graphiccard company name= " + graphiccard_company_name);
System.out.println("Display in inches = " + display);
}
}

public class LaptopConstructor{
public static void main(String args[]){
Laptop HP=new Laptop("4GB","1TB","core i3","Rtx2080",15,"HP Pavilion","intel","gigabyte");
Laptop Lanovo=new Laptop("8GB","1TB","core i5","Rtx2080",15,"Lanovo","intel","gigabyte");
}
}