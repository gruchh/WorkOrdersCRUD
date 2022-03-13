package pl.gruchh.workorders.Model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class WorkOrder {

    private Long id;
    private String Title;
    private String ResponsibleForWork;
    private double orderWeight;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE, fallbackPatterns = {"dd.MM.yyyy"})
    private LocalDate deadLineDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getResponsibleForWork() {
        return ResponsibleForWork;
    }

    public void setResponsibleForWork(String responsibleForWork) {
        ResponsibleForWork = responsibleForWork;
    }

    public double getOrderWeight() {
        return orderWeight;
    }

    public void setOrderWeight(double orderWeight) {
        this.orderWeight = orderWeight;
    }

    public LocalDate getDeadLineDate() {
        return deadLineDate;
    }

    public void setDeadLineDate(LocalDate deadLineDate) {
        this.deadLineDate = deadLineDate;
    }


}
