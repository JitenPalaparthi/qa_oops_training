import java.util.*;

public class Program {
    public static void main(String[] args) {
        Car mycar = new Car();

        // mycar.make = "Ford"; This cannot be done because make is private
        mycar.setMake("Ford Endeavour");
        mycar.start();
        mycar.getState();
        mycar.accelerate();
        mycar.getState();
        mycar.accelerate();
        // mycar.speed=260;
        mycar.getState();
        mycar.accelerate();
        mycar.stop();
        mycar.getState();

        System.out.println("Car with constructor--------------------------------");

        Car mycar2 = new Car("Toyota", "Yaris", 20);
        mycar2.start();
        mycar2.getState();
        mycar2.accelerate();
        mycar2.getState();
        mycar2.accelerate();
        // mycar.speed=260;
        mycar2.getState();
        mycar2.accelerate();
        mycar2.stop();
        mycar2.getState();

        System.out.println("Car with chain of constructor--------------------------------");

        Car mycar3 = new Car("Yaris");
        mycar3.start();
        mycar3.getState();
        mycar3.accelerate();
        mycar3.getState();
        mycar3.accelerate();
        // mycar.speed=260;
        mycar3.getState();
        mycar3.accelerate();
        mycar3.stop();
        mycar3.getState();

        Car mycar5 = getPoolCar();
        // mycar5.start();
        Car mycar6 = getHireCar();
        mycar6.start();
        mycar6.stop();
    }

    public static Car getPoolCar() {
        Car pCar = null;

        return pCar;
    }

    public static Car getHireCar() {
        Car hCar = new Car("Corolla");

        return hCar;
    }

}

class Car {
    private String make;
    private int speed;
    private String model;

    public Car() {

    }

    public Car(String make, int speed) {
        this.make = make;
        this.speed = speed;
    }

    public Car(String model) {
        this("toyota", model, 20);
    }

    public Car(String make, String model, int speed) {
        this.make = make;
        this.model = model;
        this.speed = speed;
    }

    public void start() {
        System.out.println("Car " + make + " Starting");
    }

    public void stop() {
        System.out.println("Car " + make + " Stopping");
        this.speed = 0;
    }

    public void accelerate() {
        this.speed += 2;
    }

    public void getState() {
        if (this.speed > 0) {
            System.out.println(this.make + " is accelerating with the speed of " + this.speed);
        } else {
            System.out.println(this.make + " is not accelerating.");
        }
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}