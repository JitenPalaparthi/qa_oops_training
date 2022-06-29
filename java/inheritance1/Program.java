
public class Program {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(12.45f,15.67f,"Red","X:100=Y:120");
        System.out.println("Area:"+rect.area()+"\tPerimeter:"+rect.perimeter());
        rect.showDetails();

        Square square = new Square(25.25f, "Blue", "X:50.50=Y:55.50");
        System.out.println("Area:"+square.area()+"\tPerimeter:"+square.perimeter());

    }
}


class Shape
    {
        protected String Colour;
        protected String Position;

        public Shape()
        {

        }
        public Shape(String colour, String position)
        {
            this.Colour = colour;
            this.Position = position;
        }

    }

    class Rectangle extends Shape
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
        public Rectangle(float l, float w, String colour, String position) 
        {
            super(colour, position);
            this.Length = l;
            this.Width = w;
        }
        public float area()
        {
            return this.Length * this.Width;
        }
        public float perimeter()
        {
            return 2 * (this.Length + this.Width);
        }

        public void showDetails()
        {
            System.out.printf("Rectangle: Length:%f \tWidth:%f\tColour:%s\tPosition:%s\n", this.Length, this.Width, this.Colour, this.Position);
        }
    }


    class Square extends Shape
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
        public Square(float s, String colour, String position) 
        {
            super(colour, position);
            this.Side = s;
        }
        public float area()
        {
            return this.Side * this.Side;
        }
        public float perimeter()
        {
            return 4 * (this.Side);
        }

        public void showDetails()
        {
            System.out.printf("Square: Side:%f \tColour:%s\tPosition:%s\n", this.Side, this.Colour, this.Position);
        }
    }