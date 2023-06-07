import java.util.Scanner;
public class Smallest_Number 
{
public static void main(String args[]) 
{
int x, y, z;
Scanner sc= new Scanner(System.in);
System.out.print("Enter the first number:");
x=sc.nextInt();
System.out.print("Enter the second number:");
y=sc.nextInt();
System.out.print("Enter the third number:");
z=sc.nextInt();
if(x<y&&x<z)
{
System.out.println("Smallest number is:"+x);
}
else if(y<z)
{
System.out.println("Smallest number is:"+y);
}
else
{
System.out.println("Smallest number is:"+z);
}
}
}