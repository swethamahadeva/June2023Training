import java.util.Scanner;
class Numbers_Add
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int c=1;
int s=0;
while(c<=i)
{
s=s+c;
c++;
}
System.out.println(s);
}
}