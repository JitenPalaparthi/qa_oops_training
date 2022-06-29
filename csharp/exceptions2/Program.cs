using System;

namespace Exceptions
{

    class Program
    {
        public static void Main(string[] args)
        {
            try{
            // using automtically closes opened resources
            using (System.IO.StreamReader sr = new StreamReader(@"abcd.txt"))
            {
                int c = sr.Read();

            }
            }catch(Exception exp){
                Console.WriteLine(exp.Message);
            }

            // System.IO.StreamReader sr=null;
            // try
            // {
            //     sr = new StreamReader(@"abcd.txt");
            //      int c = sr.Read();
            // }
            // catch (Exception exp)
            // {
            //     Console.WriteLine("Exception-->"+exp.Message);
            // }finally{
            //     if (sr!=null){
            //     sr.Close();
            //     }
            // }
        }
    }

}

