package com.ff.javathread.Day3.Demo7;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        SumNumThread sumNumThread = new SumNumThread();

        //将任务交给线程池中线程执行
        //线程池中线程不够时,会释放其中的重复利用
        executorService.submit(sumNumThread);
        executorService.submit(sumNumThread);
        executorService.submit(sumNumThread);
        executorService.submit(sumNumThread);
        executorService.submit(sumNumThread);
        Future<Integer> f = executorService.submit(sumNumThread);
        try {
            System.out.println(f.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
