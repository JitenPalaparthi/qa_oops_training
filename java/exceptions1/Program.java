import java.util.*;
import java.io.*;
import java.lang.*;

public class Program {

    public static void main(String[] args) {
        try {
            Car car1 =new Car(); // java.lang.NullPointerException
            displayCar(car1);
        } catch (NullPointerException exp) {
            System.out.println("Null exception-->" + exp.getMessage());
        } catch (Exception exp) {
            System.out.println("exception-->" + exp.getMessage());
        } finally {
            System.out.println("This block is executed whether or not there is an exceptionn");
        }
    }

    public static void displayCar(Car car) throws NullPointerException, Exception {
            if((car!=null)&&(car.Make==null || car.Model==null)){
                throw new Exception("Car Make or Model cannot be null"); // Custom exception
            }
            System.out.println("Make:" + car.Make + "\tModel:" + car.Model);
       }

}

class Car {
    public String Make;
    public String Model;
}
