using System;

namespace Lesson9
{
    class Program
    {
        public static void Main(string[] args)
        {
            Rectangle r1 = new Rectangle(12.45, 15.78);
            Console.WriteLine("Area of Rectangle:{0}", r1.GetArea());
            Console.WriteLine("Area of Rectangle stored inside:{0}", r1.Area);

            ChangeRect(r1,112.45,115.78);
            Console.WriteLine("Length: {0} Breadth:{1}",r1.Length,r1.Breadth);

        }

        public static void ChangeRect(Rectangle rect, double length, double breadth)
        {
            rect.Length = length;
            rect.Breadth = breadth;
        }
    }

    public struct Rectangle
    //public class Rectangle
    {
        public double Length;
        public double Breadth;

        public double Area;

        public Rectangle(double l, double b)
        {
            Length = l;
            Breadth = b;
            Area = 0;
        }

        public double GetArea()
        {
            Area = Length * Breadth;
            return Length * Breadth;
        }

    }
}
