package entity;

import java.util.Objects;

public class Ward {

    private String id;
    private String ward;
    private District district;

//    Get set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

//    Constructor
    public Ward() {
        super();
    }

    public Ward(String id) {
        super();
        this.id = id;
    }

    public Ward(String id, String ward, District district) {
        super();
        this.id = id;
        this.ward = ward;
        this.district = district;
    }

    public static String getWardLabel() {
        return "Phường/Xã";
    }

//    Hashcode equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final Ward other = (Ward) obj;
        return Objects.equals(this.id, other.id);
    }

//    toString
    @Override
    public String toString() {
        return "Ward{" + "id=" + id + ", ward=" + ward + ", district=" + district + '}';
    }

}
