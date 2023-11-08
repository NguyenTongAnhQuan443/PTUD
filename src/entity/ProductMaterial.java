package entity;

import java.util.Objects;

public class ProductMaterial {
    private int idMaterial;
    private String name;
    
//    Get set

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
//    Constructor

    public ProductMaterial() {
    }

    public ProductMaterial(int idMaterial) {
        super();
        this.idMaterial = idMaterial;
    }
    
    public ProductMaterial( String name) {
        super();
        this.name = name;
    }

    public ProductMaterial(int idMaterial, String name) {
        super();
        this.idMaterial = idMaterial;
        this.name = name;
    }

//    Hascode equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
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
        final ProductMaterial other = (ProductMaterial) obj;
        return Objects.equals(this.name, other.name);
    }
//    toString

    @Override
    public String toString() {
        return "ProductMaterial{" + "idMaterial=" + idMaterial + ", name=" + name + '}';
    }
    
}
