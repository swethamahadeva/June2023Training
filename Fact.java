import java.util.*;
class Fact{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num;
int res=1;
System.out.print("Enter any positive number:");
num=sc.nextInt();
for(int i=1;i<=num;i++)
{
res*=i;
}
System.out.print("Fact:"+res);
}
}