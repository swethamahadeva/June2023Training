import java.io.*;
public class Triangle{
public static void Star_Right_Triangle(int n)
{
int a, b;
for (a=0;a<n;a++){
for (b=0;b<=a;b++){
System.out.print("* ");
}
System.out.println();
}
}
public static void main(String args[])
{
int k = 5;
Star_Right_Triangle(k);
}
}