class Student{
int student_id;
float percentage;
float height;
int weight;
String bloodGroup;
String address;
String college_name;
String department;
String subject;
Student(int student_id,float percentage,float height,int weight,String bloodGroup,String address,String college_name,String department,String subject){
this.student_id=student_id;
this.percentage=percentage;
this.height=height;
this.weight=weight;
this.bloodGroup=bloodGroup;
this.address=address;
this.college_name=college_name;
this.department=department;
this.subject=subject;
this.display();
}
void display(){
System.out.println("========Student Details========");
System.out.println("Student id="+student_id);
System.out.println("Student percentage="+percentage);
System.out.println("Student height="+height);
System.out.println("Student weight="+weight);
System.out.println("Student bloodgroup="+bloodGroup);
System.out.println("Student address="+address);
System.out.println("College name="+college_name);
System.out.println("Department="+department);
System.out.println("Subjects="+subject);
}
}
public class StudentConstructor{
public static void main(String args[]){
Student Akhil= new Student(1200,65.2f,5.9f,65,"O+","H.no:- 1-143/2/1 ,Vasavi Nagar, Gajwel","CMRIT","CSE","c,java,python,web technology,dbms");
Student Nikhil= new Student(1201,72.2f,5.7f,55,"O-","H.no:- 8-143/2/1 ,Vasavi Nagar, Gajwel","CMRIT","CSE","c,java,python,web technology,dbms");
}
}