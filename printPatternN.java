import java.util.Scanner;
class Main{
public static void printLine(int n){
for(int i=1;i<=n;i++){System.out.print(i);}
}
public static void printPatternN(int n){
for(int i=n;i>=1;i--){System.out.print("\n");
printLine(i);}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printPatternN(n);
}
}