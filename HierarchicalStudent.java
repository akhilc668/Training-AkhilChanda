class Department{
 void branches(){
  System.out.println("==================Department================");
  System.out.println("ECE");
  System.out.println("CSE");
  System.out.println("Mech");
  System.out.println("Civil");
 }
}

class ECE extends Department{
 ECE(){
  System.out.println("==================ECE========================");
 }
  public void firstyear() {
   System.out.println("==================first yr========================");
   System.out.println("M1");
   System.out.println("MM");
   System.out.println("C");		
  }
  public void secondYear() {
  System.out.println("===================second yr=======================");
  System.out.println("EDC");
  System.out.println("S&S");
  System.out.println("ES");
 }
}

class CSE extends Department{
 CSE(){
  System.out.println("==================CSE========================");
 }
 public void firstyear() {
   System.out.println("==================first yr========================");
   System.out.println("M1");
   System.out.println("MM");
   System.out.println("C");		
  }	
  public void secondYear() {
  System.out.println("===================second yr=======================");
  System.out.println("EDC");
  System.out.println("S&S");
  System.out.println("ES");
 }
}

public class HierarchicalStudent{
 public static void main(String[] args) {
  Department depart= new Department();
  depart.branches();
  ECE e=new ECE();
  e.firstyear();
  e.secondYear();
  CSE c=new CSE();
  c.firstyear();
  c.secondYear();
 }
}
