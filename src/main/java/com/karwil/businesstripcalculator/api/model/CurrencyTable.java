package com.karwil.businesstripcalculator.api.model;

import java.util.Date;
import java.util.List;

public class CurrencyTable {

    private String table;
    private String no;
    private Date effectiveDate;
    private List<Rate> rates;

    public CurrencyTable() {
    }

    public CurrencyTable(String table, String no, Date effectiveDate, List<Rate> rates) {
        this.table = table;
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.rates = rates;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }
}
