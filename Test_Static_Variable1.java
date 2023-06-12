class Student{
int rollno;
String name;
static String college="ITS";
Student(int r,String n){
rollno=r;
name=n;
}
void display(){
System.out.println(rollno+" "+name+" "+college);
}
}
public class Test_Static_Variable1{
public static void main(String args[]){
Student s1=new Student(111,"SWETHA");
Student s2=new Student(222,"NAVANEETHA");
Student.college="MTIET";
s1.display();
s2.display();
}
}

