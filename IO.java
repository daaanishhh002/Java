package Java;

import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = sc.nextLine();
        System.out.print("What is your age: ");
        int age = sc.nextInt();
        System.out.print("Where are you from: ");
        sc.hasNextLine();
        String location = sc.nextLine();
        sc.close();

        System.out.println("\nHi "+name);
        System.out.println("You are "+age);
        System.out.println("You are from "+location);

    }
}
