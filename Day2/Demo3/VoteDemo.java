package com.ff.javathread.Day2.Demo3;

public class VoteDemo extends Thread {

    static int votes = 10;//多个线程访问共享资源
    static Object obj = new Object();


    /*@Override
    public void run() {
    //while循环一直出票
        while (true) {
        //为需要同步的代码,用同步代码快修饰,多个线程只有一把锁,谁先拿到谁就用
        //当持有锁的线程把同步代码中的内容执行完以后,离开同步代码快,会自动释放锁
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

    @Override
    public void run() {
        while (true) {
            if (votes > 0) {
                vote();
            } else {
                break;
            }
        }
    }

    //用synchronized修饰方法,此方法为同步方法
    //synchronized修饰方式时,锁对象默认为this,多个线程就有多把锁
    public static synchronized void vote() {
        if (votes > 0) {
            System.out.println(Thread.currentThread().getName() + ":" + votes);
            votes--;
        }
    }
}
