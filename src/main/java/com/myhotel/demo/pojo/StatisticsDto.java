package com.myhotel.demo.pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Date;

@JsonAutoDetect(
        fieldVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatisticsDto {

    @JsonProperty("FIRST_NAME")
    private String FIRST_NAME;

    @JsonProperty("LAST_NAME")
    private String LAST_NAME;

    @JsonProperty("EMAIL")
    private String EMAIL;

    @JsonProperty("PHONE_NUMBER")
    private String PHONE_NUMBER;

    @JsonProperty("HIRE_DATE")
    private Date HIRE_DATE;

    @JsonProperty("DEPARTMENT_NAME")
    private String DEPARTMENT_NAME;

    @JsonProperty("SALARY")
    private Double SALARY;

    @JsonProperty("YEARS")
    private String YEARS;

    @JsonProperty("EMPLOYEES_COUNT")
    private String EMPLOYEES_COUNT;

    @JsonProperty("AVG_SALARY")
    private Double AVG_SALARY;

    @JsonProperty("MIN_SALARY")
    private Double MIN_SALARY;

    @JsonProperty("MAX_SALARY")
    private Double MAX_SALARY;

    @JsonProperty("AVG_YEARS")
    private String AVG_YEARS;

    @JsonProperty("COUNTRY_NAME")
    private String COUNTRY_NAME;

    @JsonProperty("JOB_TITLE")
    private String JOB_TITLE;


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

    public String getDEPARTMENT_NAME() {
        return DEPARTMENT_NAME;
    }

    public void setDEPARTMENT_NAME(String DEPARTMENT_NAME) {
        this.DEPARTMENT_NAME = DEPARTMENT_NAME;
    }

    public Double getSALARY() {
        return SALARY;
    }

    public void setSALARY(Double SALARY) {
        this.SALARY = SALARY;
    }

    public String getYEARS() {
        return YEARS;
    }

    public void setYEARS(String YEARS) {
        this.YEARS = YEARS;
    }


    public String getEMPLOYEES_COUNT() {
        return EMPLOYEES_COUNT;
    }

    public void setEMPLOYEES_COUNT(String EMPLOYEES_COUNT) {
        this.EMPLOYEES_COUNT = EMPLOYEES_COUNT;
    }

    public Double getAVG_SALARY() {
        return AVG_SALARY;
    }

    public void setAVG_SALARY(Double AVG_SALARY) {
        this.AVG_SALARY = AVG_SALARY;
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

    public String getAVG_YEARS() {
        return AVG_YEARS;
    }

    public void setAVG_YEARS(String AVG_YEARS) {
        this.AVG_YEARS = AVG_YEARS;
    }

    public String getCOUNTRY_NAME() {
        return COUNTRY_NAME;
    }

    public void setCOUNTRY_NAME(String COUNTRY_NAME) {
        this.COUNTRY_NAME = COUNTRY_NAME;
    }

    public String getJOB_TITLE() {
        return JOB_TITLE;
    }

    public void setJOB_TITLE(String JOB_TITLE) {
        this.JOB_TITLE = JOB_TITLE;
    }
}
