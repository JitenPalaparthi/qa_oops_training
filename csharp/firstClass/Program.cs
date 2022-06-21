using System;
using System.IO;

namespace FirstClass
{
    class Program
    {
        public static void Main(String[] args)
        {
            Greet();

            Tax tax = new Tax();
            double myTax=tax.GetTax(12000.345);
            //Console.WriteLine("Tax is "+myTax.ToString());
            Console.WriteLine("Tax is {0}",myTax);
        }

        public static void Greet()
        {
            Console.WriteLine("Hello World!");
        }

    }

    class Tax{
        public double GetTax(double salary){
            return salary * 0.25;
        }
    }
}
