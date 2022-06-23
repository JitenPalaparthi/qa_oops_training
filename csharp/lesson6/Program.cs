using System.IO;
using Loop;
namespace Lesson6
{
    class Program
    {
        public static void Main(String[] args)
        {
            //----------------while----------------------------------------------------------------
            // // ever ending loop
            // while(true){
            //   Console.WriteLine("Hello World!");
            // }

            While w = new While();
            // 1- 10
            Console.WriteLine("Print 1-10 numbers");
            w.PrintNumbers(15);
            Console.WriteLine("Printed 1-15 Numbers");
            w.PrintEvenNumbers(20);
            Console.WriteLine("Sum of 1-10 numbers {0}", w.SumOfNumbers(10));
            Console.WriteLine("Sum of 1-100 numbers {0}", w.SumOfNumbers(100));
            //--------------------------------------------------------------------------------------
            //---------------do-while---------------------------------------------------------------
            // ever ending loop
            // bool flag=true;
            // do{
            //     Console.WriteLine("Hello");
            // }while(flag);    
            int i = 1;
            do
            {
                Console.WriteLine("{0}--> ", i);
                i++;
            } while (i <= 0);

            // ------------For---------------------------------------
            For f = new For();
            // 1- 10
            Console.WriteLine("Print 1-10 numbers");
            f.PrintNumbers(15);
            Console.WriteLine("Printed 1-15 Numbers");
            f.PrintEvenNumbers(20);
            Console.WriteLine("Sum of 1-10 numbers {0}", f.SumOfNumbers(10));
            Console.WriteLine("Sum of 1-100 numbers {0}", f.SumOfNumbers(100));
            f.PrintOddNumbers(200);
            Console.WriteLine("Is 1 Prime number? {0} ", f.IsPrimeNumber(1));
            Console.WriteLine("Is 2 Prime number? {0} ", f.IsPrimeNumber(2));
            Console.WriteLine("Is 19 Prime number? {0} ", f.IsPrimeNumber(19));
            Console.WriteLine("Is 123 Prime number? {0} ", f.IsPrimeNumber(123));

            Console.WriteLine("Is 4 Prime number? {0} ", f.IsPrimeNumber(4));
            Console.WriteLine("Is 124 Prime number? {0} ", f.IsPrimeNumber(124));
            Console.WriteLine("Is 348 Prime number? {0} ", f.IsPrimeNumber(348));
            Console.WriteLine("Is 49 Prime number? {0} ", f.IsPrimeNumber(49));

          f.GetMatrics(5,10);
        }
    }
}