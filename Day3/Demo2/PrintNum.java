package com.ff.javathread.Day3.Demo2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintNum implements Runnable {

    static int num = 0;
    static Lock lock = new ReentrantLock();
    static Condition con = lock.newCondition();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                con.signal();//唤醒线程
                num++;
                if (num <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + num);
                } else {
                    lock.unlock();
                    break;
                }
                con.await();//线程等待,并释放锁
                lock.unlock();
            } catch (InterruptedException e) {
                e.printStackTrace();
                lock.unlock();
            }
        }
    }
}

