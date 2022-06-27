
//import java.util.ArrayList;
import java.util.*;

public class Program {
    public static void main(String[] args){
        ArrayList arr = new ArrayList();
        /*arr.Add("Jiten");
        arr.Add("Ash");
        arr.Add("Dave");
        arr.Add("Syed");
        arr.Add("Kenneth");*/
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Enter a name->"+ i);
            String name = scanner.nextLine();
            arr.add(name);
        }
        System.out.println("\n\n--- Names are ----");
       
        for (int i=0;i<arr.size();i++)
        {
            System.out.println("Name-->"+(i+1)+": "+  arr.get(i));
            
        }
        System.out.println("Enter a number to delete from the list");
        int d = scanner.nextInt();
        arr.remove(d-1);
        arr.set(0,"Jitendranadh");
        arr.add(true);
        arr.add(12.45);
        arr.add(new Car("Ford"));
        arr.add(new Car("Toyota"));
    
        System.out.println("\n\n--- Names after deletion are ----");
        for (int i=0;i<arr.size();i++)
        {
            System.out.println("Name-->"+(i+1)+": "+  arr.get(i));
       }

    }
}

class Car {
    String make;

    Car(String make) {
        this.make = make;
    }
}