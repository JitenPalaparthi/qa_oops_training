using System;
namespace AbstractClass
{
    class Program
    {
        public static void Main(string[] args)
        {
            try
            {
                //Account acc = new Account(); // cannot create objsect for abstract class
                Account acc;
                Console.WriteLine("Current Account----------");
                acc = new CurrentAccount(12000.57f);
                acc.DisplayBalance();
                acc.WithDraw(1200.50f);
                acc.DisplayBalance();
                Console.WriteLine("Interest on Current Account:{0}", acc.GetInterest());
                //acc.WithDraw(12000.50f);
                //acc.DisplayBalance();

                Console.WriteLine("Saving Account----------");
                acc = new SavingAccount(11000.57f);
                acc.DisplayBalance();
                acc.WithDraw(1200.50f);
                acc.DisplayBalance();
                Console.WriteLine("Interest on Saving Account:{0}", acc.GetInterest());
                acc.WithDraw(12000.50f);
                acc.DisplayBalance();
            }
            catch (Exception exp)
            {
                Console.WriteLine(exp.Message);
            }
        }
    }

    abstract class Account
    {
        public float balance;
        public abstract float WithDraw(float amt);
        public abstract float GetInterest();
        // If below method is uncommented , then it must be implemented by the derived classes. Otherwise error
        //public abstract float deposit(float amt);
        public virtual void DisplayBalance()
        {
            Console.WriteLine("Balance in the Account:{0}", this.balance);
        }
    }

    class CurrentAccount : Account
    {
        public CurrentAccount(float balance)
        {
            this.balance = balance;
        }


        public override float WithDraw(float amt)
        {
            if (amt <= this.balance)
            {
                this.balance = this.balance - amt;
            }
            else
            {
                throw new Exception("Error----> Low balance.");
            }
            return this.balance;
        }

        public override float GetInterest()
        {
            return this.balance * 0.5f;
        }


    }

    class SavingAccount : Account
    {

        public SavingAccount(float balance)
        {
            this.balance = balance;
        }


        public override float WithDraw(float amt)
        {

            if (amt <= this.balance)
            {
                this.balance = this.balance - amt;
            }
            else
            {
                throw new Exception("Error---> Low balance.");
            }
            return this.balance;
        }

        public override float GetInterest()
        {
            return this.balance * 0.8f;
        }


    }
}
