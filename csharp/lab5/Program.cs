using System.IO;
using Input;
namespace Lab5C
{
    class Program
    {
        public static void Main(string[] args)
        {
            Lab5 lab5 = new Lab5();
            lab5.Grades();
        }
    }

    class Lab5
    {
        public void Grades()
        {
            Reader reader = new Reader();
            int marks = reader.GetInt("Enter marks between1-100");
            if (marks < 50 && marks >= 0)
            {
                Console.WriteLine("Fail");
            }
            else if (marks >= 50 && marks <= 60)
            {
                Console.WriteLine("Pass");
            }
            else if (marks >= 61 && marks <= 70)
            {
                Console.WriteLine("Merit");
            }
            else if (marks >= 71 && marks <= 100)
            {
                Console.WriteLine("Distinction");
            }
            else
            {
                Console.WriteLine("Invalid marks");
            }
        }
    }
}