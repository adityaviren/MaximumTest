package com.cg.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

    @Test
    public void maximumTest(){
        MaximumMain maximumMain=new MaximumMain(12,4,1);
        Assert.assertEquals(12,maximumMain.maximum());
    }
}
