package com.myhotel.demo.model;

import javax.persistence.*;

@Entity
public class departments {

    @Id
    @Column(length = 4)
    private int DEPARTMENT_ID;

    @Column(length = 30)
    private String DEPARTMENT_NAME;

    @Column(length = 6)
    private Double MANAGER_ID;

    @Column(length = 4)
    private Double LOCATION_ID;

    public int getDEPARTMENT_ID() {
        return DEPARTMENT_ID;
    }

    public void setDEPARTMENT_ID(int DEPARTMENT_ID) {
        this.DEPARTMENT_ID = DEPARTMENT_ID;
    }

    public String getDEPARTMENT_NAME() {
        return DEPARTMENT_NAME;
    }

    public void setDEPARTMENT_NAME(String DEPARTMENT_NAME) {
        this.DEPARTMENT_NAME = DEPARTMENT_NAME;
    }

    public Double getMANAGER_ID() {
        return MANAGER_ID;
    }

    public void setMANAGER_ID(Double MANAGER_ID) {
        this.MANAGER_ID = MANAGER_ID;
    }

    public Double getLOCATION_ID() {
        return LOCATION_ID;
    }

    public void setLOCATION_ID(Double LOCATION_ID) {
        this.LOCATION_ID = LOCATION_ID;
    }
}
