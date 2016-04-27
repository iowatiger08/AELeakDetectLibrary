package com.sourceallies.aeleakdetection.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AETestResults {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    private Valve valveTested;
    private Boolean coupling;
    private Integer grade;
    private Integer noise;
    private Double decibelLevel;
    private Double flowTime;
    
    public Boolean getCoupling() {
        return coupling;
    }
    public void setCoupling(Boolean coupling) {
        this.coupling = coupling;
    }
    public Integer getGrade() {
        return grade;
    }
    public void setGrade(Integer grade) {
        this.grade = grade;
    }
    public Integer getNoise() {
        return noise;
    }
    public void setNoise(Integer noise) {
        this.noise = noise;
    }
    public Double getDecibelLevel() {
        return decibelLevel;
    }
    public void setDecibelLevel(Double decibelLevel) {
        this.decibelLevel = decibelLevel;
    }
    public Double getFlowTime() {
        return flowTime;
    }
    public void setFlowTime(Double flowTime) {
        this.flowTime = flowTime;
    }
    public Valve getValveTested() {
        return valveTested;
    }
    public void setValveTested(Valve valveTested) {
        this.valveTested = valveTested;
    }
    
}
