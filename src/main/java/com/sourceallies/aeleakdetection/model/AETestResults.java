package com.sourceallies.aeleakdetection.model;

public class AETestResults {

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
    
}
