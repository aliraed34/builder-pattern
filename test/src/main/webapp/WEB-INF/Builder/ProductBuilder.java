public class ProductBuilder {
    private String name;
    private String category;
    private double price;

    public ProductBuilder() {
        // Initialize default values if needed
    }

    public ProductBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder withCategory(String category) {
        this.category = category;
        return this;
    }

    public ProductBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public Product build() {
        return new Product(this);
    }

    // Getters for accessing fields
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
