package com.myhotel.demo.model;

import javax.persistence.*;

@Entity
public class countries {

    @Id
    @Column(length = 2)
    private String COUNTRY_ID;

    @Column(length = 40)
    private String COUNTRY_NAME;

    @Column(length = 10)
    private Double REGION_ID;

    public String getCOUNTRY_ID() {
        return COUNTRY_ID;
    }

    public void setCOUNTRY_ID(String COUNTRY_ID) {
        this.COUNTRY_ID = COUNTRY_ID;
    }

    public String getCOUNTRY_NAME() {
        return COUNTRY_NAME;
    }

    public void setCOUNTRY_NAME(String COUNTRY_NAME) {
        this.COUNTRY_NAME = COUNTRY_NAME;
    }

    public Double getREGION_ID() {
        return REGION_ID;
    }

    public void setREGION_ID(Double REGION_ID) {
        this.REGION_ID = REGION_ID;
    }
}
