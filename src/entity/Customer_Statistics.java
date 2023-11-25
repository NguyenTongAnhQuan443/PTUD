package entity;
public class Customer_Statistics {
    private int monthNumber;
    private int customerCount;
    private int totalQuantitySold;
    private double totalRevenue;

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public int getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(int customerCount) {
        this.customerCount = customerCount;
    }

    public int getTotalQuantitySold() {
        return totalQuantitySold;
    }

    public void setTotalQuantitySold(int totalQuantitySold) {
        this.totalQuantitySold = totalQuantitySold;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public Customer_Statistics(int monthNumber, int customerCount, int totalQuantitySold, double totalRevenue) {
        super();;
        this.monthNumber = monthNumber;
        this.customerCount = customerCount;
        this.totalQuantitySold = totalQuantitySold;
        this.totalRevenue = totalRevenue;
    }
}
