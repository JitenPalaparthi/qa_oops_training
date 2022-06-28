import java.util.*;
import java.io.*;
import empsal.Employee;

public class Program {
    public static void main(String[] arguments) throws IOException {
        System.out.println("Hello World");
        // Creating Variables

        int number = 100;
        float sal = 10000.50f;
        boolean isMarried = false;

        System.out.println("Number:" + number);
        System.out.println("Salary:" + sal);
        System.out.println("IsMarried:" + isMarried);

        // if sal >10000 <=12000 then bonus is 5%
        // if sal <=10000 then bouns is 8%
        // if sal>12000 then bonus is 4%

        // taking input from the keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter salary to calculate bonus");
        sal = scanner.nextFloat();
        float bonus = calculateBonus(sal);
        System.out.println("Bonus:" + bonus);
        System.out.println("Total Salary+ Bonus:" + (sal + bonus));

        // Create an array to calculate bonus

        // float[] sals= new float[5];
        /*
         * float sals[]= new float[5];
         */
        String names[] = { "Jiten", "Ash", "Aron", "Kennith", "Ian" };
        int[] ids = { 101, 102, 103, 104, 105 };
        float sals[] = { 10000.50f, 8000.0f, 12000.50f, 13000.0f, 6598.50f };
        float[] bonuses = new float[sals.length];

        for (int i = 0; i < sals.length; i++) {
            bonuses[i] = calculateBonus(sals[i]);
        }
        System.out.println("\n\nEmployee Details-------------------------------------------------------------------");
        int index = 0;
        for (int id : ids) {
            System.out.println("Name:" + names[index] + "\tID:" + id + "\tSalary:" + sals[index] + "\tBonus:"
                    + bonuses[index] + "\t Total[Sal+Bonus]:" + (sals[index] + bonuses[index]));
            index++;
        }

        // Employee details through a class

        ArrayList<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee("Jiten", 101, 12000.56f));
        empList.add(new Employee("Ash", 102, 16431.48f));
        empList.add(new Employee("Ian", 103, 15897.83f));
        empList.add(new Employee("Stefi", 104, 18767.46f));
        empList.add(new Employee("Mathew", 105, 12999.78f));
        System.out.println("\n\n\nEmployee details from emp class");

        for (Employee emp : empList) {
            emp.calculateBonus();
            String linecl = emp.displayEmployee();
            appendFile("employee-details.txt",line);
        }

        // Save details of employee in a file


    }
 public static void appendFile(String inFile, String line) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(inFile, true));
        out.write(line);
        out.close();
    }
    public static float calculateBonus(float sal) {
        // if else condition
        if (sal <= 10000) {
            return getBonus((byte) 8, sal);
        } else if (sal > 10000 && sal <= 12000) {
            return getBonus((byte) 5, sal);
        } else if (sal > 12000) {
            return getBonus((byte) 4, sal);
        } else {
            return 0;
        }

    }

    public static float getBonus(byte bonus, float sal) {
        return sal * bonus / 100;
    }
}
