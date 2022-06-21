import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("What is your name?");

        String name = s.nextLine();

        System.out.println("What is your age?");

        byte age = s.nextByte();

        //System.out.println("The entered Name is " + name + " and Age is " + age);
        System.out.printf("The entered Name is %s and Age is %d\n",name,age);

        int num = 878782278;

        System.out.printf("The number is %d\n",num);
        System.out.printf("The number is %8d\n",num);
        System.out.printf("The number is %08d\n",num);
        System.out.printf("The number is %,8d\n",num);
        System.out.printf("The number is %+8d\n",num);

        double pi = Math.PI; 
        System.out.printf("%f\n", pi);       // "3.141593" 
        System.out.printf("%.3f\n", pi);     // "3.142" 
        System.out.printf("%10.3f\n", pi);    // "   3.142" 
        System.out.printf("%-10.3f\n", pi);  // "3.142" 

       }
}
