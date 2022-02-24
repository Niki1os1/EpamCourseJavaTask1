package models;

public abstract class Accessory implements Product {
    private final String name;

    protected Accessory(String name){
        if(name == null){
            throw new IllegalArgumentException("Argument name cannot be null");
        }
        this.name = name;
    }

    protected String getName() {
        return name;
    }
}
