package com.cg.testmaximum;

import java.util.*;

public class MaximumMain<T extends Comparable> {
    T[] inputArray;

    MaximumMain(T[] inputArray){
        this.inputArray=inputArray;
    }

    public T maximum(){
        List<T> array_list=new ArrayList<>();
        array_list=Arrays.asList(inputArray);
        Collections.sort(array_list);
        return array_list.get(array_list.size()-1);
    }
    public void printMax(){
        List<T> array_list=new ArrayList<>();
        array_list=Arrays.asList(inputArray);
        Collections.sort(array_list);
        System.out.println(array_list.get(array_list.size()-1));
    }
}