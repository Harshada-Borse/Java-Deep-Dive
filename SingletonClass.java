/*
 * A Singleton Class in Java is a class that allows only one instance to be created and provides a global access point to that instance. This design pattern is used when only one object is needed to control actions, such as database connections or logging frameworks.
 * 
 * The Singleton pattern is implemented in Java using the following steps:
 * 1. Make the constructor private to prevent instantiation from outside the class.
 * 2. Create a static method that returns the instance of the class.
 * 3. Use a static variable to hold the single instance of the class.
 */
class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class SingletonClass {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // Check if both instances are the same
        System.out.println(obj1 == obj2); // Output: true (Both references point to the same object)
    }
}
