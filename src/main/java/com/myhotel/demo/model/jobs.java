package com.myhotel.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class jobs {

    @Id
    @Column(length = 10)
    private String JOB_ID;

    @Column(length = 35)
    private String JOB_TITLE;

    @Column(length = 6)
    private Double MIN_SALARY;

    @Column(length = 6)
    private Double MAX_SALARY;

    public String getJOB_ID() {
        return JOB_ID;
    }

    public void setJOB_ID(String JOB_ID) {
        this.JOB_ID = JOB_ID;
    }

    public String getJOB_TITLE() {
        return JOB_TITLE;
    }

    public void setJOB_TITLE(String JOB_TITLE) {
        this.JOB_TITLE = JOB_TITLE;
    }

    public Double getMIN_SALARY() {
        return MIN_SALARY;
    }

    public void setMIN_SALARY(Double MIN_SALARY) {
        this.MIN_SALARY = MIN_SALARY;
    }

    public Double getMAX_SALARY() {
        return MAX_SALARY;
    }

    public void setMAX_SALARY(Double MAX_SALARY) {
        this.MAX_SALARY = MAX_SALARY;
    }
}
