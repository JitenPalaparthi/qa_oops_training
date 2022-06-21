class Program {
    public static void main(String[] args) {
        boolean isMarried = true;
        byte age = 38; // 8 bits: -127 to 127
        int yearOfBirth;
        int i = 0, j = 1;
        String name = "Jiten    Palaparthi";
        yearOfBirth = 1984;
        System.out.println("Name:" + name + "\tAge:" + age + "\tYearOfBirth:" + yearOfBirth);
        System.out.println("Married:" + isMarried);
        System.out.println("i:" + i);
        System.out.println("j:" + j);
        int x = 4;
        x = x + 5;
        System.out.println("Value of X:" + x);
        System.out.println("Cofficient Value of X:" + x / 2);

        System.out.println("Reminder of X:" + x % 2);

        float y = 9.0f;

        System.out.println("Value of Y:" + y);

        System.out.println("Cofficient Value of y:" + y / 2);

        System.out.println("Reminder of Y:" + y % 2);

        // More operations

        int a = 10, b = 5;
        a += b; // a = a+b;
        System.out.println("The value of a:" + a);

        int var1 = 0;
        int var2 = ++var1;
        int var3 = var1++;
        System.out.println("The value of var2:" + var2);
        System.out.println("The value of var3:" + var3);
        System.out.println("The value of var1:" + var1);


        // type casting 


        int n1 = 32600; // 4 bytes
       long n2 = n1; // 4 bytes can fit into 8 bytes
       System.out.println("The value of n2:" + n2);

        double d1= n2; // both are 8 bytes

        System.out.println("The value of d1:" + d1);

        //int n3 = n2; // 8 bytes cannot implicitly into 4 bytes
        n2 = 2123234531;
        short n3 = (short)n2; // type casting. If inplicit caste does not work .. do type casting on primitive types
        System.out.println("The value of n3:" + n3);
    }
}