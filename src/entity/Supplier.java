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
    private Status status;

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

//    Constructor
    public Supplier() {
        super();
    }

    public Supplier(String idSupplier) {
        super();
        this.idSupplier = idSupplier;
    }

    public Supplier(String idSupplier, String name, String email, Status status) {
        super();
        this.idSupplier = idSupplier;
        this.name = name;
        this.email = email;
        this.status = status;
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
        return "Supplier{" + "idSupplier=" + idSupplier + ", name=" + name + ", email=" + email + ", status=" + status + '}';
    }

}
