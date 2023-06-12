import java.util.ArrayList;
import java.util.Scanner;
class Occurence{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String input=sc.nextLine();
Character character=sc.next().charAt(0);
System.out.println(removeOccurences(input,character));
}
private static String removeOccurrences(String input,Character character) {
ArrayList<Character> a1=new ArrayList<>();
for(int i=0;i<input.length();i++)
{
char ch=input.charAt(i);
if(ch!=character)
{
a1.add(ch);
}
}
StringBuilder stringBuilder=new StringBuilder();
for(char c:a1)
{
stringBuilder.append(c);
}
return stringBuilder.toString();
}
}


