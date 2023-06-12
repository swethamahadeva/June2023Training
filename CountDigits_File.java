import java.io.*;
class CountDigits_File{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("D:\\Demo.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countDigits=0;
while((i=br.read())!=-1){
if(((char)i>='0')&&((char)i<='9'))
countDigits++;
}
System.out.print(countDigits);
br.close();
fr.close();
}
}