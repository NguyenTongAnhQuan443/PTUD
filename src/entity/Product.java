package entity;

import java.util.Objects;

public class Product {
//    enum

    public static enum Status {
        DangKinhDoanh, NgungKinhDoanh
    }

    public static Status convertStringToStatus(String status) {
        if (status.equals("Đang kinh doanh")) {
            return Status.DangKinhDoanh;
        }
        return Status.NgungKinhDoanh;
    }

    public static String convertStatusToString(Status status) {
        if (status.equals(Status.DangKinhDoanh)) {
            return "Đang kinh doanh";
        }
        return "Ngừng kinh doanh";
    }
//    
    private String idProduct;
    private String name;
    private Double costPrice;
    private Double originalPrice;
    private int quantity;
    private Status status;
    private PropertiesDetails propertiesDetails;
    private Promotion promotion;
    private Supplier supplier;

//    get set
    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public PropertiesDetails getPropertiesDetails() {
        return propertiesDetails;
    }

    public void setPropertiesDetails(PropertiesDetails propertiesDetails) {
        this.propertiesDetails = propertiesDetails;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

//    Constructor
    public Product() {
        super();
    }

    public Product(String idProduct) {
        super();
        this.idProduct = idProduct;
    }

    public Product(String idProduct, String name, Double costPrice, Double originalPrice, int quantity, Status status, PropertiesDetails propertiesDetails, Promotion promotion, Supplier supplier) {
        super();
        this.idProduct = idProduct;
        this.name = name;
        this.costPrice = costPrice;
        this.originalPrice = originalPrice;
        this.quantity = quantity;
        this.status = status;
        this.propertiesDetails = propertiesDetails;
        this.promotion = promotion;
        this.supplier = supplier;
    }

//    Hash code equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.idProduct);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        return Objects.equals(this.idProduct, other.idProduct);
    }

//    toString
    @Override
    public String toString() {
        return "Product{" + "idProduct=" + idProduct + ", name=" + name + ", costPrice=" + costPrice + ", originalPrice=" + originalPrice + ", quantity=" + quantity + ", status=" + status + ", propertiesDetails=" + propertiesDetails + ", promotion=" + promotion + ", supplier=" + supplier + '}';
    }

}
