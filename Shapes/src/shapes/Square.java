package shapes;

public final class Square extends Shapes 
{
    private double side;
    
    Square(double side)
    {
        this.setSide(side);
    }
    
    @Override
    public String toString()
    {
        return ("Square side= "+ getSide() + " area= " + getArea());
    }

    @Override
    public double getArea() 
    {
        return getSide()*getSide();
    }
    
    @Override
    public double getSide() 
    {
        return side; 
    } 
    
    @Override
    public void setSide(double side) 
    {
        this.side = side;
    }    

    
}
