// import loops.While;
// import loops.For;
import loops.*;
public class Program {

    public static void main(String[] args) {

        // int i = 1;
        // while (i <= 10) {
        // System.out.println(i);
        // i++;
        // }
        While w = new While();
        w.printNumbers(20);
        w.printEvenNumbers(20);
        System.out.println("Sum of numbers 1-10 " + w.sumOfNumbers(10));
        System.out.println("Sum of numbers 1-100 " + w.sumOfNumbers(100));

        // --------------------do while --------------------------------------------

        int i = 1;
        do {
            System.out.println(i + " ");
            i++;
        } while (i <= 0);

        // ------------------For-----------------------------------------------------

        // int j=1 -> Initialize
        // j<=10 -> Condition. i.e until the condition is met
        // j++ -> Increment/decrement. Some times it is called as post conditon as well;
        For f = new For();
        f.printNumbers(20);
        w.printEvenNumbers(20);
        System.out.println("Sum of numbers 1-10 " + f.sumOfNumbers(10));
        System.out.println("Sum of numbers 1-100 " + f.sumOfNumbers(100));        
    }
}
