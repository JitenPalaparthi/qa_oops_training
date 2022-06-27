
//import java.util.ArrayList;
import java.util.*;

public class Program {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList();
        arr.add("Jiten");
        arr.add("Ash");
        arr.add("Dave");
        arr.add("Syed");
        arr.add("Kenneth");

        System.out.println("\n\n--- Names are ----");
        
        for (int i=0;i<arr.size();i++)
        {
            System.out.println("Name-->"+(i+1)+": "+  arr.get(i));
       }

        ArrayList<Car> arrCars = new ArrayList();
        arrCars.add(new Car("Ford"));
        arrCars.add(new Car("Toyota"));

        System.out.println("\n\n--- cars are ----");
        for (int i=0;i<arrCars.size();i++)
        {
            System.out.println("Name-->"+(i+1)+": "+  arrCars.get(i));
       }

       
    }
}

class Car {
    String make;

    Car(String make) {
        this.make = make;
    }
}