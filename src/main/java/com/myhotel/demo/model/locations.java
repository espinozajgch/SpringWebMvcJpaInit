package com.myhotel.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class locations {

    @Id
    @Column(length = 4)
    private Double LOCATION_ID;

    @Column(length = 40)
    private String STREET_ADDRESS;

    @Column(length = 12)
    private String POSTAL_CODE;

    @Column(length = 30)
    private String CITY;

    @Column(length = 25)
    private String STATE_PROVINCE;

    @Column(length = 2)
    private String COUNTRY_ID;

    public Double getLOCATION_ID() {
        return LOCATION_ID;
    }

    public void setLOCATION_ID(Double LOCATION_ID) {
        this.LOCATION_ID = LOCATION_ID;
    }

    public String getSTREET_ADDRESS() {
        return STREET_ADDRESS;
    }

    public void setSTREET_ADDRESS(String STREET_ADDRESS) {
        this.STREET_ADDRESS = STREET_ADDRESS;
    }

    public String getPOSTAL_CODE() {
        return POSTAL_CODE;
    }

    public void setPOSTAL_CODE(String POSTAL_CODE) {
        this.POSTAL_CODE = POSTAL_CODE;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getSTATE_PROVINCE() {
        return STATE_PROVINCE;
    }

    public void setSTATE_PROVINCE(String STATE_PROVINCE) {
        this.STATE_PROVINCE = STATE_PROVINCE;
    }

    public String getCOUNTRY_ID() {
        return COUNTRY_ID;
    }

    public void setCOUNTRY_ID(String COUNTRY_ID) {
        this.COUNTRY_ID = COUNTRY_ID;
    }
}
