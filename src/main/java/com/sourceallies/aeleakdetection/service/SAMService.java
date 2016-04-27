package com.sourceallies.aeleakdetection.service;

import org.springframework.stereotype.Service;

@Service
public interface SAMService {

    //SAAMM Stand-Alone AE Monitoring Multiplexer 
    public void executeCommand(String s);
    
}
