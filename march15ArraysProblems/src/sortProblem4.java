import java.util.Scanner;

public class sortProblem4 {
    //sort 0,1,2
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 0, 1, 0, 1, 2, 2, 0, 1};

        int low = 0;
        int mid = 0;
        int high = array.length - 1;

        while (mid <= high) {
            if (array[mid] == 0) {
                int temp = array[low];
                array[low] = array[mid];
                array[mid] = temp;
                low++;
                mid++;
            } else if (array[mid] == 1) {
                mid++;

            } else {
                int temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;
                high--;
            }
        }
        System.out.println("Sorted Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
