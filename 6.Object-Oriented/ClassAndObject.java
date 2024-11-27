/**
 * Demonstrates creating a class and object in Java.
 */
class Car {
    String brand; // Car brand
    int speed;    // Car speed

    /**
     * Displays the car's information.
     */
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.speed = 120;
        car.displayInfo();
    }
}