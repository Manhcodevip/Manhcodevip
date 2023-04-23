package Model;
public class Product {
    private String ProductName;
    private Float Price;
    private String Description;
    private String CategoryName;

    public Product() {
    }

    public Product(String ProductName, Float Price, String Description, String CategoryName) {
        this.ProductName = ProductName;
        this.Price = Price;
        this.Description = Description;
        this.CategoryName = CategoryName;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float Price) {
        this.Price = Price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }
    
}
