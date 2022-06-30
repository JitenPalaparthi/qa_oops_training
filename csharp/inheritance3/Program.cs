using System;
namespace Inheritance
{
    class Program
    {
        public static void Main(string[] args)
        {
           
            Area(new Rectangle(14.56f, 13.56f));
            Area(new Square(14.56f));
            //Shape rect = new Rectangle(14.56f, 13.56f);
            /// Console.WriteLine(rect.Area());
        }

        public static Shape getShape(string type)
        {
            if (type == "rect" || type == "rectangle")
            {
                return new Rectangle();
            }
            else if (type == "square")
            {
                return new Square();
            }
            else
            {
                return null;
            }
        }

        public static void Area(Shape shape)
        {
            Console.WriteLine("Area:{0}", shape.Area());
        }
    }

    public class Shape
    {
        public string Colour;
        public string Position;

        public Shape()
        {

        }
        public Shape(string colour, string position)
        {
            this.Colour = colour;
            this.Position = position;
        }

        public virtual float Area()
        {
            return 0.0f;
        }

        public virtual float Perimeter()
        {
            return 0.0f;
        }

    }

    class Rectangle : Shape
    {
        public float Length;
        public float Width;
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
        public override float Area()
        {
            return this.Length * this.Width;
        }
        public override float Perimeter()
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
        public Square(float s, string colour, string position) : base(colour, position)
        {
            this.Side = s;
        }
        public override float Area()
        {
            return this.Side * this.Side;
        }
        public override float Perimeter()
        {
            return 4 * this.Side;
        }
    }
}
