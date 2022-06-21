package lab3;

import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        theLunchQueue();
    }

    public static int getInt(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static String getString(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static void theLunchQueue() {
        String mainCourse = getString("What main dish would you like(Fish, Burgers or veg) ?");
        int xx = getInt("How many roast potatos would you like?");
        int yy = getInt("How many Brussel Sprouts would you like?");
        System.out.printf("Hello, your lunch is %s with %d roast potatoes and %d Brussel sprouts", mainCourse, xx, yy);
    }
}