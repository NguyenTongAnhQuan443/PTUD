package entity;

import java.util.Objects;

public class InvoiceDetails {

    private String idInvoiceDetails;
    private Invoice invoice;
    private Product product;
    private int quantity;
    private double unitPrice;
    private int returnQuantity;
    private String returnReason;

//    Get set
    public String getIdInvoiceDetails() {
        return idInvoiceDetails;
    }

    public void setIdInvoiceDetails(String idInvoiceDetails) {
        this.idInvoiceDetails = idInvoiceDetails;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getReturnQuantity() {
        return returnQuantity;
    }

    public void setReturnQuantity(int returnQuantity) {
        this.returnQuantity = returnQuantity;
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

//    Constructor
    public InvoiceDetails() {
    }

    public InvoiceDetails(String idInvoiceDetails) {
        super();
        this.idInvoiceDetails = idInvoiceDetails;
    }

    public InvoiceDetails(String idInvoiceDetails, Invoice invoice, Product product, int quantity, double unitPrice) {
        super();
        this.idInvoiceDetails = idInvoiceDetails;
        this.invoice = invoice;
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public InvoiceDetails(String idInvoiceDetails, Invoice invoice, Product product, int quantity, double unitPrice, int returnQuantity, String returnReason) {
        super();
        this.idInvoiceDetails = idInvoiceDetails;
        this.invoice = invoice;
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.returnQuantity = returnQuantity;
        this.returnReason = returnReason;
    }

//    Hashcode Equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.idInvoiceDetails);
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
        final InvoiceDetails other = (InvoiceDetails) obj;
        return Objects.equals(this.idInvoiceDetails, other.idInvoiceDetails);
    }

//    toString
    @Override
    public String toString() {
        return "InvoiceDetails{" + "idInvoiceDetails=" + idInvoiceDetails + ", invoice=" + invoice + ", product=" + product + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", returnQuantity=" + returnQuantity + ", returnReason=" + returnReason + '}';
    }

}
