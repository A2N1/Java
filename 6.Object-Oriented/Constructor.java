/**
 * Demonstrates constructors in Java.
 */
class Car {
    String brand;

    /**
     * Constructor to initialize the car brand.
     *
     * @param brand The brand of the car
     */
    Car(String brand) {
        this.brand = brand;
    }

    /**
     * Displays the car's information.
     */
    void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        car.displayInfo();
    }
}