using System;
namespace Inheritance
{
    class Program
    {
        public static void Main(string[] args)
        {
            try
            {
                Voter v1 = new Voter("Jiten", (byte)37, "JitenP@Outlook.Com");
                v1.Vote();
                v1.ShowVoter();

                Voter v2 = new Voter("Jiten", (byte)17, "JitenP@Outlook.Com");
                v2.Vote();
                v2.ShowVoter();
            }
            catch (VoteException exp)
            {
                Console.WriteLine(exp.Message);
                Console.WriteLine(exp.VoteMessage());
            }

        }
    }
    class Voter
    {
        public string name;
        public byte age;
        public string email;
        public bool isVoted;

        public Voter(string name, byte age, string email)
        {
            this.name = name;
            this.age = age;
            this.email = email;
            this.isVoted = false;
        }

        public void Vote()
        {
            if (age < 18)
            {
                throw new VoteException(age, "age is " + age.ToString() + ".Age is less then 18 years. Invalid Voter exception");
            }
            this.isVoted = true;
        }

        public void ShowVoter()
        {
            Console.WriteLine("Name:{0}\temail:{1}\tAge:{2}:\tVoting Status:{3}\n", this.name, this.email, this.age, this.isVoted);
        }
    }

    class VoteException : Exception
    {
        byte data;
        public VoteException(byte data, String message) : base(message)
        {
            this.data = data;
        }

        public string VoteMessage()
        {
            return "Invalid voter data;age is " + this.data.ToString();
        }

    }
}

