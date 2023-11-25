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
    private Double currentPrice;
    private int quantity;
    private Status status;
    private Supplier supplier;
    private ProductType productType;
    private ProductColor productColor;
    private ProductSize productSize;
    private ProductMaterial productMaterial;
    private String pathImageProduct;
    
    private int sellNumber;

//    Get set
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

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
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

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public ProductColor getProductColor() {
        return productColor;
    }

    public void setProductColor(ProductColor productColor) {
        this.productColor = productColor;
    }

    public ProductSize getProductSize() {
        return productSize;
    }

    public void setProductSize(ProductSize productSize) {
        this.productSize = productSize;
    }

    public ProductMaterial getProductMaterial() {
        return productMaterial;
    }

    public void setProductMaterial(ProductMaterial productMaterial) {
        this.productMaterial = productMaterial;
    }

    public String getPathImageProduct() {
        return pathImageProduct;
    }

    public void setPathImageProduct(String pathImageProduct) {
        this.pathImageProduct = pathImageProduct;
    }
//get set số lượng bán

    public int getSellNumber() {
        return sellNumber;
    }

    public void setSellNumber(int sellNumber) {
        this.sellNumber = sellNumber;
    }
    
//    Constructor
    public Product() {
    }

    public Product(String idProduct, String name, Double costPrice, Double originalPrice, int quantity, Status status, Supplier supplier, ProductType productType, ProductColor productColor, ProductSize productSize, ProductMaterial productMaterial, String pathImageProduct) {
        super();
        this.idProduct = idProduct;
        this.name = name;
        this.costPrice = costPrice;
        this.originalPrice = originalPrice;
        this.quantity = quantity;
        this.status = status;
        this.supplier = supplier;
        this.productType = productType;
        this.productColor = productColor;
        this.productSize = productSize;
        this.productMaterial = productMaterial;
        this.pathImageProduct = pathImageProduct;
    } // Thiếu tham số currentPrice

    public Product(String idProduct, String name, Double costPrice, Double originalPrice, Double currentPrice, int quantity, Status status, Supplier supplier, ProductType productType, ProductColor productColor, ProductSize productSize, ProductMaterial productMaterial, String pathImageProduct) {
        this.idProduct = idProduct;
        this.name = name;
        this.costPrice = costPrice;
        this.originalPrice = originalPrice;
        this.currentPrice = currentPrice;
        this.quantity = quantity;
        this.status = status;
        this.supplier = supplier;
        this.productType = productType;
        this.productColor = productColor;
        this.productSize = productSize;
        this.productMaterial = productMaterial;
        this.pathImageProduct = pathImageProduct;
    } // có tham số currentPrice

    public Product(String idProduct, String name, Double costPrice, Double originalPrice, int quantity, Status status, Supplier supplier, ProductType productType, ProductColor productColor, ProductSize productSize, ProductMaterial productMaterial, String pathImageProduct, int sellNumber) {
        super();
        this.idProduct = idProduct;
        this.name = name;
        this.costPrice = costPrice;
        this.originalPrice = originalPrice;
        this.quantity = quantity;
        this.status = status;
        this.supplier = supplier;
        this.productType = productType;
        this.productColor = productColor;
        this.productSize = productSize;
        this.productMaterial = productMaterial;
        this.pathImageProduct = pathImageProduct;
        this.sellNumber = sellNumber;
    } // lấy được số lượng bán - không có curentPrice
    
//    Hashcode equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.idProduct);
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
        return "Product{" + "idProduct=" + idProduct + ", name=" + name + ", costPrice=" + costPrice + ", originalPrice=" + originalPrice + ", currentPrice=" + currentPrice + ", quantity=" + quantity + ", status=" + status + ", supplier=" + supplier + ", productType=" + productType + ", productColor=" + productColor + ", productSize=" + productSize + ", productMaterial=" + productMaterial + ", pathImageProduct=" + pathImageProduct + '}';
    }

}
