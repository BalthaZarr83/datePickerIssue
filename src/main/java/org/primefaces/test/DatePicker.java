package org.primefaces.test;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.time.LocalDate;
import java.util.Date;

@Named
@RequestScoped
public class DatePicker {
    
    private Date minDate;
    private Date maxDate;

    private Date chosenDate;
    
    @PostConstruct  
    public void init() {
        minDate=java.sql.Date.valueOf(LocalDate.parse("2018-03-01"));
        maxDate=java.sql.Date.valueOf(LocalDate.parse("2019-03-01"));
        chosenDate=java.sql.Date.valueOf(LocalDate.parse("2019-01-01"));
    }

    public Date getMinDate() {
        return minDate;
    }

    public void setMinDate(Date minDate) {
        this.minDate = minDate;
    }

    public Date getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(Date maxDate) {
        this.maxDate = maxDate;
    }

    public Date getChosenDate() {
        return chosenDate;
    }

    public void setChosenDate(Date chosenDate) {
        this.chosenDate = chosenDate;
    }
}
