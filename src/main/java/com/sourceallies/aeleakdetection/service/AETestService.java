package com.sourceallies.aeleakdetection.service;

import org.springframework.stereotype.Service;

import com.sourceallies.aeleakdetection.model.AETest;
import com.sourceallies.aeleakdetection.model.AETestResults;
import com.sourceallies.aeleakdetection.model.Valve;

@Service
public interface AETestService {

    public AETestResults runTestForValve(AETest aeTest, Valve valve);
    
    public void saveResults();
}
