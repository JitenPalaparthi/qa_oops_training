using System.IO;

namespace Scanner{
    class Program{
        public static void Main(String []args){
            Console.WriteLine("Enter name");
            string name= Console.ReadLine();
            Console.WriteLine("Enter age");
            int age= int.Parse(Console.ReadLine());
            Console.WriteLine("Name is {0,10} and Age is {1,5}",name,age);

            string output = $"Name is {name} and Age is {age}";
            // String.format("Name is %s and Age is %d",name,age) in java
            Console.WriteLine(output);
        }
    }
}