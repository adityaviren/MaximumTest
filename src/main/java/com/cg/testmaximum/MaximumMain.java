package com.cg.testmaximum;

public class MaximumMain {
    public int maximumInteger(Integer a, Integer b, Integer c){
        if(a.compareTo(b)>0&&a.compareTo(c)>0){
            return a;
        }
        else if(b.compareTo(a)>0&&b.compareTo(c)>0){
            return b;
        }
        else {
            return c;
        }
    }
    public float maximumFloat(Float a, Float b, Float c){
        if(a.compareTo(b)>0&&a.compareTo(c)>0){
            return a;
        }
        else if(b.compareTo(a)>0&&b.compareTo(c)>0){
            return b;
        }
        else {
            return c;
        }
    }
    public String maximumString(String a, String b, String c){
        if(a.compareTo(b)>0&&a.compareTo(c)>0){
            return a;
        }
        else if(b.compareTo(a)>0&&b.compareTo(c)>0){
            return b;
        }
        else {
            return c;
        }
    }
}