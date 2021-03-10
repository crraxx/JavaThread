package com.ff.javathread.Day3.Demo6;

import java.util.concurrent.Callable;

public class SumNumThread implements Callable<Integer> {
    /*
    可以向外界返回一个结果
    可以抛出一个异常
     */
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 1; i <= 100;i++){
            sum+=i;
        }
        return sum;
    }
}
