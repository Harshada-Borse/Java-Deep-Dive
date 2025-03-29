import java.util.*;

// strongly recommandded to override equals() and hashCode() methods when using a class as a key in HashMap
// otherwise it will not work as expected

class Car {
    String brand;
    String model;

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Car car = (Car) obj;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    // Overriding hashCode() to ensure consistency with equals()
    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}

public class ClassAsKeyToHashMap {
    public static void main(String[] args) {
        HashMap<Car, Integer> carPrices = new HashMap<>();

        Car car1 = new Car("Toyota", "Corolla");
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car("Toyota", "Corolla");

        carPrices.put(car1, 20000);
        carPrices.put(car2, 22000);
        carPrices.put(car3, 21000);

        System.out.println("Size of keySet: " + carPrices.keySet().size());

        for (Car key : carPrices.keySet()) {
            System.out.println("Car: " + key.brand + " " + key.model + ", Price: $" + carPrices.get(key));
        }
    }
}
