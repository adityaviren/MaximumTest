package com.cg.testmaximum;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMaximum {

    @Test
    public void maximumTest(){
        String[] arr={"Mark","Imran","Prince"};
        MaximumMain maximumMain=new MaximumMain(arr);
        /*printMax(arr);*/
        Assert.assertEquals("Prince",maximumMain.maximum());
    }

    /*public<T extends Comparable> void printMax(T[] inputArray){
        List<T> array_list=new ArrayList<>();
        array_list= Arrays.asList(inputArray);
        Collections.sort(array_list);
        System.out.println(array_list.get(array_list.size()-1));
    }*/
}
