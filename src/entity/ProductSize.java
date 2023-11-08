package entity;

import java.util.Objects;

public class ProductSize {
    private int idSize ;
    private String name ;
    
//    Get set

    public int getIdSize() {
        return idSize;
    }

    public void setIdSize(int idSize) {
        this.idSize = idSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    Constructor

    public ProductSize() {
    }

    public ProductSize(int idSize) {
        super();
        this.idSize = idSize;
    }

    public ProductSize(String name) {
        super();
        this.name = name;
    }

    public ProductSize(int idSize, String name) {
        super();
        this.idSize = idSize;
        this.name = name;
    }

//    Hashcode equals

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
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
        final ProductSize other = (ProductSize) obj;
        return Objects.equals(this.name, other.name);
    }
//    toString
    @Override
    public String toString() {
        return "ProductSize{" + "idSize=" + idSize + ", name=" + name + '}';
    }
}
