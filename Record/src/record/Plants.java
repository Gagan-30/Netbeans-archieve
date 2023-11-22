package record;

public class Plants 
{

    public static void main(String[] args) 
    {
        Pot pot1 = new Pot("P005","Wisteria",5.99,"2 days", "Use well rotted manure and compost, as freshly made can burn the roots of the new plants");
        
        System.out.println("potID = " + pot1.potID);
        System.out.println("pot name = " + pot1.plantName);
        System.out.println("pot price = " + pot1.purchasePrice);
        System.out.println("pot frequency = " + pot1.wateringFreq);
        System.out.println("pot care = " + pot1.extraCare + "\n");
        
        Pot pot2 = new Pot("S001", "Rose Shrub" , 20.50, "3 days", "Prune in winter");
        
        System.out.println("potID = " + pot2.potID);
        System.out.println("pot name = " + pot2.plantName);
        System.out.println("pot price = " + pot2.purchasePrice);
        System.out.println("pot frequency = " + pot2.wateringFreq);
        System.out.println("pot care = " + pot2.extraCare + "\n");
        
        Pot pot3 = new Pot("L157","Zinnias",10.00,"Daily", "");
        
        System.out.println("potID = " + pot3.potID);
        System.out.println("pot name = " + pot3.plantName);
        System.out.println("pot price = " + pot3.purchasePrice);
        System.out.println("pot frequency = " + pot3.wateringFreq);
        System.out.println("pot care = " + pot3.extraCare + "\n");
        
        Pot pot4 = new Pot("P124","Chlorophytum comosum",1.50,"Weekly", "Remove baby plants monthly");
        
        System.out.println("potID = " + pot4.potID);
        System.out.println("pot name = " + pot4.plantName);
        System.out.println("pot price = " + pot4.purchasePrice);
        System.out.println("pot frequency = " + pot4.wateringFreq);
        System.out.println("pot care = " + pot4.extraCare + "\n");
        
    }
    
}
