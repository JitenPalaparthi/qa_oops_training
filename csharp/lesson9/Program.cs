using System;

namespace Lesson9
{
    class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Hello World");
            // Console console = new Console();
            // console.WriteLine("Hello This is called from Console Object");

            Employee emp1 = new Employee(1001, "Jiten Palaparthi");
            Console.WriteLine("Employee Number:{0} Employee Name:{1}", emp1.Number, emp1.Name);
            Console.WriteLine("Employee Company:{0}",Employee.GetDetails());
        }
    }


    class Employee
    {
        public int Number { get; set; }
        public string Name { get; set; }

        private static string Company = "QA Labs";

        public Employee(int number, string name)
        {
            this.Number = number;
            this.Name = name;
        }

        public static string GetDetails(){
            return Company;
            // Here Name and Number cannot be used here because static method can use only static fields
        }

    }
}
