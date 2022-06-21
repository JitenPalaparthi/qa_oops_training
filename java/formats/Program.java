import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        int num = 878782278;
        System.out.printf("The number is %d\n", num);
        System.out.printf("The number is %8d\n", num);
        System.out.printf("The number is %08d\n", num);
        System.out.printf("The number is %,8d\n", num);
        System.out.printf("The number is %+8d\n", num);
        double pi = Math.PI;
        System.out.printf("%f\n", pi); // "3.141593"
        System.out.printf("%.3f\n", pi); // "3.142"
        System.out.printf("%10.3f\n", pi); // " 3.142"
        System.out.printf("%-10.3f\n", pi); // "3.142"

        System.out.println(getData("Jiten",(byte)39));

    }

    public static String getData(String name, byte age) {

        // String str = String.format("Name is %s and Age is %d", name, age);
        return String.format("Name is %s and Age is %d", name, age);
        // return str;
    }
}
