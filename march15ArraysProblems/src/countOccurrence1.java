import java.util.Scanner;

public class countOccurrence1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=scanner.nextInt();
        int [] array = new int [size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            array[i]=scanner.nextInt();

        }
        System.out.println("Enter the integer you find occurrence of: ");
        int num= scanner.nextInt();
        int count =0;
        for (int i = 0; i < size; i++) {
            if(num==array[i])
                count++;

        }
        System.out.println("The occurrence of "+num+ " is " +count);

    }
}
