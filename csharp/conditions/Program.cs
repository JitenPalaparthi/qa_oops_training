using System;

namespace Lab1
{
    class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Enter a month in digit");

            byte month = byte.Parse(Console.ReadLine());
            Season season = new Season();
            string s = season.GetSeason((byte)month);
 
            if (s.Equals("winter"))
            {
                Console.WriteLine("Snowball time");
            }
            else if (s.Equals("spring"))
            {
                Console.WriteLine("Weddings and seremonies");
            }
            else if (s.Equals("autumn"))
            {
                Console.WriteLine("Leaves are falling");
            }
            else if (s.Equals("summer"))
            {
                Console.WriteLine("long evenings");
            }
            else
            {
                Console.WriteLine("There are only four seasons on earth. Probably you gave the month for any other planet");
            }
        }
    }
    public class Season
    {
        // pring (March, April, May), summer (June, July, August), autumn (September,
        // October, November) and winter (December, January, February)
        public string GetSeason(byte month)
        {
            if (month >= 3 && month <= 5)
            {
                return "spring";
            }
            else if (month >= 6 && month <= 8)
            {
                return "summer";
            }
            else if (month >= 9 && month <= 11)
            {
                return "autumn";
            }
            else if (month == 12 || month >= 1 && month <= 2)
            {
                return "winter";
            }
            else
            {
                return "wrong input";
            }
        }
    }
}