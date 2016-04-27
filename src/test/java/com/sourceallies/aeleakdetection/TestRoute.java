package com.sourceallies.aeleakdetection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//import org.hamcrest.core.Is.is;

import com.sourceallies.aeleakdetection.model.Route;

public class TestRoute {

    private Route testRoute1, testRoute2;
    @Before
    public void setUp() throws Exception {
        testRoute1 = new Route();
        testRoute2 = new Route();
        //context
    }

    @After
    public void tearDown() throws Exception {
        
    }
    
    @Test
    public void TestAddRoute(){
        //add route to empty context
//        assertThat(testRoute1, is(sys ->addRoute().returns(testRoute1));
    }
}
