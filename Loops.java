package Java;
import java.util.Scanner;

public class Loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        sc.close();

        // while loop
        String name = "";

        while(name.isBlank()) {
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        }

        System.out.println("Hello "+name);
    
        // do while loop
        int i = 12;

        do {
            System.out.println(i);
        } while (i < 11);

        // for loop
        int fact = 1;
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for(i = 1; i <= num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial is "+fact);
        
        
        // nested for loop
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        System.out.print("Enter width: ");
        int width = sc.nextInt();
        System.out.print("Enter symbol to be used: ");
        String symbol = sc.next();

        for(i=0; i < height; i++) {
            for(int j=0; j < width; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

    }
}
