package entity;

import java.util.Objects;

public class ProductProperties {

    private String idProductProperties;
    private Product product;
    private Properties properties;

//    get set
    public String getIdProductProperties() {
        return idProductProperties;
    }

    public void setIdProductProperties(String idProductProperties) {
        this.idProductProperties = idProductProperties;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

//    constructor
    public ProductProperties() {
        super();
    }

    public ProductProperties(String idProductProperties) {
        super();
        this.idProductProperties = idProductProperties;
    }

    public ProductProperties(String idProductProperties, Product product, Properties properties) {
        super();
        this.idProductProperties = idProductProperties;
        this.product = product;
        this.properties = properties;
    }

//    Hashcode equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.idProductProperties);
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
        final ProductProperties other = (ProductProperties) obj;
        return Objects.equals(this.idProductProperties, other.idProductProperties);
    }

//    toString
    @Override
    public String toString() {
        return "ProductProperties{" + "idProductProperties=" + idProductProperties + ", product=" + product + ", properties=" + properties + '}';
    }

}
