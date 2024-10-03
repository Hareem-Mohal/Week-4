import java.util.Objects;
public class Product {
    private String productId;
    private String productName;
    private float productPrice;
    private int quantity;
    public static int counter=0;


    public Product(String productName, float productPrice, int quantity) {
        this.productId = String.format("%03d", ++counter);
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }
    public Product(String productName, float productPrice) {
        this(productName, productPrice,0);
    }
    public Product(String productName) {
        this(productName, 0);
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }


    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return productId;
    }

    public void setId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this ==obj) return true;
        if (obj==null||getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return Objects.equals(productId,product.productId);
    }

    @Override
    public String toString() {
        return String.format(" Product Id: %10s \n Product Name: %10s \n Product Price: %2f \n Quantity: %d", productId , productName, productPrice, quantity);
    }
}
