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

    }
}

class Car {
    private String make;
    private int speed;

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

    public void setMake(String make) {
        this.make = make;
    }
}