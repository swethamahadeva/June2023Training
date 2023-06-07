import java.util.Scanner;
class LTP{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String t="";
int ascii;
for(int i=0;i<=s.length()-1;i++)
{
if(s.charAt(i)>='a'&&s.charAt(i)<='z')
{
ascii=s.charAt(i);
ascii-=32;
t=t+(char)ascii;
}
else
{
t=t+s.charAt(i);
}
}
System.out.println("t:"+t);

}
}