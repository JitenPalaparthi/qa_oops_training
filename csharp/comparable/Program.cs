using System.IO;
using System.Collections.Generic;
using System.Collections;
namespace Comparable
{
    public class Program
    {
        public static void Main(String[] args)
        {

            List<Account> arr = new List<Account>();
            arr.Add(new Account(101, 2000, "Jiten"));
            arr.Add(new Account(102, 2200, "Rajan"));
            arr.Add(new Account(103, 10000, "Anil"));
            arr.Sort();
            foreach(Account acc in arr){
                Console.WriteLine("Name:{0}\tId:{1}\tbalance:{2}",acc.name,acc.id,acc.balance);
            }
        }
    }

    class Account : IComparable
    {
        public int id, balance;
        public string name;

        public Account(int id, int balance, String name)
        {
            this.id = id;
            this.balance = balance;
            this.name = name;
        }
        public int CompareTo(Object obj)
        {
            return this.balance - ((Account)obj).balance;
        }
    }
}
