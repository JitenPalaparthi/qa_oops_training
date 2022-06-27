using System.IO;
using System.Collections.Generic;
namespace Hello
{
    public class Program
    {
        public static void Main(String[] args)
        {
            List<string> flavours = new List<string>(){
    "Strawberry", "Orange", "Apple", "Vanilla", "Chocolate"};

            foreach (string fruit in flavours)
            {
                Console.WriteLine("Flavour:{0}", fruit);
            }
            
            flavours.Sort();
            Console.WriteLine("After sorting---");
            
            foreach (string fruit in flavours)
            {
                Console.WriteLine("Flavour:{0}", fruit);
            }

            Console.WriteLine("Reversedone---");
            flavours.Reverse();

            foreach (string fruit in flavours)
            {
                Console.WriteLine("Flavour:{0}", fruit);
            }

        }
    }
}
