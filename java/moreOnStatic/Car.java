
public class Car {
    String make;
    String model;
    String chassis;
    final int seats; // final is readonly in c#. this field cannot be modified
    final static byte Wheels = 4;

    public Car(String mk, String mdl, String chs) {
        this.make = mk;
        this.model = mdl;
        this.chassis = chs;
        this.seats = 5;
    }

    public static void addWheels() {
       // Car.Wheels++; // If wheels is declared as final then it cannot be changed.
        // Finals are immutables.
    }

    public void addSeats() {
        //this.seats++; // If seats is declared as final then it cannot be changed.
        // Finals are immutables.
    }

    public void getDetails() {
        String details = String.format("Car Make:%s\t Model:%s\tChassis:%s\tSeats:%d \tWheels:%d", this.make, this.model,
                this.chassis,this.seats, Car.Wheels);
        System.out.println(details);
    }

    public static void getWheelDetails() {
        System.out.println("All cars have " + Wheels + " wheels!");
    }
}
