using System.IO;
namespace FileIO
{
    public class Program
    {
        public static void Main(String[] args)
        {
            ReadData("customers.json");
            AppendData("This is a sample file","customers1.json");
        }

        public static void ReadData(string filepath)
        {
            FileStream fs = File.Open(filepath, FileMode.Open);
            StreamReader sr = new StreamReader(fs);
            string line;
            while ((line = sr.ReadLine()) != null)
            {
                Console.WriteLine(line);
            }
            sr.Close();
        }

        
        public static void AppendData(string line,string filepath)
        {
            FileStream fs = File.Open(filepath, FileMode.Append);
            StreamWriter writer = new StreamWriter(fs);

            writer.WriteLine(line);
            writer.Close();
        }
    }
}
