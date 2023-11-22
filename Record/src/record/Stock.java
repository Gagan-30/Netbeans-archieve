
package record;

public class Stock {

    public static void main(String[] args) 
    {
        Shop[] shop = new Shop[5];
        
        for (int i = 0; i < shop.length; i++) 
        {
            shop[i] = new Shop();
        }
        
        shop[0].device = "Blu-ray player";
        shop[0].price = 499.99;
        
        System.out.println(shop[0].device);
        System.out.println(shop[0].price + "\n");
        
        shop[1].device = "CD player";
        shop[1].price = 199.99;
        
        System.out.println(shop[1].device);
        System.out.println(shop[1].price + "\n");
        
        shop[2].device = "DVD player";
        shop[2].price = 299.99;
        
        System.out.println(shop[2].device);
        System.out.println(shop[2].price + "\n");
        
        shop[3].device = "AV Receiver";
        shop[3].price = 699.99;
        
        System.out.println(shop[3].device);
        System.out.println(shop[3].price + "\n");
        
        shop[4].device = "Amplifier";
        shop[4].price = 799.99;
        
        System.out.println(shop[4].device);
        System.out.println(shop[4].price + "\n");
    }
    
}
