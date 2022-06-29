using System;
namespace Inheritance
{
    class Program
    {
        public static void Main(string[] args)
        {
            Rectangle rect = new Rectangle(12.45f, 15.45f, "Red", "X:100<>Y:120");
            // The below two base class fields cannot be accessed because they are protected.
            // they can only be accessed inside the deried class
            // rect.Colour = "Red";
            // rect.Position = "X:100<>Y:120";

            Console.WriteLine("Area Of Rect:{0}\t Perimeter of Rect:{1}", rect.Area(), rect.Perimeter());
            rect.ShowDetails();
            //Shape shape;

            Rectangle shape = new Rectangle(14.56f, 13.56f);

            Console.WriteLine("Area Of Rect:{0}\t Perimeter of Rect:{1}", shape.Area(), shape.Perimeter());

            Square shape1 = new Square(25.25f);
            Console.WriteLine("Area Of Square:{0}\t Perimeter of Square:{1}", shape1.Area(), shape1.Perimeter());
        }
    }

    public class Shape
    {
        protected string Colour;
        protected string Position;

        public Shape()
        {

        }
        public Shape(string colour, string position)
        {
            this.Colour = colour;
            this.Position = position;
        }

    }

    class Rectangle : Shape
    {
        float Length;
        float Width;
        public Rectangle()
        {
            this.Length = 0;
            this.Width = 0;
        }
        public Rectangle(float l, float w)
        {
            this.Length = l;
            this.Width = w;
        }
        public Rectangle(float l, float w, string colour, string position) : base(colour, position)
        {
            this.Length = l;
            this.Width = w;
        }
        public float Area()
        {
            return this.Length * this.Width;
        }
        public float Perimeter()
        {
            return 2 * (this.Length + this.Width);
        }

        public void ShowDetails()
        {
            Console.WriteLine("Rectangle: Length:{0} \tWidth:{1}\tColour:{2}\tPosition:{3}", this.Length, this.Width, this.Colour, this.Position);
        }
    }
    public class Square : Shape
    {
        float Side;

        public Square()
        {
            this.Side = 0;
        }
        public Square(float s) 
        {
            this.Side = s;
        }
        public Square(float s,string colour,string position):base(colour,position) 
        {
            this.Side = s;
        }
        public float Area()
        {
            return this.Side * this.Side;
        }
        public float Perimeter()
        {
            return 4 * this.Side;
        }
    }
}
