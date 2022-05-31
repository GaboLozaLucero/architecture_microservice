package project.backend.msproducts.model;



public class ProductModel {

    private String name_product;

    private int quantity;
    private double price;
    private String description;

    public ProductModel(String name_product, int quantity, double price, String description) {
        this.name_product = name_product;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductModel() {
        super();
        // TODO Auto-generated constructor stub
    }


}
