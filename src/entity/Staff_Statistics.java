package entity;

public class Staff_Statistics {

    private String idStaff;
    private String name;
    private int numberOfInvoices;
    private double totalRevenue;

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

    public int getNumberOfInvoices() {
        return numberOfInvoices;
    }

    public void setNumberOfInvoices(int numberOfInvoices) {
        this.numberOfInvoices = numberOfInvoices;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public Staff_Statistics(String idStaff, String name, int numberOfInvoices, double totalRevenue) {
        super();
        this.idStaff = idStaff;
        this.name = name;
        this.numberOfInvoices = numberOfInvoices;
        this.totalRevenue = totalRevenue;
    }

}
