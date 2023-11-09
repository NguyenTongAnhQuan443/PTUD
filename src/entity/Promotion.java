package entity;

import java.time.LocalDate;
import java.util.Objects;

public class Promotion {
//    enum

    public static enum TypePromotion {
        KhuyenMaiTheoPhanTram, KhuyenMaiTongTienHoaDon
    }

    public static enum Status {
        ConHan, HetHan
    }

    public static String convertTypePromotionToString(TypePromotion typePromotion) {
        if (typePromotion.equals(typePromotion.KhuyenMaiTheoPhanTram)) {
            return "Khuyến mãi theo %";
        }
        return "KM theo tổng tiền";
    }

    public static TypePromotion convertStringToTypePromotion(String typePromotion) {
        if (typePromotion.equals("KM theo %")) {
            return TypePromotion.KhuyenMaiTheoPhanTram;
        }
        return TypePromotion.KhuyenMaiTongTienHoaDon;
    }

    public static Status convertStringToStatus(String status) {
        if (status.equals("Còn hạn")) {
            return Status.ConHan;
        }
        return Status.HetHan;
    }

    public static String convertStatusToString(Status status) {
        if (status.equals(Status.ConHan)) {
            return "Còn hạn";
        }
        return "Hết hạn";
    }
//    
    private String idPromotion;
    private String name;
    private TypePromotion typePromotion;
    private double discount;
    private double priceRange;
    private LocalDate dayStart;
    private LocalDate dayEnd;
    private Status status;
    private String decription;

//    get set
    public String getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(String idPromotion) {
        this.idPromotion = idPromotion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypePromotion getTypePromotion() {
        return typePromotion;
    }

    public void setTypePromotion(TypePromotion typePromotion) {
        this.typePromotion = typePromotion;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(double priceRange) {
        this.priceRange = priceRange;
    }

    public LocalDate getDayStart() {
        return dayStart;
    }

    public void setDayStart(LocalDate dayStart) {
        this.dayStart = dayStart;
    }

    public LocalDate getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(LocalDate dayEnd) {
        this.dayEnd = dayEnd;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

//    constructor
    public Promotion() {
    }

    public Promotion(String idPromotion) {
        super();
        this.idPromotion = idPromotion;
    }

    public Promotion(String idPromotion, String name, TypePromotion typePromotion, double discount, double priceRange, LocalDate dayStart, LocalDate dayEnd, Status status, String decription) {
        super();
        this.idPromotion = idPromotion;
        this.name = name;
        this.typePromotion = typePromotion;
        this.discount = discount;
        this.priceRange = priceRange;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.status = status;
        this.decription = decription;
    }

//    Hashcode equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.idPromotion);
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
        final Promotion other = (Promotion) obj;
        return Objects.equals(this.idPromotion, other.idPromotion);
    }

//    toString
    @Override
    public String toString() {
        return "Promotion{" + "idPromotion=" + idPromotion + ", name=" + name + ", typePromotion=" + typePromotion + ", discount=" + discount + ", priceRange=" + priceRange + ", dayStart=" + dayStart + ", dayEnd=" + dayEnd + ", status=" + status + ", decription=" + decription + '}';
    }

}
