using System;
namespace InterfacesDemo
{
    class Program
    {
        public static void Main(string[] args)
        {
            try
            {
                CurrentAccount acc = new CurrentAccount(12500);
                ManageAccount(acc);

            }
            catch (Exception exp)
            {
                Console.WriteLine(exp.Message);
            }
        }
        public static void ManageAccount(IAccount iacc)
        {
            iacc.Display();
            iacc.WithDraw(1299);
            iacc.Display();
            iacc.WithDraw(12000);
        }

    }

    public interface IAccount:IDisplay,IInterest
    {
        float WithDraw(float amt);
        
    }

    public interface IInterest
    {
        float GetInterest();
    }

    public interface IDisplay
    {
        public void Display();
    }

    class Account
    {
        public float balance;
        public void Display()
        {
            Console.WriteLine("Balance in the Account:{0}", this.balance);
        }
    }

    class CurrentAccount : Account, IAccount
    {
        public CurrentAccount(float balance)
        {
            this.balance = balance;
        }


        public float WithDraw(float amt)
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

        public float GetInterest()
        {
            return this.balance * 0.5f;
        }


    }

    class SavingAccount : Account, IAccount
    {

        public SavingAccount(float balance)
        {
            this.balance = balance;
        }


        public float WithDraw(float amt)
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

        public float GetInterest()
        {
            return this.balance * 0.8f;
        }

    }
}
