package models;

import java.math.BigDecimal;

public abstract class Flower implements Product {
    private final String name;
    private final int stalkLength;
    private final int freshness;

    protected Flower(String name, int stalkLength, int freshness){
        if(name == null){
            throw new IllegalArgumentException("Argument name cannot be null");
        }
        this.name = name;
        if(stalkLength <= 0){
            throw new NullPointerException("Stalk length cannot be less than zero");
        }
        this.stalkLength = stalkLength;
        if(freshness<1||freshness>5){
            throw new IllegalArgumentException("Freshness cannot be less than one and more than five");
        }
        this.freshness = freshness;
    }

    @Override
    public BigDecimal getPrice(){
        return new BigDecimal("2.00").add(new BigDecimal("0.50").multiply(new BigDecimal(getStalkLength())));
    }

    @Override
    public String toString() {
        return "Flower{"
                + "Title='" + name + '\''
                + ", stalk length=" + stalkLength
                + ", freshness=" + freshness
                + ", price=" + this.getPrice()
                + '}';
    }

    public String getName(){
        return name;
    }

    public int getStalkLength() {
        return stalkLength;
    }

    public int getFreshness() {
        return freshness;
    }
}
