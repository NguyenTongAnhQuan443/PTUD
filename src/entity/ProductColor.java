package entity;

import java.util.Objects;

public class ProductColor {
    private  int idColor;
    private String name;
    
//    Get set

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    Constructor

    public ProductColor() {
    }

    public ProductColor(String name) {
        super();
        this.name = name;
    }

    public ProductColor(int idColor, String name) {
        this.idColor = idColor;
        this.name = name;
    }
    
//    Hashcode equals

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.name);
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
        final ProductColor other = (ProductColor) obj;
        return Objects.equals(this.name, other.name);
    }
//    toString
    @Override
    public String toString() {
        return "ProductColor{" + "idColor=" + idColor + ", name=" + name + '}';
    }
    
    
}
