package controllers;

import models.Accessory;
import models.Bouquet;
import models.Flower;
import views.BouquetView;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BouquetController {
    private Bouquet bouquet;
    private BouquetView bouquetView;

    public BouquetController(Bouquet bouquet, BouquetView bouquetView){
        this.bouquet = bouquet;
        this.bouquetView = bouquetView;
    }

    public BigDecimal getPrice(){
        return bouquet.getPrice();
    }

    public Bouquet addFlower(Flower flower){
        return bouquet.addFlower(flower);
    }

    public Bouquet addAccessory(Accessory accessory){
        return bouquet.addAccessory(accessory);
    }

    public void sortedFlowerByFreshnessLevel(){
        bouquet.sortedFlowerByFreshnessLevel();
    }

    public void searchFlowersByRangeStalkLength(int initialLength, int finalLength){
        List<Flower> flowers= new ArrayList<>(bouquet.searchFlowersByRangeStalkLength(initialLength, finalLength));
        bouquetView.printSelectedFlowers(flowers);
    }

    public void updateView(){
        bouquetView.printBouquetDetails(bouquet.getPrice(), bouquet.getAccessories(), bouquet.getFlowers());
    }
}
