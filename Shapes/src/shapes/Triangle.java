package shapes;

public class Triangle extends Shapes
{
    private double base;
    private double height;

    Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public String toString()
    {
        return ("Triangle base= " + base + " height= " + height + " Area = " + getArea());
    }
    
    @Override
    public double getArea()
    {
        return(0.5 * base * height);
    }
}
