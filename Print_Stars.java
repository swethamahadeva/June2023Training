import java.util.Scanner;
class Print_Stars
{
public static void Print_multiple_Stars(int i)
{
int k;
for(k=1;k<=i;k=k+1)
System.out.print("*");
}
public static void main(String args[])
{
int j=5;
Print_multiple_Stars(j);
System.out.print(" ");
}
}