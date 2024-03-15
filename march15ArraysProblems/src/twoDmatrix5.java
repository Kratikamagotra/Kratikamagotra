import java.util.Scanner;
public class twoDmatrix5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of 2D square matrix: ");
        int size= scanner.nextInt();
        int [][] array =new int[size][size];
        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j]=scanner.nextInt();

            }
        }
        System.out.println("Sum of boundary elements and both diagonal with excluded repeated elements is :");
        int sum=0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum+=array[i][j];
            }
        }
        System.out.print(sum);

    }
}
