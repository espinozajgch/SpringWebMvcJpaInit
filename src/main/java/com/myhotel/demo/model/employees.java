package com.myhotel.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class employees {

    @Id
    @Column(length = 6)
    private Double EMPLOYEE_ID;

    @Column(length = 20)
    private String FIRST_NAME;

    @Column(length = 25)
    private String LAST_NAME;

    @Column(length = 25,unique = true)
    private String EMAIL;

    @Column(length = 20)
    private String PHONE_NUMBER;

    private Date HIRE_DATE;

    @Column(length = 10)
    private String JOB_ID;

    @Column(length = 8)
    private Double SALARY;

    @Column(length = 2)
    private Double COMMISSION_PCT;

    @Column(length = 6)
    private Double MANAGER_ID;

    @Column(length = 4)
    private Double DEPARTMENT_ID;

    public Double getEMPLOYEE_ID() {
        return EMPLOYEE_ID;
    }

    public void setEMPLOYEE_ID(Double EMPLOYEE_ID) {
        this.EMPLOYEE_ID = EMPLOYEE_ID;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public void setPHONE_NUMBER(String PHONE_NUMBER) {
        this.PHONE_NUMBER = PHONE_NUMBER;
    }

    public Date getHIRE_DATE() {
        return HIRE_DATE;
    }

    public void setHIRE_DATE(Date HIRE_DATE) {
        this.HIRE_DATE = HIRE_DATE;
    }

    public String getJOB_ID() {
        return JOB_ID;
    }

    public void setJOB_ID(String JOB_ID) {
        this.JOB_ID = JOB_ID;
    }

    public Double getSALARY() {
        return SALARY;
    }

    public void setSALARY(Double SALARY) {
        this.SALARY = SALARY;
    }

    public Double getCOMMISSION_PCT() {
        return COMMISSION_PCT;
    }

    public void setCOMMISSION_PCT(Double COMMISSION_PCT) {
        this.COMMISSION_PCT = COMMISSION_PCT;
    }

    public Double getMANAGER_ID() {
        return MANAGER_ID;
    }

    public void setMANAGER_ID(Double MANAGER_ID) {
        this.MANAGER_ID = MANAGER_ID;
    }

    public Double getDEPARTMENT_ID() {
        return DEPARTMENT_ID;
    }

    public void setDEPARTMENT_ID(Double DEPARTMENT_ID) {
        this.DEPARTMENT_ID = DEPARTMENT_ID;
    }
}
