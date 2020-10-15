package com.cg.testmaximum;

public class MaximumMain<T extends Comparable> {
    T a,b,c;

    MaximumMain(T a,T b,T c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public T maximum(){
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