using System;
namespace Inheritance
{
    class Program
    {
        public static void Main(string[] args)
        {

// Uncomment the code to test the error
           //Rectangle rect = new Rectangle(12.45f, 15.45f, "Red", "X:100<>Y:120");
           
        }

       
    }

    public sealed  class Shape // A sealed class cannot be inherited
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

        }
// Uncomment the code to test the error
    // class Rectangle : Shape // Rectangle cannot inherit from Shape because Shape is a sealed class
    // {
    //     public float Length;
    //     public float Width;
    //     public Rectangle()
    //     {
    //         this.Length = 0;
    //         this.Width = 0;
    //     }
    //     public Rectangle(float l, float w)
    //     {
    //         this.Length = l;
    //         this.Width = w;
    //     }
    //     public Rectangle(float l, float w, string colour, string position) : base(colour, position)
    //     {
    //         this.Length = l;
    //         this.Width = w;
    //     }
    //     public  float Area()
    //     {
    //         return this.Length * this.Width;
    //     }
    //     public  float Perimeter()
    //     {
    //         return 2 * (this.Length + this.Width);
    //     }

    //     public void ShowDetails()
    //     {
    //         Console.WriteLine("Rectangle: Length:{0} \tWidth:{1}\tColour:{2}\tPosition:{3}", this.Length, this.Width, this.Colour, this.Position);
    //     }
    // }
    
}
