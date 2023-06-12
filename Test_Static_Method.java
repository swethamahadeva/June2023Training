class Student{
int rollno;
String name;
static String college="MITS";
static void change(){
college="MTIET";
}
Student(int r,String n){
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
public class Test_Static_Method{
public static void main(String args[]){
Student.change();
 Student s1=new Student(111,"SWETHA");
Student s2=new Student(222,"NAVANEETHA");
Student s3=new Student(333,"GAYATRI");

s1.display();
s2.display();
s3.display();
}
}