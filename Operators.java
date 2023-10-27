package Java;

public class Operators {
    public static void main(String[] args) {

        int num = 10;
        double cast = (double) num / 3; // typecasting
        System.out.println(cast);

        // Pre/Post Increment
        int a = 10;
        int b = 0;
        int c = 10;
        int d = 0;

        b = ++a;
        d = c++;

        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);


        int e = 5;
        int f = 6;

        System.out.println(e&f);
        System.out.println(e|f);
        System.out.println(e^f);
        System.out.println(~e);
        System.out.println(f<<1);
        System.out.println(f<<3);
        System.out.println(f>>1);
    }
}
