import java.util.Scanner;

public class removeDuplicate5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String result = removeAdjacentDuplicates(input);
        System.out.println("String after removing adjacent duplicates: " + result);
        }

        public static String removeAdjacentDuplicates(String string)
        {
            // Java's built-in regular expressions to replace consecutive duplicates
            return string.replaceAll("(.)\\1+", "$1");
        }
    }