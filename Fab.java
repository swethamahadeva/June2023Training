import java.util.Scanner;
class Fab{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int sum=0,n;
int a=0;
int b=1;
System.out.println("Enter the n th value");
n=sc.nextInt();
System.out.println("fibonacci series:");
while(sum<=n)
{
System.out.print(sum +" ");
a=b;
b=sum;
sum=a+b;
}
}
}