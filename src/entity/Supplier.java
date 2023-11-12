package entity;

import java.util.Objects;

public class Supplier {
//    enum

    public static enum Status {
        DangHopTac, NgungHopTac
    }

    public static Status convertStringToStatus(String status) {
        if (status.equals("Đang hợp tác")) {
            return Status.DangHopTac;
        }
        return Status.NgungHopTac;
    }

    public static String convertStatusToString(Status status) {
        if (status.equals(Status.DangHopTac)) {
            return "Đang hợp tác";
        }
        return "Ngưng hợp tác";
    }
//    
    private String idSupplier;
    private String name;
    private String email;
    private String phone;
    private Status status;
    private Province province;
    private District district;
    private Ward ward;
    private String address;

//    get set
    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    Constructor
    public Supplier() {
    }

    public Supplier(String idSupplier) {
        super();
        this.idSupplier = idSupplier;
    }

    public Supplier(String idSupplier, String name, String email, String phone, Status status, Province province, District district, Ward ward, String address) {
        super();
        this.idSupplier = idSupplier;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.province = province;
        this.district = district;
        this.ward = ward;
        this.address = address;
    }

//    Hash code equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.idSupplier);
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
        final Supplier other = (Supplier) obj;
        return Objects.equals(this.idSupplier, other.idSupplier);
    }

//    toString
    @Override
    public String toString() {
        return "Supplier{" + "idSupplier=" + idSupplier + ", name=" + name + ", email=" + email + ", phone=" + phone + ", status=" + status + ", province=" + province + ", district=" + district + ", ward=" + ward + ", address=" + address + '}';
    }

}
