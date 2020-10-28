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
public class Variables{
public static void main(String args[]){
Student Akhil= new Student();
Akhil.student_id = 1200;
Akhil.percentage = 65.2f;
Akhil.height = 5.9f;
Akhil.weight = 65;
Akhil.bloodGroup = "O+";
Akhil.address = "H.no:- 1-143/2/1 ,Vasavi Nagar, Gajwel";
Student.college_name = "CMRIT";
Student.department = "CSE";
Student.subject = "c,java,python,web technology,dbms";
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