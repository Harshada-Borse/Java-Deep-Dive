import java.util.*;

public class AboutInteger {
    public static void main(String[] args) {
        // Integer constructor creates a new object every time
        // Integer constructor is deprecated since Java 9
        // instead of that we use Integer.valueOf() method or parseInt() method
        Integer a = new Integer("127");
        Integer b = new Integer("127");
        System.out.println(a == b); // false

        // Integer.valueOf() method caches the values from -128 to 127
        Integer c = Integer.valueOf("127");
        Integer d = Integer.valueOf("127");
        System.out.println(c == d); // true

        Integer e = Integer.valueOf("128");
        Integer f = Integer.valueOf("128");
        System.out.println(e == f); // false

        Integer g = Integer.valueOf("-126");
        Integer h = Integer.valueOf("-126");
        System.out.println(g == h); // true

        Integer number_1 = 50;
        Integer number_2 = 50;
        Integer number_3 = 150;
        Integer number_4 = 150;

        if (number_1 == number_2)
            System.out.println("Number 1 and Number 2 are Equal");
        else
            System.out.println("Number 1 and Number 2 are not Equal");

        if (number_3 == number_4)
            System.out.println("Number 3 and Number 4 are Equal");
        else
            System.out.println("Number 3 and Number 4 are not Equal");
    }
}
