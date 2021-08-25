package com.karwil.businesstripcalculator.api.model;

import javax.persistence.*;

import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "expenses")
public class Expense {

    @GeneratedValue(strategy = IDENTITY)
    @Column(unique = true, nullable = false)
    @Id
    private Long id;

    @ManyToOne
    private BusinessTrip businessTrip;

    private String name;
    private double cost;

    @Temporal(TemporalType.DATE)
    private Date date;

    private Currency currency;

    public Expense() {
    }

    public Expense(String name, double cost, Date date) {
        this.name = name;
        this.cost = cost;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BusinessTrip getBusinessTrip() {
        return businessTrip;
    }

    public double getCost() {
        return cost;
    }

    public Date getDate() {
        return date;
    }

}
