package views;

import models.Accessory;
import models.Flower;

import java.math.BigDecimal;
import java.util.List;

public class BouquetView {
    public void printBouquetDetails(BigDecimal price, List<Accessory> accessories, List<Flower> flowers){
        System.out.println("Bouquet price:" + price + " byn");
        System.out.println("Bouquet elements:");
        for(Accessory accessory : accessories){
            System.out.println(accessory);
        }
        for(Flower flower : flowers){
            System.out.println(flower);
        }
    }

    public void printSelectedFlowers(List<Flower> flowers){
        if(flowers.isEmpty()){
            System.out.println("There are no flowers in the bouquet");
        }
        if(flowers.isEmpty()) {
            System.out.println("There are no flowers in the bouquet with a given stem length");
        }else{
            for(Flower f : flowers){
                System.out.println(f.getName());
            }
        }
    }
}
