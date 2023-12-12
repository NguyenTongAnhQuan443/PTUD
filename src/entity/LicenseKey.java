package entity;

import java.time.LocalDate;

public class LicenseKey {
    private String id;
    private LocalDate dateStart, dayEnd;
    private String decription;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(LocalDate dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public LicenseKey(String id, LocalDate dateStart, LocalDate dayEnd, String decription) {
        this.id = id;
        this.dateStart = dateStart;
        this.dayEnd = dayEnd;
        this.decription = decription;
    }
    
    
}
