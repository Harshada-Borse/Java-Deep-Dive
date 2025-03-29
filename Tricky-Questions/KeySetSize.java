
/* Siemens Interview Question
 * Question: we create 2 objects of a class and pass that class as a key to hashmap 
 * then what is the size of keyset?
 */
import java.util.*;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class KeySetSize {
    public static void main(String[] args) {
        HashMap<Person, Integer> map = new HashMap<>();

        Person p1 = new Person("Harshada");
        Person p2 = new Person("Rohit");

        map.put(p1, 10);
        map.put(p2, 20);
        map.put(p1, 30); // get overwritten

        System.out.println("Size of keySet: " + map.keySet().size()); // output: 2
        for (Person i : map.keySet()) {
            System.out.println(i.name + " " + map.get(i)); // output: Harshada 30, Rohit 20
        }
    }
}
