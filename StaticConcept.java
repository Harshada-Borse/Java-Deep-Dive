class Student {
    int rollno; // instance variable
    String name; // instance variable
    static String college; // static variable

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    static { // static block
        System.out.println("static block is invoked");
        college = "ITS";
    }

    public void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    // static method
    public static void show1(Student s) {
        System.out.println(s.rollno + " " + s.name + " " + college);
    }
}

public class StaticConcept {
    public static void main(String[] args) {
        Student s1 = new Student(1, "John");
        Student s2 = new Student(2, "Jane");

        s1.display();
        s2.display();
        // Student.college = "MIT";
        // s1.display();

        // static variable -> get shared among all the instances of the class
        // static variable is used to refer the common property of all objects
        // static variable gets memory only once in class area at the time of class

        // static method
        // static method can be called without creating an object
        // static method can access static data member and can change the value of it
        // static method cannot use non static data member or call non-static method
        // directly
        // this and super cannot be used in static context
        // static method cannot access instance variable
        // static method cannot access this and super keyword

        Student.show1(s1);

        // static block
        // static block is used for static initialization
        // static block is executed before main method at the time of class loading
        // static block is executed only once
        // static block is used to write the logic of static variables
        // static block is executed before the constructor
        // static block is executed before the main method
        // static block is executed before the object is created
        // static block is executed before the instance block

    }
}