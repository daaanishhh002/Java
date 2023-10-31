package Java;

import java.util.Scanner;

public class Conditionals {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // if-else
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.close();

        if (age >= 75) {
        System.out.println("Ok Boomer.");
        }
        else if (age >= 18) {
        System.out.println("You are an adult.");
        }
        else if (age >= 13) {
        System.out.println("You are a teenager.");
        }
        else {
        System.out.println("You are a kid.");
        }

        // switch
        System.out.print("Enter a language: ");
        String greeting = sc.next();

        switch(greeting) {
        case "english": System.out.println("hello");
        break;
        case "french": System.out.println("bonjour");
        break;
        case "arabic": System.out.println("assalamualaikum");
        break;
        case "hindi": System.out.println("namaste");
        break;
        case "chinese": System.out.println("ni hao");
        break;
        case "spanish": System.out.println("hola");
        break;
        case "italian": System.out.println("ciao");
        break;
        default: System.out.println("invalid");
        }

        // nested if-else
        System.out.print("Enter an year: ");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("It is a leap year!");

        } 
        else {
            if (year % 400 == 0) {
                System.out.println("It is a leap year!");
            }
            else {
                System.out.println("It is not a leap year.");
            }
        }

    }
}
