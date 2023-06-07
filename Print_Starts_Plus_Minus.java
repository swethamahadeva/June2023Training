class Print_Starts_Plus_Minus{
public static void Print_Multiple_Chars(int i,char c)
{
int k=0;
for(k=1;k<=i;k=k+1)
System.out.print(c);
}
public static void main(String args[])
{
int j=5;
Print_Multiple_Chars(j,'*');
Print_Multiple_Chars(j+1,'+');
Print_Multiple_Chars(j+2,'-');
System.out.print("");
}
}