package com.sourceallies.aeleakdetection.model;

public class AEReading {
  //sample equation is Log ( Q ) = a Log ( AE-rms ) + b Log( PDR ) + c Log( Inlet size ) + d.
    
    public double a;
    public double b;
    public double c;
    public double d;
    public double aerms;
    public double p1;
    public double inlet;

    public double runCalc() {
        double logOfQ = (a * aerms!=0?Math.log10(aerms):0) 
                + (b * p1!=0?Math.log10(p1):0)
                + (c * inlet!=0?Math.log10(inlet):0)
                + d;

        return logOfQ;
    }

}
