public class Program{
    public static void main(String[] args){
        // Uncomment to check
        //Rectangle rect = new Rectangle(); Since Rectangle is using Shape as base class it cannot be inherited
    }
}

final class Shape // final class cannot be inherited
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
// Uncomment to check    
    // class Rectangle extends Shape{ 
    //     public float Length,Width;
    // }
