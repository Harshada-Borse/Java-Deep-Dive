import java.util.Objects;

class PersonA {
    String name;
    int age;

    PersonA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null)
            return false;

        // Allow comparison with PersonB
        if (obj instanceof PersonB) {
            PersonB other = (PersonB) obj;
            return Objects.equals(this.name, other.name) && this.age == other.age;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

class PersonB {
    String name;
    int age;

    PersonB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null)
            return false;

        // Allow comparison with PersonA
        if (obj instanceof PersonA) {
            PersonA other = (PersonA) obj;
            return Objects.equals(this.name, other.name) && this.age == other.age;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class EqualityOfObjects {
    public static void main(String[] args) {
        PersonA p1 = new PersonA("Alice", 25);
        PersonB p2 = new PersonB("Alice", 25);
        PersonB p3 = new PersonB("Bob", 30);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p2.equals(p1)); // true
        System.out.println(p1.equals(p3)); // false
    }
}
