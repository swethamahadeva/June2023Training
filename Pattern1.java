import java.util.Scanner;
public class Pattern1{
public static void Star_Right_Triangle(char c,int n)
{
for (int i=0;i<n;i++){
System.out.println();
for (int j=0;j<=i;j++)System.out.print(c);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
Star_Right_Triangle(ch,row);
}
}  