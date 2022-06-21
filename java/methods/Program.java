public class Program {

    public static void main(String[] args) {
        greet();
        greet("Folks!");
        greet("Hello", "Universe!");
        String str = greetr("Hey", "Bob!");
        System.out.println(str);
        double a = 101;
        int b = 203;
        int c = add((int) a, b);
        System.out.println("Addition of a and b = " + c);
        {
            int c1 = add(3423, 324234);
            System.out.println("Addition = " + c1);
        }
        //System.out.println("Addition = " + c1);
        //This c1 cannot be accessed here becuase it is out of the scope
    }

    public static void greet() {
        System.out.println("Hello World");
    }

    public static void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static void greet(String say, String name) {
        System.out.println(say + " " + name);
    }

    public static String greetr(String say, String name) {
        return say + " " + name;
    }

    public static int add(int x, int y) {
        return x + y;
    }

}

