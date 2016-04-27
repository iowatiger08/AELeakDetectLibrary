package com.sourceallies.aeleakdetection.model;

import java.util.Set;

import junit.framework.TestResult;

public class AETest {

    private double inletSize;
    private double pOne;
    private Set<AEReading> aeReadings;
    private TestResult testResult;
    
    //isCannedTest or isConfiguredTest
    
    public double getInletSize() {
        return inletSize;
    }
    public void setInletSize(double inletSize) {
        this.inletSize = inletSize;
    }
    public double getpOne() {
        return pOne;
    }
    public void setpOne(double pOne) {
        this.pOne = pOne;
    }
    public Set<AEReading> getAeReadings() {
        return aeReadings;
    }
    public void setAeReadings(Set<AEReading> readings) {
        this.aeReadings = readings;
    }
    public TestResult getTestResult() {
        return testResult;
    }
    public void setTestResult(TestResult testResult) {
        this.testResult = testResult;
    }
}
