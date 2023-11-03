package Java;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1D-Arrays
        String cars[] = new String[3];
        cars[0] = "Volvo";
        cars[1] = "Toyota";
        cars[2] = "Ford";

        for(int i = 0; i < cars.length; i++){
            System.out.print(cars[i]+" ");
        }
        System.out.println();

        int scores[] = {96,98,82,65};
        for(int i = 0; i < scores.length; i++){
            System.out.print(scores[i]+" ");
        }
        System.out.println();

        // 2D-Arrays
        int matrix[][] = new int[3][3];
        System.out.println("Enter elements for 3x3 matrix");

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        sc.close();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
