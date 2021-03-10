package com.ff.javathread.Day3.Demo6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) {
        //创建任务
        SumNumThread sum = new SumNumThread();
        //接受任务
        FutureTask<Integer> futureTask = new FutureTask(sum);
        //创建线程
        Thread t = new Thread(futureTask);

        t.start();
        try {
            Integer val = futureTask.get();
            System.out.println(val);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
