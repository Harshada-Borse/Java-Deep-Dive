import java.util.*;

/*
 * Generics ---> are a way to tell the compiler what type of objects are being stored in a collection.
 * This allows the compiler to check that the objects being stored are of the correct type.
 * Generics are a way to make the code more type-safe and to avoid the need for casting.
 * 
 * ** Advantages of Generics:
 * 1. Type-safety: Generics make the code more type-safe by catching the bugs at compile time.
 * 2. No need for typecasting: Generics remove the need for typecasting the objects retrieved from the collection.
 * 3. Code reusability: Generics allow us to write a single class or method that can work with different types of objects.
 */

public class Generic {

    // Generic method example
    public static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // without generics we need to do type casting while retrieving the object from
        // the collection
        // this can lead to runtime exceptions if the type casting is not done properly

        List list = new ArrayList();
        list.add("Hello");
        String s = (String) list.get(0);
        System.out.println(s);

        // with generics we can specify the type of objects that can be stored in the
        // collection
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        String s1 = list1.get(0);
        System.out.println(s1);

        // Generic class example
        GenericClass<Integer> gc = new GenericClass<>();
        gc.set(10);
        System.out.println(gc.get());

        GenericClass<String> gc1 = new GenericClass<>();
        gc1.set("Hello");
        System.out.println(gc1.get());

        // Generic method called
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] strArray = { "Hello", "World" };
        printArray(intArray);
        printArray(strArray);
    }
}

// Generic classes -> A generic class is a class that can operate on a specific
// type specified by the programmer.
class GenericClass<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}
