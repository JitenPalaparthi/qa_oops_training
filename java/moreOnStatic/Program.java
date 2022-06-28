public class Program {

    static int id=100;
    public static void main(String[] args) {
        System.out.println("Only static fields can be accessed in the static method;Hence the id is static id:"+id);
        Car car1 = new Car("Toyota", "Corolla 2019", "100401");
        Car car2 = new Car("Toyota", "Camray", "100402");
        Car car3 = new Car("Skoda", "Rapid 2019", "100403");

        car1.getDetails();
        car2.getDetails();
        car3.getDetails();

        Car.getWheelDetails();
        //Car.addWheels();
        //car1.addSeats();
        
        // Counter related program

        Counter c1 = new Counter();
        c1.incObjCount(); // ObjectCount for c1 =1
        c1.incObjCount(); // ObjectCount for c1 =2
        c1.incCount(); // GlobalCount = 2

        Counter c2 = new Counter();
        c2.incObjCount(); // ObjectCount for c2 =1;
        c2.incObjCount(); // ObjectCount for c2 =2;
        c2.incCount(); // GlobalCount = 2 + 2 = 4

        c1.displayObjectCount(); // 2
        c2.displayObjectCount(); // 2

        Counter.incGlobalCount(); // 5
        Counter.incGlobalCount(); // 6
        Counter.incGlobalCount(); // 7
        Counter.incGlobalCount(); // 8

        Counter.displayGlobalCount(); // 8
    }
}
