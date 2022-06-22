using System.IO;

namespace Conditions.Examples
{

    class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Enter speed in number of Miles");
            short speed = short.Parse(Console.ReadLine());

            if (speed >= 70)
            {
                Console.WriteLine("Speeding");
            }
            else if (speed < 70)
            {
                if (speed >= 50)
                {
                    Console.WriteLine("Not speeding but going on okay speed");
                }
                else if (speed < 50)
                {
                    if (speed >= 30)
                    {
                        Console.WriteLine("Slow Progress");
                    }
                    else
                    {
                        Console.WriteLine("Heldup..");
                    }
                }

            }

        }
    }
}


