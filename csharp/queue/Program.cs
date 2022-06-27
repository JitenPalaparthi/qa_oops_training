using System;
using System.Collections.Generic;
namespace FirstClass
{
    class Program
    {
        public static void Main(String[] args)
        {
            Payment payment = new Payment();
            payment.AddBasket(new Basket(100, "Samgsung Galaxy Phone", 2, 1200.34));
            payment.AddBasket(new Basket(101, "Iphone 13", 6, 3045.50));
            payment.AddBasket(new Basket(102, "Motorola Racer", 7, 900.45));
            payment.AddBasket(new Basket(103, "Nokia N", 3, 400));
            payment.AddBasket(new Basket(104, "HTC 1022", 4, 789.30));

            //Process payment

            payment.ProcessBasket();
            payment.ProcessBasket();
            payment.ProcessBasket();
            payment.ProcessBasket();

        }
    }

    public class Payment
    {
        public Queue<Basket> baskets = new Queue<Basket>();

        public void AddBasket(Basket basket)
        {
            baskets.Enqueue(basket);
        }

        public void ProcessBasket()
        {
            if (baskets.Count > 0)
            {
                Basket basket = baskets.Dequeue();
                basket.MakePayment();
            }
        }
    }

    public class Basket
    {
        public int ID;
        public string Item;
        public int Quantity;

        public double Amount;
        public Basket(int id, string item, int quantity, double amount)
        {
            this.ID = id;
            this.Item = item;
            this.Quantity = quantity;
            this.Amount = amount;
        }

        public void MakePayment()
        {
            Console.WriteLine("Basket ID: {0} Item:{1} and Quantity:{2} make payment of {3}", this.ID, this.Item, this.Quantity, this.Quantity * this.Amount);
        }
    }
}
