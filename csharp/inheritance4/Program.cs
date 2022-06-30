using System;
namespace Inheritance
{
    class Program
    {
        public static void Main(string[] args)
        {

            Shape[] shapes = new Shape[5];
            shapes[0] = new Rectangle(14.56f, 13.56f);
            shapes[1] = new Square(14.56f);
            shapes[2] = new Rectangle(16.54f, 18.86f, "Red", "X:100=Y:120");
            shapes[3] = new Circle(5.25f, "Blue", "X:50.50=Y:55.50");
            shapes[4] = new Triangle(16.54f, 18.86f, "Red", "X:100=Y:120");

            foreach (Shape s in shapes)
            {
                Area(s);
                Perimeter(s);
                s.ShowDetails();
            }

        // Calling the Area method of base class
        

            Shape shape = new Shape();

            if (shape is Triangle)
            {
                Triangle t = (Triangle)shape;
                Console.WriteLine("Shape is a type of Triangle object");
            }
            else
            {
                Console.WriteLine("Shape is not a type of Triangle object");
            }

        }


        public static void Area(Shape shape)
        {
            Console.WriteLine("Area:{0}", shape.Area());
        }
        public static void Perimeter(Shape shape)
        {
            Console.WriteLine("Perimeter:{0}", shape.Perimeter());
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
        public virtual void ShowDetails()
        {
            Console.WriteLine("This is calling dummy Show Details method of base class");
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

        public override void ShowDetails()
        {
            base.ShowDetails();
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
        public override void ShowDetails()
        {
            base.ShowDetails();
            Console.WriteLine("Square: Side:{0} ", this.Side);
        }
    }
    class Triangle : Shape
    {
        float Height, Base;

        public Triangle()
        {
            this.Height = 0;
            this.Base = 0;
        }

        public Triangle(float h, float b)
        {

            this.Height = h;
            this.Base = b;
        }
        public Triangle(float h, float b, String colour, String position) : base(colour, position)
        {
            this.Height = h;
            this.Base = b;

        }


        public override float Area()
        {
            return 0.5f * this.Height * this.Base;
        }


        public override float Perimeter()
        {
            return 0.0f; // dummy method
        }

        public override void ShowDetails()
        {
            base.ShowDetails();
            Console.WriteLine("Triangle: Height:{0} \tBase:{1}\n", this.Height, this.Base);
        }
    }

    class Circle : Shape
    {
        float Radius;
        const float pi = 3.143f;

        public Circle()
        {
            this.Radius = 0;
        }

        public Circle(float r)
        {
            this.Radius = r;
        }

        public Circle(float r, String colour, String position) : base(colour, position)
        {
            this.Radius = r;
        }

        public override float Area()
        {
            return pi * this.Radius * this.Radius;
        }


        public override float Perimeter()
        {
            return 2 * pi * this.Radius;
        }

        public override void ShowDetails()
        {
            base.ShowDetails();
            Console.WriteLine("Circle: Radius:{0} \tColour:{1}\tPosition:{2}\n", this.Radius, this.Colour, this.Position);
        }
    }
}