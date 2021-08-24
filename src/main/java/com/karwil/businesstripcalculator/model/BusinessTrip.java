package com.karwil.businesstripcalculator.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "businessTrip")
public class BusinessTrip {

    @GeneratedValue(strategy = IDENTITY)
    @Column(unique = true, nullable = false)
    @Id
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;
    private String title;
    private String homeCity;
    private String targetCity;

    @OneToMany
    private Set<Expense> expenses;

    public BusinessTrip(Date startDate, Date endDate, String title, String homeCity, String targetCity) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.title = title;
        this.homeCity = homeCity;
        this.targetCity = targetCity;
    }

    public BusinessTrip(Long id, Date startDate, Date endDate) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;

    }

    public BusinessTrip() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

    public String getTargetCity() {
        return targetCity;
    }

    public void setTargetCity(String targetCity) {
        this.targetCity = targetCity;
    }
}
