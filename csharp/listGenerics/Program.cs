using System;
using System.Collections;
namespace FirstClass
{
    class Program
    {
        public static void Main(String[] args)
        {
            List<string> arr = new List<string>();
            arr.Add("Jiten");
            arr.Add("Ash");
            arr.Add("Dave");
            arr.Add("Syed");
            arr.Add("Kenneth");
            Console.WriteLine("\n\n--- Names are ----");
            int j = 1;
            foreach (var name in arr)
            {
                Console.WriteLine("Name-->{0} :{1}", j, name);
                j++;
            }
            List<Car> arrCars = new List<Car>();
            arrCars.Add(new Car("Toyoto"));
            arrCars.Add(new Car("Ford"));
            arrCars.Add(new Car("Kia"));

            foreach (Car c in arrCars)
            {
                Console.WriteLine("Make:{0}", c.make);
            }
        }
    }
    class Car
    {
        public string make;

        public Car(string make)
        {
            this.make = make;
        }
    }
}
