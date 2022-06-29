import java.util.*;
import java.lang.*;

public class Program {

    public static void main(String[] args) {
        Car car1 = null; // java.lang.NullPointerException
        try {
            System.out.println("Make:" + car1.Make + "\tModel:" + car1.Model);
        } catch (NullPointerException exp) {
            System.out.println("There seems to be an expception:" + exp.getMessage());
        } finally {
            System.out.println("This block is executed whether or not there is an exception");
        }

    }

    public static void displayCar(Car car){
        System.out.println("Make:" + car.Make + "\tModel:" + car.Model);
    }

}

class Car {
    public String Make;
    public String Model;
}
