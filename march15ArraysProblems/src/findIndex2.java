import java.util.Scanner;

public class findIndex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=scanner.nextInt();
        int [] array = new int [size];
        System.out.println("Enter the array elements in non-decreasing: ");
        for (int i = 0; i < size; i++) {
            array[i]=scanner.nextInt();

      }
        System.out.println("Element your want to search: ");
        int num = scanner.nextInt();
        for (int i = 0; i <size; i++) {
            if (array[i] == num)
                System.out.println(" Element find at index " + i);


        }
        System.out.println("{-1,-1}");
    }

}
