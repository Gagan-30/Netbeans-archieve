package superheros;

public class Hero extends Super
{

    @Override
    public void setPower(int power) {
        this.power = 70;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = 50;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = 20.5;
    }

    @Override
    public void setAlias(String alias) {
        this.alias = "Bob";
    }
    
    @Override
    public String toString()
    {
        return("Hero= " + alias + " Power= " + power + " Strength= " + strength + " Speed= " + speed);
    }
}
