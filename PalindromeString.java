import java.util.Scanner;
class PalindromeString
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num;
System.out.print("enter a num:");
num=sc.next();
for (int i = 1; i <= 1; i++) {
num = i;
int reversed = 0;
while (num != 0) {
int digit = num % 10;
reversed = reversed * 10 + digit;
num /= 10;
}
if (i == reversed) {
System.out.print(i + " ");
}
}
}
}
