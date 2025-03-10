class finalVariableExample {
    final int MAX_VALUE = 100;

    void changeValue() {
        // MAX_VALUE = 200; // Compile Time Error
    }
}

class parent {
    final void display() {
        System.out.println("This is final method");
    }
}

class child extends parent {
    // the following method causes the complile time error becauce display() is
    // final
    // void display{} {
    // System.out.println("Cannot get overrided");
    // }
}

final class ImmutableClass {
    final String pancardNumber;

    public ImmutableClass(String pancardNumber) {
        this.pancardNumber = pancardNumber;
    }

    public String getPancardNumber() {
        return pancardNumber;
    }
}

// the following class causes the compile time error because ImmutableClass is
// final
// class MutableClass extends ImmutableClass {
// public MutableClass(String pancardNumber) {
// super(pancardNumber);
// }
// }

public class FinalConcept {
    public static void main(String[] args) {
        // final variable
        /*
         * The value cannot get changed once assigned. It is a constant.
         * The final variable get shared among all the instances of class.
         */
        finalVariableExample obj1 = new finalVariableExample();
        obj1.changeValue();

        // final method
        /*
         * The final method cannot be overridden.
         * The final method is inherited but cannot be overridden.
         */
        child obj2 = new child();
        obj2.display();

        // final class
        /*
         * The final class cannot be inherited.
         */
        ImmutableClass obj3 = new ImmutableClass("123456");
        System.out.println(obj3.getPancardNumber());
    }
}