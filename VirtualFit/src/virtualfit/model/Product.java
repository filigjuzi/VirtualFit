package virtualfit.model;

public class Product {
    private String productId;
    private String category;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String model3DPath;

    public Product(String productId, String category, String name, String description,
                   double price, int quantity, String model3DPath) {
        this.productId = productId;
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.model3DPath = model3DPath;
    }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getModel3DPath() { return model3DPath; }
    public void setModel3DPath(String model3DPath) { this.model3DPath = model3DPath; }
}
