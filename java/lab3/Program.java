package lab3;

import java.util.Scanner;
//import pack1;

class Program {
    public static void main(String[] args) {
        // Part 1 solution
        // theLunchQueue();
        // Part 3 solution
        //int weight = getInt("Enter total weight in pounds");
        // convertInputToStonesPounds(weight);
        // part4
        Lab3Exercise lab3 = new Lab3Exercise();
        lab3.theLunchQueue();

        int weight = lab3.getInt("\nEnter total weight in pounds");
        lab3.convertInputToStonesPounds(weight);

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

    public static void convertInputToStonesPounds(int pounds) {
        System.out.println("stones " + pounds / 14 + " & pounds " + pounds % 14);
    }
}

class Lab3Exercise {

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