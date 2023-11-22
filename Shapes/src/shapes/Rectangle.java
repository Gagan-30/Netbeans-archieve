package shapes;

public class Rectangle extends Shapes
{

    private double length;
    private double width;
    
    Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() 
    {
        return ("Rectangle Length= " + length + " Width= " + width + " Area= " + getArea());
    }

    @Override
    public double getArea()
    {
       return length * width; 
    }
    
    public double getLength() 
    {
        return length;
    }

    public double getWidth() 
    {
        return width;
    }
    
}
