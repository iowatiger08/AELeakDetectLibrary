package com.sourceallies.aeleakdetection.model;

import java.util.Set;

import junit.framework.TestResult;

public class AETest {

    private Set<Reading> readings;
    private TestResult testResult;
    
    public Set<Reading> getReadings() {
        return readings;
    }
    public void setReadings(Set<Reading> readings) {
        this.readings = readings;
    }
    public TestResult getTestResult() {
        return testResult;
    }
    public void setTestResult(TestResult testResult) {
        this.testResult = testResult;
    }
}
