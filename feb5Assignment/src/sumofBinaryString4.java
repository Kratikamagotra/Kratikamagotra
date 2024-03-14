import java.sql.SQLOutput;
import java.util.Scanner;
public class sumofBinaryString4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first binary string: ");
        String string1 = scanner.next();
        System.out.println("Enter the second binary string: ");
        String string2 = scanner.next();

        int number1 = Integer.parseInt(string1, 2);
        int number2 = Integer.parseInt(string2, 2);
        int number3 = number1 + number2;

        //System.out.println(Integer.toBinaryString(number1));
        //System.out.println(Integer.toBinaryString(number3));
        System.out.println("The sum of two binary strings are :" + Integer.toBinaryString(number3));
    }
}



