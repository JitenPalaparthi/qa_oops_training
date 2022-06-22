import java.util.Scanner;
import seasons.Season;

public class Program {
    public static void main(String[] args) {
        System.out.println("Enter age");

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.printf("\nYour aga is %d. You are eligible for vote", age);
        } else {
            System.out.printf("\nYour aga is %d. You are not eligible for vote", age);
        }
        System.out.println("");
        // Another example
        System.out.println("Enter a month in digit");

        int month = scanner.nextInt();
        Season season = new Season();
        String s = season.getSeason((byte)month);

        if (s.equals("winter")) {
            System.out.println("Snowball time");
        } else if (s.equals("spring")) {
            System.out.println("Weddings and seremonies");
        } else if (s.equals("autumn")) {
            System.out.println("Leaves are falling");
        } else if (s.equals("summer")) {
            System.out.println("long evenings");
        } else {
            System.out
                    .println("There are only four seasons on earth. Probably you gave the month for any other planet");
        }
    }
}