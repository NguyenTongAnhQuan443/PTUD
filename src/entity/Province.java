package entity;

import java.util.Objects;

public class Province {

    private String id;
    private String province;
// get set

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

//    Constructor
    public static String getProvinceLabel() {
        return "Tỉnh/Thành phố";
    }

    public Province() {
        super();
    }

    public Province(String id) {
        super();
        this.id = id;
    }

    public Province(String id, String province) {
        super();
        this.id = id;
        this.province = province;
    }

//    Hascode equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final Province other = (Province) obj;
        return Objects.equals(this.id, other.id);
    }
//    toString

    @Override
    public String toString() {
        return "Province{" + "id=" + id + ", province=" + province + '}';
    }

}
