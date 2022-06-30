
public class Program {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle(12.45f, 15.67f, "Red", "X:100=Y:120");
        shapes[1] = new Square(25.25f, "Blue", "X:50.50=Y:55.50");
        shapes[4] = new Circle(25.25f, "Blue", "X:50.50=Y:55.50");
        shapes[2] = new Rectangle(16.54f, 18.86f, "Red", "X:100=Y:120");
        shapes[3] = new Circle(5.25f, "Blue", "X:50.50=Y:55.50");

        for (Shape s : shapes) {
            area(s);
            perimeter(s);
            s.showDetails();
        }

        Triangle triangle = new Triangle(12.45f, 15.43f);
        if (triangle instanceof Shape) {
             area(triangle);
        }else{
            System.out.println("Triangle is not an instance of shape");
        }

        Shape sh = new Shape();

        if (sh instanceof Triangle) {
            System.out.println("Shape is instance of Triangle");
            Triangle t = (Triangle) sh;
            area(sh);
        }else{
            System.out.println("Shaepe is not an instance of triangle");
        }


    }

    public static void area(Shape shape) {
        System.out.println("Area:" + shape.area());
    }

    public static void perimeter(Shape shape) {
        System.out.println("Perimeter:" + shape.perimeter());
    }

}

class Shape {
    protected String Colour;
    protected String Position;

    public Shape() {

    }

    public Shape(String colour, String position) {
        this.Colour = colour;
        this.Position = position;
    }

    public float area() {
        return 0.0f;
    }

    public float perimeter() {
        return 0.0f;
    }

    
    public void showDetails() {
        System.out.println("This is dummy showDetails method to be called from the derived class super keyworkd.");
    }
}

class Rectangle extends Shape {
    float Length;
    float Width;

    public Rectangle() {
        this.Length = 0;
        this.Width = 0;
    }

    public Rectangle(float l, float w) {
        this.Length = l;
        this.Width = w;
    }

    public Rectangle(float l, float w, String colour, String position) {
        super(colour, position);
        this.Length = l;
        this.Width = w;
    }

    @Override
    public float area() {
        return this.Length * this.Width;
    }

    @Override
    public float perimeter() {
        return 2 * (this.Length + this.Width);
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.printf("Rectangle: Length:%f \tWidth:%f\tColour:%s\tPosition:%s\n", this.Length, this.Width,
                this.Colour, this.Position);
    }
}

class Square extends Shape {
    float Side;

    public Square() {
        this.Side = 0;
    }

    public Square(float s) {

        this.Side = s;
    }

    public Square(float s, String colour, String position) {
        super(colour, position);
        this.Side = s;
    }

    @Override
    public float area() {
        return this.Side * this.Side;
    }

    @Override
    public float perimeter() {
        return 4 * (this.Side);
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.printf("Square: Side:%f \tColour:%s\tPosition:%s\n", this.Side, this.Colour, this.Position);
    }
}

class Circle extends Shape {
    float Radius;
    static final float pi = 3.143f;

    public Circle() {
        this.Radius = 0;
    }

    public Circle(float r) {

        this.Radius = r;
    }

    public Circle(float r, String colour, String position) {
        super(colour, position);
        this.Radius = r;
    }

    @Override
    public float area() {
        return pi * this.Radius * this.Radius;
    }

    @Override
    public float perimeter() {
        return 2 * pi * this.Radius;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.printf("Circle: Radius:%f \tColour:%s\tPosition:%s\n", this.Radius, this.Colour, this.Position);
    }
}

class Triangle extends Shape {
    float Height, Base;

    public Triangle() {
        this.Height = 0;
        this.Base = 0;
    }

    public Triangle(float h, float b) {

        this.Height = h;
        this.Base = b;
    }
     public Triangle(float h, float b, String colour, String position)
     {
        super(colour, position);
        this.Height = h;
        this.Base = b;
     }

    @Override
    public float area() {
        return 0.f * this.Height * this.Base;
    }

    @Override
    public float perimeter() {
        return 0.0f; // dummy method
    }
@Override
    public void showDetails() {
        super.showDetails();
        System.out.printf("Triangle: Height:%f \tBase:%b\n", this.Height, this.Base);
    }
}