package tech.picnic.java14;

public record Product(String name, String brand, int price) {

    // Records cannot have instance fields, so the following won't compile:
    // private String additionalField

    public Product {
        if (brand.isBlank()) {
            throw new IllegalArgumentException("Must have brand!");
        }

        if (price < 100) {
            price = 100;
        }
    }

    @Override
    public String toString() {
        return "[name -> %s]".formatted(name);
    }
}
