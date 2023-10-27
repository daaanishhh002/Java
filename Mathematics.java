package Java;

import java.util.Random;
import java.util.Scanner;

public class Mathematics {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double pie = Math.PI;
        System.out.print("Enter radius of Sphere: ");
        double radius = sc.nextDouble();
        sc.close();

        double volume = (4 * pie * radius*radius) / 3;
        System.out.println("Volume of sphere is: "+volume);

        Random random = new Random();

        int x = random.nextInt(1,7);
        float y = random.nextFloat();
        boolean z = random.nextBoolean();
        double n = random.nextGaussian(0, 1);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(n);

    }
}
