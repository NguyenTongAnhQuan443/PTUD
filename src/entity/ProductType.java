package entity;

import java.util.Objects;

public class ProductType {

    private int idProductType;
    private String name;

//    Get set
    public int getIdProductType() {
        return idProductType;
    }

    public void setIdProductType(int idProductType) {
        this.idProductType = idProductType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    Constructor

    public ProductType() {
    }

    public ProductType(int idProductType) {
        super();
        this.idProductType = idProductType;
    }

    public ProductType(String name) {
        super();
        this.name = name;
    }

    public ProductType(int idProductType, String name) {
        super();
        this.idProductType = idProductType;
        this.name = name;
    }

//    Hashcode equals
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
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
        final ProductType other = (ProductType) obj;
        return Objects.equals(this.name, other.name);
    }

//    toString
    @Override
    public String toString() {
        return "ProductType{" + "idProductType=" + idProductType + ", name=" + name + '}';
    }

}
