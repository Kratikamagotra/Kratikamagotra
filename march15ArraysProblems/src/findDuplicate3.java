import java.util.Arrays;
import java.util.Scanner;

public class findDuplicate3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=scanner.nextInt();
        int [] array=new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size ; i++) {
            array[i]=scanner.nextInt();
        }
        //Arrays.sort(array);
        boolean foundDuplicate=false;
        System.out.println("Duplicate elements is array are : ");
        for(int i=0;i<size;i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    foundDuplicate = true;
                    System.out.println(array[i] + " ");
                    break;
                }
            }
        }
        if (!foundDuplicate){
            System.out.println("No duplicate found");
        }

    }
}