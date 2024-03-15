public class Product {
    private String name;
    private String category;
    private double price;

    public Product(ProductBuilder builder) {
        this.name = builder.getName();
        this.category = builder.getCategory();
        this.price = builder.getPrice();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}
