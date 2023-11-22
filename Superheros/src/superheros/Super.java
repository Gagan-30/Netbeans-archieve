package superheros;

public abstract class Super 
{
    int power;
    int strength;
    double speed;
    String alias;
    String criminalRecord;
    String lastLocation;

    public int getPower() {
        return power;
    }

    public int getStrength() {
        return strength;
    }

    public double getSpeed() {
        return speed;
    }

    public String getAlias() {
        return alias;
    }
    
    @Override
    public abstract String toString();
    
    public static void main(String[] args) 
    {
        Hero hero = new Hero();
        
        System.out.println(hero);
    }
    
}
