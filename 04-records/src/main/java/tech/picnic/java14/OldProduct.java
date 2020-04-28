package tech.picnic.java14;

import java.util.Objects;

public class OldProduct {

    private final String name;
    private final String brand;
    private final int price;

    public OldProduct(String name, String brand, int price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldProduct that = (OldProduct) o;
        return price == that.price &&
                Objects.equals(name, that.name) &&
                Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brand, price);
    }

    @Override
    public String toString() {
        return "OldProduct{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
