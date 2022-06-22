import java.util.*;

class Program {
    public static void main(String[] args) {
        System.out.println("Enter a day in number 1-7");
        Scanner s = new Scanner(System.in);
        byte day = s.nextByte();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("No day that matches the given day number");
        }
/* 
        if (day == 1) {
            System.out.println("Sunday");

        } else if (day == 2) {
            System.out.println("Monday");

        } else if (day == 3) {
            System.out.println("Tuesday");

        } else if (day == 4) {
            System.out.println("Wednesday");

        } else if (day == 5) {
            System.out.println("Thursday");

        } else if (day == 6) {
            System.out.println("Friday");

        } else if (day == 7) {
            System.out.println("Saturday");

        } else {
            System.out.println("No day that matches the given day number");

        }*/

    }

}
