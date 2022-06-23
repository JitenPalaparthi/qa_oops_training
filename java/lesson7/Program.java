import java.util.*;

class Program {

    public static void main(String[] args) {
        float marks[] = { 50.50f, 64.75f, 78.75f, 56.25f };
        String names[] = { "Jiten", "Rahim", "Ben", "Bob" };

        System.out.println("Assigning and accessing values in an array");

        for (int i = 0; i < names.length; i++) {
            if (names.length != marks.length) {
                break;
            }
            System.out.println("Name:" + names[i] + "\t marks:" + marks[i]);
        }
        System.out.println("Assigning and accessing values in an array with for-each kind of loop");
        int j = 0;

        for (String name : names) {
            System.out.println("Name:" + name + "\t marks:" + marks[j]);
            j++;
        }
        System.out.println("Creating array with new keyword");

        String[] cities = new String[3];

        cities[0] = "Bangalore";
        cities[1] = "London";
        cities[2] = "Sidney";
        for (String c : cities) {
            System.out.println("Name of the city:" + c);
            j++;
        }

        System.out.println("Creating array and assigning values using random number package");
        // int nums[]=new int[10];
        int[] nums = new int[10];
        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100);
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("Sum of numbers in nums array:" + sum);

        // Two dimentionsal array

        System.out.println("Creating 2d array which is 2X3");

        int[][] twoDArray = new int[20][30];
        // in c# int[,] twoDArray = new int[2,2]
        // can assign values directly in hava like the following int[][] twoD = { { 1, 2 }, { 3, 4 } };

        System.out.println("Assigning random values to 2d array");
            System.out.println("Total rows length"+twoDArray.length);
            for (int row = 0; row < twoDArray.length;row++) {
                 for (int col = 0; col <twoDArray[row].length;col++) {
                twoDArray[row][col] = random.nextInt(100);
            }
        }
        System.out.println("Displaying values of 2d array");
        for (int row = 0; row <twoDArray.length;row++) {
            for (int col = 0; col < twoDArray[row].length;col++) {
                System.out.print(twoDArray[row][col] + " ");
            }
            System.out.println();
        }

    }
}