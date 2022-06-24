using System;

namespace Lesson8
{
    class Program
    {
        public static void Main(string[] args)
        {

            Car mycar = new Car();
            // mycar.make = "Ford"; this cannot be accessed because make is private
            mycar.SetMake("Ford Endeavour");
            mycar.Start();
            mycar.GetState();
            mycar.Accelerate();
            mycar.Accelerate();
            mycar.GetState();
            mycar.Accelerate();
            mycar.GetState();
            mycar.Stop();
            mycar.GetState();
            Console.WriteLine("Car with constructor--------------------------------");
            Car mycar2 = new Car("Toyota", "Yaris", 20);
            // mycar.make = "Ford"; this cannot be accessed because make is private
            mycar2.Start();
            mycar2.GetState();
            mycar2.Accelerate();
            mycar2.Accelerate();
            mycar2.GetState();
            mycar2.Accelerate();
            mycar2.GetState();
            mycar2.Stop();
            mycar2.GetState();

            Console.WriteLine("Car with chain of constructor--------------------------------");
            Car mycar3 = new Car("Yaris");
            // mycar.make = "Ford"; this cannot be accessed because make is private
            mycar3.Start();
            mycar3.GetState();
            mycar3.Accelerate();
            mycar3.Accelerate();
            mycar3.GetState();
            mycar3.Accelerate();
            mycar3.GetState();
            mycar3.Stop();
            mycar3.GetState();

        }
    }

    // create a new class called car

    class Car
    {
        private string make;
        private int speed;

        public Car()
        {

        }

        public Car(string make, int speed)
        {
            this.make = make;
            this.speed = speed;
        }
        public Car(string model) : this("toyota", 20) // Chains of constructors
        {
            // this.make = make;
            this.Model = model;
            //this.speed = speed;
        }
        public Car(string make, string model, int speed)// Chains of constructors
        {
            // this.make = make;
            this.Model = model;
            //this.speed = speed;
        }
        public string Model { get; set; }

        public string Make
        {
            get { return make; }
            set { make = value; }
        }

        public int Speed
        {
            get { return speed; }
            set
            {
                if (value > 0)
                {
                    speed = value;
                }
            }
        }


        public void Start()
        {
            Console.WriteLine("Car {0} Starting", this.make);
        }

        public void Stop()
        {
            Console.WriteLine("Car {0} Stopping", this.make);
            this.speed = 0;
        }
        public void Accelerate()
        {
            this.speed += 2;
        }

        public void GetState()
        {
            if (this.speed > 0)
            {
                Console.WriteLine("{0} is accelerating with the speed of {1}", this.make, this.speed);
            }
            else
            {
                Console.WriteLine("{0} is not accelerating.", this.make);
            }
        }

        public void SetMake(string make)
        {
            this.make = make;
        }
    }
}