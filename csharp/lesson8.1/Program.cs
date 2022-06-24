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
        }
    }

    // create a new class called car

    class Car
    {
        private string make;
        private int speed;
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
            }else{
                Console.WriteLine("{0} is not accelerating.",this.make);
            }
        }

        public void SetMake(string make){
            this.make = make;
        }

    }
}