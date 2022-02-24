package models;

import comporators.FreshnessComparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bouquet implements Product {
    private BigDecimal price;
    private List<Flower> flowers = new ArrayList<>();
    private List<Accessory> accessories = new ArrayList<>();

    public BigDecimal getPrice(){
        if(price == null) {
            List<Product> items = new ArrayList<>(accessories);
            items.addAll(flowers);
            BigDecimal result = new BigDecimal("0.00");
            for (Product item : items) {
                result = result.add(item.getPrice());
            }
            this.price = result;
        }
        return price;
    }

    public Bouquet addFlower(Flower flower){
        flowers.add(flower);
        price = null;
        return this;
    }

    public Bouquet addAccessory(Accessory accessory){
        accessories.add(accessory);
        price = null;
        return this;
    }

    public void sortedFlowerByFreshnessLevel(){
        flowers.sort(new FreshnessComparator());
    }

    public List<Flower> searchFlowersByRangeStalkLength(int initialLength, int finalLength){
        List<Flower> result = new ArrayList<>();
        for(Flower f : flowers) {
            if (f.getStalkLength() >= initialLength && f.getStalkLength() <= finalLength)
                result.add(f);
        }
        return result;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }
}
