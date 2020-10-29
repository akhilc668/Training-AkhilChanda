import java.util.Scanner;
class Student{
int student_id;
float percentage;
float height;
int weight;
String bloodGroup;
String address;
static String college_name;
static String department;
static String subject;
}
public class StudentScanner{
public static void main(String args[]){
Student Akhil= new Student();
Scanner sc=new Scanner(System.in);
Akhil.student_id = sc.nextInt();
Akhil.percentage = sc.nextFloat();
Akhil.height = sc.nextFloat();
Akhil.weight = sc.nextInt();
Akhil.bloodGroup = sc.next();
Akhil.address = sc.next();
Student.college_name = sc.next();
Student.department = sc.next();
Student.subject = sc.next();
System.out.println("Student id="+Akhil.student_id);
System.out.println("Student percentage="+Akhil.percentage);
System.out.println("Student height="+Akhil.height);
System.out.println("Student weight="+Akhil.weight);
System.out.println("Student bloodgroup="+Akhil.bloodGroup);
System.out.println("Student address="+Akhil.address);
System.out.println("College name="+Student.college_name);
System.out.println("Department="+Student.department);
System.out.println("Subjects="+Student.subject);
}
}