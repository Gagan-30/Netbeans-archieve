package shapes;

public abstract class Shapes 
{
    private String colour;
    private double base;
    private double height;
    private double side;
    private double length;
    private double width;

    public String getColour() 
    {
        return colour;
    }

    public void setColour(String colour) 
    {
        this.colour = colour;
    }
    
    public double getBase() 
    {
        return base;
    }

    public void setBase(double base) 
    {
        this.base = base;
    }

    public double getHeight() 
    {
        return height;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }

    public double getSide() 
    {
        return side;
    }

    public void setSide(double side) 
    {
        this.side = side;
    }

    public double getLength() 
    {
        return length;
    }

    public void setLength(double length) 
    {
        this.length = length;
    }

    public double getWidth() 
    {
        return width;
    }

    public void setWidth(double width) 
    {
        this.width = width;
    }
    @Override     
    public abstract String toString();
    
    public abstract double getArea();
    
    public static void main(String args[])
    {
        Square square = new Square(4);
        Triangle triangle = new Triangle(5,6);
        Rectangle rectangle = new Rectangle(4,5);
        
        System.out.println(square);
        System.out.println(triangle);
        System.out.println(rectangle);
    }

}
