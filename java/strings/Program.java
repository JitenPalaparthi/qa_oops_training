import java.util.*;

public class Program {

    public static void main(String[] args) {
        String name = "Jiten";

        name = name + " Palaparthi";

        System.out.println(name);

        String str1 = new String("Jiten");
        String str2 = new String("Jiten");

        if (str1.equals(str2)) {
            System.out.println("Botht the strs are equal");
        } else {
            System.out.println("Botht the strs are not equal");
        }

        if (str1 == str2) {
            System.out.println("Botht the strs are equal");
        } else {
            System.out.println("Botht the strs are not equal");
        }

        String s1 = "Ash";
        String s2 = s1;

        s1 = "Ashiq";
        System.out.println(s1 + " : " + s2);

        String s3 = new String("Ash");
        String s4 = s3;

        s3 = "Ashiq";
        System.out.println(s3 + " : " + s4);

        String s5 = "Frederica";
        System.out.println(s5.substring(2, 4));

        System.out.println(s5.substring(0, s5.length() - 1));
        // To upper case

        String s6 = "Fred";
        s6 += " Bloggs    ";
        System.out.println(s6.trim());
        System.out.println(s6.substring(0, 4).toLowerCase());
        System.out.println(s6.substring(5, s6.length() - 1).toUpperCase());
        System.out.println(s6);

        String s = "Hello World";
        // char c = s.charAt(2); // would be ‘e’
        for (char c : s.toCharArray()) {
            System.out.println(c);
        }

        StringBuilder sb = new StringBuilder("Jiten");
        sb.append("Palaparthi");
        sb.delete(5, 12);

        System.out.println(sb);


    }

}
