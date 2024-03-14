import java.util.Scanner;

public class equalVovels3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String string= scanner.nextLine();
        //System.out.println(string1);

        boolean  result = hasEqualVowelSubstrings(string);

        if (result) {
            System.out.println("Both substrings contain an equal number of vowels.");
        } else {
            System.out.println("Both substrings do not contain an equal number of vowels.");
        }
    }

    public static boolean hasEqualVowelSubstrings(String str) {
        // Check if the length of the string is even
        if (str.length() % 2 != 0) {
            System.out.println("String length is not even.");
            return false;
        }

        // Divide the string into two substrings from the middle
        String firstHalf = str.substring(0, str.length() / 2);
        String secondHalf = str.substring(str.length() / 2);

        // Count vowels in both substrings
        int vowelsInFirstHalf = countVowels(firstHalf);
        int vowelsInSecondHalf = countVowels(secondHalf);

        // Check if both substrings have equal number of vowels
        return vowelsInFirstHalf == vowelsInSecondHalf;
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}

