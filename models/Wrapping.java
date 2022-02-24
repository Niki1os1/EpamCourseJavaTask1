package models;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Wrapping extends Accessory {
    private final static String name = "Wrapping";
    private final int width;
    private final int height;

    public Wrapping(int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public BigDecimal getPrice(){
        return new BigDecimal("1.00").add((new BigDecimal("0.25").multiply(new BigDecimal(width)))
                    .add(new BigDecimal("0.25").multiply(new BigDecimal(height))))
                    .setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public String toString() {
        return "Wrapping{"
                + "Title='" + name + '\''
                + ", width=" + width
                + ", height=" + height
                + ", price=" + this.getPrice()
                + '}';
    }

}
