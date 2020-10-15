package com.cg.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

    @Test
    public void maximumTest(){
        MaximumMain maximumMain=new MaximumMain();
        Assert.assertEquals(112.0f,maximumMain.maximumFloat( 3.0f,112.0f,24.0f),0.0f);
    }
}
