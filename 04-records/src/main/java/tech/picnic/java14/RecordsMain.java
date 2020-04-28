package tech.picnic.java14;

public class RecordsMain {
  public static void main(String... args) {
    // A record has an all-args constructor:
    Product product = new Product("Peanut Butter", "Calve", 250);
    Product product2 = new Product("Peanut Butter", "Calve", 250);

    // A record has accessor methods:
    product.name();
    product.price();
    product.brand();

    // And it has an equals/hashCode implementation based on the component values:
    assert product.equals(product2);

    // It also has a toString method, which we have overridden:
    System.out.println(product);
  }
}
