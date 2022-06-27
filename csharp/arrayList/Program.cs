using System;
using System.Collections;
namespace FirstClass
{
    class Program
    {
        public static void Main(String[] args)
        {
            ArrayList arr = new ArrayList();
            /*arr.Add("Jiten");
            arr.Add("Ash");
            arr.Add("Dave");
            arr.Add("Syed");
            arr.Add("Kenneth");*/
            for (int i = 1; i <= 10; i++)
            {
                Console.WriteLine("Enter a name->{0}", i);
                string name = Console.ReadLine();
                arr.Add(name);
            }
            Console.WriteLine("\n\n--- Names are ----");
            int j = 1;
            foreach (var name in arr)
            {
                Console.WriteLine("Name-->{0} :{1}", j, name);
                j++;
            }
            Console.WriteLine("Enter a number to delete from the list");
            int d = int.Parse(Console.ReadLine());
            arr.RemoveAt(d-1);

            Console.WriteLine("\n\n--- Names after deletion are ----");
            int k = 1;
            foreach (var name in arr)
            {
                Console.WriteLine("Name-->{0} :{1}", k, name);
                k++;
            }

        }
    }
}
