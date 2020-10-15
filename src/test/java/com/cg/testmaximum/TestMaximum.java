package com.cg.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

    @Test
    public void maximumTest(){
        MaximumMain maximumMain=new MaximumMain();
        Assert.assertEquals("zz",maximumMain.maximumString("zz","aa","AA"));
    }
}
