namespace Conditions
{

    class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Enter Name");
            string name = Console.ReadLine();

            // if (name.EndsWith("ra")){

            // }else{
            //     Console.WriteLine("{0} does not ends with ra");
            // }

            // if (name.EndsWith("ra") == false)
            // {
            //     Console.WriteLine("{0} does not end with ra");
            // }
            // if (name.EndsWith("ra") != true)
            // {
            //     Console.WriteLine("{0} does not end with ra");
            // }

            if (!name.EndsWith("ra") == true)
            {
                Console.WriteLine("{0} does not end with ra", name);
            }

            Console.WriteLine("Enter Year to find whether the year is leapyear or not");
            int year = int.Parse(Console.ReadLine());

            // if (year % 4 == 0)
            // {
            //     Console.WriteLine("{0} is a leap year");
            // }
            // else
            // {
            //     Console.WriteLine("{0} is not a leap year");
            // }


            if (!(!(!(year % 4 != 0))))
            {
                Console.WriteLine("{0} is a leap year", year);
            }
            else
            {
                Console.WriteLine("{0} is not a leap year", year);
            }


            int var1 = 7, var2 = 13, var3 = 0;

            bool flag = (var1 > var2) && (var3++ == 0);
            Console.WriteLine(var3++ == 0);
            Console.WriteLine(var3++ == 0);
            //false && (true)
            //false
            Console.WriteLine(flag);

        }
    }
}