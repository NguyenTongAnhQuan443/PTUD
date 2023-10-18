package entity;

import java.util.Objects;

public class District {

    private String id;
    private String district;
    private Province province;

//    get set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

//    Constructor
    public District() {
        super();
    }

    public District(String id) {
        super();
        this.id = id;
    }

    public District(String id, String district, Province province) {
        super();
        this.id = id;
        this.district = district;
        this.province = province;
    }

    public static String getDistrictLabel() {
        return "Quận/Huyện";
    }
//    Hash code equasl

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.id);
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
        final District other = (District) obj;
        return Objects.equals(this.id, other.id);
    }

//    toString
    @Override
    public String toString() {
        return "District{" + "id=" + id + ", district=" + district + ", province=" + province + '}';
    }

}
