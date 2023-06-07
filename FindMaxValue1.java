import java.util.Scanner;
class FindMaxValue1
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
System.out.println("The value of i:"+i);
System.out.println("the value of :"+j);
if(i<j)
{
System.out.println(j+" is max");
System.out.println(i+" is min");
}
else
{
System.out.println(i+" is max");
System.out.println(j+" is min");
}
}
}
