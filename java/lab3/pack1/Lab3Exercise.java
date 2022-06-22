package pack1;
import java.util.Scanner;

public class Lab3Exercise {

    public int getInt(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public void theLunchQueue() {
        String mainCourse = getString("What main dish would you like(Fish, Burgers or veg) ?");
        int xx = getInt("How many roast potatos would you like?");
        int yy = getInt("How many Brussel Sprouts would you like?");
        System.out.printf("Hello, your lunch is %s with %d roast potatoes and %d Brussel sprouts", mainCourse, xx, yy);
    }

    public void convertInputToStonesPounds(int pounds) {
        System.out.println("stones " + pounds / 14 + " & pounds " + pounds % 14);
    }
} 