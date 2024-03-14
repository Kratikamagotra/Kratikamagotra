import java.util.Scanner;
public class array1AddintValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        System.out.println("Enter the array elements:");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int totalScore = calculateScore(array);
        System.out.println("Total score: " + totalScore);
    }

    public static int calculateScore(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int score = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num % 2 == 0) {
                score += 1;
            } else if (num != 5) {//odd but 5 excluded
                score += 3;
            } else {
                score += 5;
            }
        }

        return score;
    }
}
