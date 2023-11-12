package entity;

public class ProductPromotion {

    private int id;
    private String idProduct;
    private String idPromotion;

//    Get set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(String idPromotion) {
        this.idPromotion = idPromotion;
    }

//    Constructor
    public ProductPromotion() {
    }

    public ProductPromotion(int id) {
        super();
        this.id = id;
    }

    public ProductPromotion(int id, String idProduct, String idPromotion) {
        super();
        this.id = id;
        this.idProduct = idProduct;
        this.idPromotion = idPromotion;
    }

//    Hashcode Equals
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
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
        final ProductPromotion other = (ProductPromotion) obj;
        return this.id == other.id;
    }

//    toString
    @Override
    public String toString() {
        return "ProductPromotion{" + "id=" + id + ", idProduct=" + idProduct + ", idPromotion=" + idPromotion + '}';
    }

}
