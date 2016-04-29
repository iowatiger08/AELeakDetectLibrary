package com.sourceallies.aeleakdetection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import com.sourceallies.aeleakdetection.model.AEReading;

public class TestAEStageCalculation {

    //sample equation is Log ( Q ) = a Log ( AE-rms ) + b Log( PDR ) + c Log( Inlet size ) + d.
    double LeakRate;
    double aeRMS;
    double PDR;
    double inletSize;
    AEReading aTestReading ;
    
    double a,b,c,d;
    
    
    
    @Before
    public void setUp(){
        a=0.0;
        b=0.0;
        c=0.0;
        d=0.0;
        aTestReading.a =a;
        aTestReading.b=b;
        aTestReading.c=c;
        aTestReading.d=d;
        aTestReading.aerms=aeRMS;
        aTestReading.p1=PDR;
        aTestReading.inlet=inletSize;
    }
    
    
    @Test
    public void TestSampleEquationZero(){
        double zero=0;
        Assert.assertThat(aTestReading.runCalc() , is( zero));
    }
}
