using System;
using System.IO;
using System.Collections.Generic;

namespace FirstClass
{
    class Program
    {
        public static void Main(String[] args)
        {
            Dictionary<string, Car> dictionary = new Dictionary<string, Car>();

            dictionary.Add("KA7701", new Car("Jeep", "Compass 2022"));
            dictionary.Add("KA5467", new Car("Toyota", "Corolla 2022"));
            dictionary.Add("KA9999", new Car("Nissan", "Magma 2019"));
            var car = dictionary.GetValueOrDefault("KA7701");
            Console.WriteLine(car.make);
            foreach (var dict in dictionary)
            {
                Console.WriteLine("Key:{0} Car Make:{1} \tModel:{2}", dict.Key, ((Car)dict.Value).make, ((Car)dict.Value).model);
            }

        }
    }

    class Car
    {
        public String make;
        public String model;

        public Car(String make, String model)
        {
            this.make = make;
            this.model = model;
        }
    }
}
