using System;

namespace Lab1
{
    class Program
    {
        public static void Main(string[] args)
        {
            LunchQueue lQ = new LunchQueue();
            lQ.TheLunchQueue();
            //TheLunchQueue();
        }

      /*  public static int GetInt(string prompt)
        {
            Console.WriteLine(prompt);
            int num = int.Parse(Console.ReadLine());
            return num;
        }

        public static string GetString(string prompt)
        {
            Console.WriteLine(prompt);
            string val = Console.ReadLine();
            return val;
        }

        public static void TheLunchQueue()
        {
            string mainDish = GetString("What main dish would you like(Fish, Burgers or veg) ?");
            int potatos = GetInt("How many roast potatos would you like?");
            int sprouts = GetInt("How many Brussel sprouts would you like?");
            string output = $"Hello, your lunch is {mainDish} with {potatos} roast potatoes and {sprouts} Brussel sprouts";
            Console.WriteLine(output);
        }*/

    }

    class LunchQueue{
        public int GetInt(string prompt)
        {
            Console.WriteLine(prompt);
            int num = int.Parse(Console.ReadLine());
            return num;
        }

        public string GetString(string prompt)
        {
            Console.WriteLine(prompt);
            string val = Console.ReadLine();
            return val;
        }

        public void TheLunchQueue()
        {
            string mainDish = GetString("What main dish would you like(Fish, Burgers or veg) ?");
            int potatos = GetInt("How many roast potatos would you like?");
            int sprouts = GetInt("How many Brussel sprouts would you like?");
            string output = $"Hello, your lunch is {mainDish} with {potatos} roast potatoes and {sprouts} Brussel sprouts";
            Console.WriteLine(output);
        }

    }

}