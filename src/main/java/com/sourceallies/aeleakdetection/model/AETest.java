package com.sourceallies.aeleakdetection.model;

import java.util.Set;

import junit.framework.TestResult;

public class AETest {

    private double inletSize;
    private double pOne;
//    private double offset;
    
    private Set<AETestStage> aeTestStages;
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
    public TestResult getTestResult() {
        return testResult;
    }
    public void setTestResult(TestResult testResult) {
        this.testResult = testResult;
    }
    public Set<AETestStage> getAeTestStages() {
        return aeTestStages;
    }
    public void setAeTestStages(Set<AETestStage> aeTestStages) {
        this.aeTestStages = aeTestStages;
    }
    
}
