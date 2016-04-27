package com.sourceallies.aeleakdetection.model;

public abstract class Valve {

    private String type ;
    private String aeModel;
    private String fluid;
    
    public String getType(){
        return type;
    }

    public String getAeModel() {
        return aeModel;
    }

    public void setAeModel(String aeModel) {
        this.aeModel = aeModel;
    }

    public String getFluid() {
        return fluid;
    }

    public void setFluid(String fluid) {
        this.fluid = fluid;
    }
    
}
