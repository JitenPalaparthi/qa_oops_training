using System;

namespace Lesson6
{
    class Program
    {
        public static void Main(string[] args)
        {
            // Create a simple array and assigned values to the array
            string[] names = { "Jiten", "Aron", "Ash", "Ken", "Mat", "Syed", "Stefi" };
            float[] marks = { 50.5f, 80.75f, 84.0f, 82.75f, 87.50f, 94.25f, 68.75f };
            Console.WriteLine("Accessing elements in an array");
            for (int i = 0; i < names.Length; i++)
            {
                //if (names.Length != marks.Length)
                if (!(names.Length == marks.Length))
                {
                    break;
                }
                Console.WriteLine("Name: {0}\tMarks: {1}", names[i], marks[i]);
            }
            //for(string name : names){}

            Console.WriteLine("\n\nUsing foreach loop in an array");
            int j = 0;
            foreach (string name in names)
            {
                Console.WriteLine("Name: {0}\tMarks: {1}", name, marks[j]);
                j++;
            }
            Console.WriteLine("\n\nInitializing array using new");

            string[] cities = new string[3]; // need to use new because we are creating object
            cities[0] = "Bangalore";
            cities[1] = "Goa";
            cities[2] = "London";

            foreach (string city in cities)
            {
                Console.WriteLine("Name of the City: {0}", city);
            }

            Console.WriteLine("\n\nSum of elements in an array");
            int[] nums = new int[10];
            Random rand = new Random();
            Console.WriteLine("Assigning random values max is 100 to the nums array");
            for (int i = 0; i < nums.Length; i++)
            {
                nums[i] = rand.Next(100);
            }

            for (int i = 0; i < nums.Length; i++)
            {
                Console.Write("{0} ", nums[i]);
            }
            // For clarity doing the sum of numbers in a separate loop
            int sum = 0;
            for (int i = 0; i < nums.Length; i++)
            {
                sum += nums[i];
            }
            Console.WriteLine("\nSum of numbers in the array nums:{0}", sum);

            Console.WriteLine("\n\nMultidimentional array by direct assignment");

            int[,] twoD = { { 10, 11 }, { 12, 13 } };
            foreach (int num in twoD)
            {
                Console.Write(num + " ");
            }

            Console.WriteLine("\n\nMultidimentional array");

            int[,] twoDNums = new int[2, 2];
            twoDNums[0, 0] = 1;
            twoDNums[0, 1] = 2;
            twoDNums[1, 0] = 3;
            twoDNums[1, 1] = 4;
            for (int row = 0; row < twoDNums.GetLength(0); row++)
            {
                for (int col = 0; col < twoDNums.GetLength(1); col++)
                {
                    Console.Write(twoDNums[row, col] + " ");
                }
                Console.WriteLine();
            }
        }
    }
}