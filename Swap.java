package Java;

public class Swap {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println("Before swap:\nx: "+x+" y: "+y);

        // Swap using temp var
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swap:\nx: "+x+" y: "+y);

        // Swap without temp var
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swap:\nx: "+x+" y: "+y);

        // Swap using bitwise operators
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap:\nx: "+x+" y: "+y);

    }
}
