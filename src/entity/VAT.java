package entity;
public class VAT {
    private int id;
    private double VAT;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    public VAT() {
    }

    public VAT(int id) {
        this.id = id;
    }

    public VAT(int id, double VAT) {
        this.id = id;
        this.VAT = VAT;
    }

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
        final VAT other = (VAT) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "VAT{" + "id=" + id + ", VAT=" + VAT + '}';
    }
    
}
