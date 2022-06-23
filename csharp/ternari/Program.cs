using SalaryCaluclation;
namespace Ternari
{

    class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Enter Salary");
            double salary = double.Parse(Console.ReadLine());

            Employee emp = new Employee();
            Console.WriteLine("The salary is {0} and Bonus Amount after caluclation is {1}", salary, emp.CaluclateBonus(salary));
        }
    }

    class Employee
    {
        public double CaluclateBonus(double salary)
        {
            /* if (salary > 21000)
             {
                 return salary * 0.4;
             }
             else
             {
                 return salary * 0.2;
             }*/

            double bonus = 0;
            bonus = (salary > 21000) ?  0.2 : 0.4;

            return salary * bonus;
        }
    }

}