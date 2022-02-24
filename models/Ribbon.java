package models;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ribbon extends Accessory {
    private final static String name = "Ribbon";
    private final int length;

    public Ribbon(int length) {
        super(name);
        this.length = length;
    }

    @Override
    public BigDecimal getPrice(){
        return new BigDecimal("1.00").add(new BigDecimal("0.50").multiply(new BigDecimal(length)))
                .setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public String toString() {
        return "Ribbon{"
                + "Title='" + name + '\''
                + ", length=" + length
                + ", price=" + this.getPrice()
                + '}';
    }

}
