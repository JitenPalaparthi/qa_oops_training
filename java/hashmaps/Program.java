import java.util.*;

public class Program {

    public static void main(String[] args) {

        // HashMap<Integer,String> map = new HashMap<Integer,String>() ;
        // map.put(522316,"Guntur");
        // map.put(560086,"Mahalakshmi,Bangalore");
        // map.put(560096,"Yeshvantpur, Bangalore");
        // String val = map.get(560096);

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("522316", "Guntur");
        map.put("560086", "Mahalakshmi,Bangalore");
        map.put("560096", "Yeshvantpur, Bangalore");
        String val = map.get("560096");

        System.out.println("Value of the map" + val);

        System.out.println("Keys and values of the map");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + ":-->" + m.getValue());
        }

        // hashmap with an object as value

        HashMap<String, Car> myMap = new HashMap<String, Car>();
        myMap.put("KA7701", new Car("Jeep","Compass 2022"));
        myMap.put("KA5467", new Car("Toyota","Corolla 2022"));
        myMap.put("KA9999", new Car("Nissan","Magma 2019"));

        for (Map.Entry m : myMap.entrySet()) {
            Car car = (Car)m.getValue();
            System.out.println(m.getKey() + ":--> Car Make:" + car.make+"\tModel:"+car.model);
        }


    }
    // keys and values are there in HashmapCar
 }

class Car {
    public String make;
    public String model;

    public Car(String make,String model) {
        this.make = make;
        this.model=model;
    }
}