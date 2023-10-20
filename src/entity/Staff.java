package entity;

import entity.Staff.Rights;
import java.time.LocalDate;
import java.util.Objects;

public class Staff {
// enum

    public static enum Rights {
        NhanVienBanHang, NhanVienQuanLy
    }

    public static enum Status {
        DangLam, NghiLam
    }

    public static String convertRightsToString(Rights right) {
        if (right.equals(right.NhanVienBanHang)) {
            return "Nhân viên bán hàng";
        }
        return "Nhân viên quản lý";
    }

    public static Rights convertStringToRights(String rights) {
        if (rights.equals("Nhân viên bán hàng")) {
            return Rights.NhanVienBanHang;
        }
        return Rights.NhanVienQuanLy;
    }

    public static Status convertStringToStatus(String status) {
        if (status.equals("Đang làm")) {
            return Status.DangLam;
        }
        return Status.NghiLam;
    }

    public static String convertStatusToString(Status status) {
        if (status.equals(Status.DangLam)) {
            return "Đang làm";
        }
        return "Nghỉ làm";
    }
//    
    private String idStaff;
    private String name;
    private String cic;
    private String Phone;
    private String email;
    private LocalDate dayofbirth;
    private boolean sex;
    private Province province;
    private District district;
    private Ward ward;
    private String address;
    private Rights rights;
    private Status status;
    private String password;

    public String getEmail() {
        return email;
    }

//    get set
    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(String idStaff) {
        this.idStaff = idStaff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCic() {
        return cic;
    }

    public void setCic(String cic) {
        this.cic = cic;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public LocalDate getDayofbirth() {
        return dayofbirth;
    }

    public void setDayofbirth(LocalDate dayofbirth) {
        this.dayofbirth = dayofbirth;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
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

    public Rights getRights() {
        return rights;
    }

    public void setRights(Rights rights) {
        this.rights = rights;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    Constructor
    public Staff() {
        super();
    }

    public Staff(String idStaff) {
        super();
        this.idStaff = idStaff;
    }

    public Staff(String idStaff, String name, String cic, String Phone, String email, LocalDate dayofbirth, boolean sex, Province province, District district, Ward ward, String address, Rights rights, Status status, String password) {
        super();
        this.idStaff = idStaff;
        this.name = name;
        this.cic = cic;
        this.Phone = Phone;
        this.email = email;
        this.dayofbirth = dayofbirth;
        this.sex = sex;
        this.province = province;
        this.district = district;
        this.ward = ward;
        this.address = address;
        this.rights = rights;
        this.status = status;
        this.password = password;
    }

//    Hashcode equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.idStaff);
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
        final Staff other = (Staff) obj;
        return Objects.equals(this.idStaff, other.idStaff);
    }

//    toString
    @Override
    public String toString() {
        return "Staff{" + "idStaff=" + idStaff + ", name=" + name + ", cic=" + cic + ", Phone=" + Phone + ", email=" + email + ", dayofbirth=" + dayofbirth + ", sex=" + sex + ", province=" + province + ", district=" + district + ", ward=" + ward + ", address=" + address + ", rights=" + rights + ", status=" + status + ", password=" + password + '}';
    }

}
