package com.cg.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

    @Test
    public void maximumTest(){
        MaximumMain maximumMain=new MaximumMain();
        Assert.assertEquals(24,maximumMain.maximumInteger(3,12,24));
    }
}
