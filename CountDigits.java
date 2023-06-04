import java.util.Scanner;
 
public class CountDigits {
    public static void main(String args[]) {
        int number, count = 0, temp;
        Scanner scanner;
        scanner = new Scanner(System.in);
 
        System.out.println("Enter an Integer");
        number = scanner.nextInt();
 
        temp = number;
        while (temp != 0) {
            temp = temp / 10;
            ++count;
        }
 
        System.out.format("Number of Digits in %d = %d", 
           number, count);
    }
}