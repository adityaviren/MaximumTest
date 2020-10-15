package com.cg.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

    @Test
    public void maximumTest(){
        MaximumMain maximumMain=new MaximumMain();
        Assert.assertEquals((Integer)12,maximumMain.maximum(12,4,1));
    }
}
