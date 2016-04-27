package com.sourceallies.aeleakdetection.service;

import org.springframework.stereotype.Service;

import com.sourceallies.aeleakdetection.model.Route;
import com.sourceallies.aeleakdetection.model.Valve;

@Service
public interface RouteService {
    public Route add();
    
    public void addValveToRoute(Valve value);
    
    public void listValves();
    
    public void editRoute();
    
    public Valve createValve();
    
    public Valve editValve();
    
    public void flushRoutes();
    
    public void saveRouteStencil();
}
