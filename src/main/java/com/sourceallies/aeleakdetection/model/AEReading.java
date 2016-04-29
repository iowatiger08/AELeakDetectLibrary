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
        double logOfQ = (a * log(aerms)) 
                + (b * log(p1))
                + (c * log(inlet))
                + d;

        return logOfQ;
    }
    
    private double log(double number){
        return number!=0?Math.log10(number):0;
    }

}
