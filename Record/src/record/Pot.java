package record;

public class Pot 
{
    String potID;
    String plantName;
    double purchasePrice;
    String wateringFreq;
    String extraCare;
    
    public Pot(String potID, String plantName, double purchasePrice, String wateringFreq, String extraCare)
    {
        this.potID = potID;
        this.plantName = plantName;
        this.purchasePrice = purchasePrice;
        this.wateringFreq = wateringFreq;
        this.extraCare = extraCare;
    }

    public String getPotID() 
    {
        return potID;
    }

    public String getPlantName() 
    {
        return plantName;
    }

    public double getPurchasePrice() 
    {
        return purchasePrice;
    }

    public String getWateringFreq() 
    {
        return wateringFreq;
    }

    public String getExtraCare() 
    {
        return extraCare;
    }
    
    
}

