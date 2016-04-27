package com.sourceallies.aeleakdetection.model;

import java.util.Set;

public class Route {

    private String name;
    private boolean isOpen;
    
    private Set<Valve> valves;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Set<Valve> getValves() {
        return valves;
    }

    public void setValves(Set<Valve> valves) {
        this.valves = valves;
    }


}
