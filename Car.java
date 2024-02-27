//import java.util.scanner;
class Car {
    public String carName;

    // Parameterized constructor
    public Car(String carName) {
        this.carName = carName;
    }

    // Copy constructor (constructor that takes an object of the same class)
    public Car(Car c) {
        this.carName = c.carName;
    }
}

class Codechef {
    public static void main(String[] args) {
        Car originalCar = new Car("Creta"); // Parameterized constructor called here
        System.out.println(originalCar.carName);

        Car copiedCar = new Car(originalCar); // Copy constructor called here
        System.out.println(copiedCar.carName);
        
    }
}
