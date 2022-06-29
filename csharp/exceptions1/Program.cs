using System;

namespace Exceptions
{

    class Program
    {
        public static void Main(string[] args)
        {
            Car car1 = new Car();
            try
            {
                //car1 = null;
                Console.WriteLine("Make:{0} Model{1}", car1.Make, car1.Model);

                car1 = new Car();
                car1.Make = "Hundai";
                car1.Model = "Getz";
                Console.WriteLine("Make:{0} Model{1}", car1.Make, car1.Model);
            }
            //catch (System.NullReferenceException e)
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            finally{
                Console.WriteLine("This block will be executed whether or not there is an exception");
            }

        }
    }

    class Car
    {
        public string Make { get; set; }
        public string Model { get; set; }
    }

}

