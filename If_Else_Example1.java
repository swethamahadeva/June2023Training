import java.util.Scanner;
class If_Else_Example1
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
System.out.println("The value of i:"+i);
System.out.println("the value of :"+j);
if(j==0)
{
System.out.println("Divison by error");
}
else
{
System.out.println(i+" divided by "+j+" is "+(i/j));
i=i+j;
}
}
}