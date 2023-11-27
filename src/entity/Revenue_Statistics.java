package entity;

public class Revenue_Statistics {

    private int month;
    private double totalSales;
    private double totalCost;
    private double revenue;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public Revenue_Statistics(int month, double totalSales, double totalCost, double revenue) {
        super();
        this.month = month;
        this.totalSales = totalSales;
        this.totalCost = totalCost;
        this.revenue = revenue;
    }

}
