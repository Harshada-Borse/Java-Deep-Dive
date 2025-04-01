/*
 * The Java String Pool (also called the String Intern Pool) is a special memory area inside the Heap Memory, where Java stores string literals to optimize memory usage and improve performance.
 * 
 * How It Works?
--> When you create a string literal, Java checks if the same string already exists in the String Pool.
--> If it exists, Java reuses the reference instead of creating a new object.
--> If it doesn’t exist, Java creates a new string in the pool.

* Important:
--> String literals are stored in the String Pool, while strings created using the `new` keyword are stored in the Heap Memory.
--> The `intern()` method can be used to add a string to the String Pool or retrieve it if it already exists.
* 1. "==" compares memory references (different).
* 2. .equals() compares actual  tent (same).

 */
public class StringPool {
    public static void main(String args[]) {
        String s1 = "Hello";   // Stored in the String Pool
        String s2 = "Hello";   // Reuses the same reference

        System.out.println(s1 == s2);  // true (Same reference)

        // String object vs. string pool
        String s3 = "Hello";             // Stored in String Pool
        String s4 = new String("Hello"); // New object in Heap

        System.out.println(s3 == s4);  // false (Different references)
        System.out.println(s3.equals(s4));  // true (Same content)

        // String Interning
        String s5 = new String("Java");
        String s6 = s5.intern();  // Adds "Java" to String Pool

        String s7 = "Java"; // Already in the String Pool

        System.out.println(s6 == s7);  // true (Same reference)
    }
}
