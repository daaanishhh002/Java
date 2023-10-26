// Java is a general-purpose, concurrent, class-based, object-oriented programming language. It is designed to have as few implementation dependencies as possible, to allow it to be portable. Java is often described as a "write once, run anywhere" language, meaning that code compiled for one Java Virtual Machine (JVM) can be run on any platform that has a JVM.

// JDK(Java Development Kit) -> JRE(Java Runtime Environment) -> JVM(Java Virtual Machine)

package Java;

class FirstClass {
    public static void main(String args[]) {

        System.out.println("hello, world");

        // Variables and Datatypes
        /*Primitive: stores data, hold only 1 value, less memory, faster
         * boolean - 1 [true/false]
         * byte - 1 (-128 to 127)
         * short - 2
         * int - 4 [1,2,3]
         * long - 8 [1234567890L]
         * float - 4 [3.141528F]
         * double - 8
         * char - 2 ['$']
         */

        /*Non-Primitive(reference / user-defined) stores address, can hold more than 1 value, more memory, slower
         * array
         * string
         * class
         * object
         * enum
         * interface
         */

        String name = "Danish Ahmed";
        System.out.println(name);

        int num1; // declaration
        num1 = 96; // assignment

        int num2 = 25; // initialisation
        long bignum = 9876543210L;

        float dec1 = 1.414F;
        double dec2 = 3.141528;

        boolean isOfAge = true;
        char letter = '#';

        System.out.printf("%d %d %d\n",num1, num2, bignum);
        System.out.printf("%f %f\n", dec1, dec2);
        System.out.printf("%b %c", isOfAge, letter);

    }
}