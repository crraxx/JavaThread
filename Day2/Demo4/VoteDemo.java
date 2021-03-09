package com.ff.javathread.Day2.Demo4;

public class VoteDemo implements Runnable {

    int votes = 10;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            if (votes > 0) {
                Vote();
            } else {
                break;
            }
        }
    }

    //用synchronize修饰方法,此方法为同步方法
    //synchronize修饰方法时,锁对象默认为this,只创建一个线程任务对象,this只有一个
    public synchronized void Vote() {
        if (votes > 0) {
            System.out.println(Thread.currentThread().getName() + ":" + votes);
            votes--;
        }
    }

    /*修饰同步内容
    @Override
    public void run() {
        while (true) {
            synchronized (obj){
                if (votes > 0) {

                    System.out.println(Thread.currentThread().getName() + ":" + votes);
                    votes--;
                } else if (votes <= 0) {
                    break;
                }
            }
        }
    }*/
}
