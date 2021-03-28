package com.myhotel.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class regions {

    @Id
    @Column(length = 5)
    private Double REGION_ID;

    @Column(length = 25, unique = true)
    private String REGION_NAME;

    public Double getREGION_ID() {
        return REGION_ID;
    }

    public void setREGION_ID(Double REGION_ID) {
        this.REGION_ID = REGION_ID;
    }

    public String getREGION_NAME() {
        return REGION_NAME;
    }

    public void setREGION_NAME(String REGION_NAME) {
        this.REGION_NAME = REGION_NAME;
    }
}
