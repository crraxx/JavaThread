package com.ff.javathread.Day3.Demo1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class VoteDemo extends Thread {

    static int num = 10;
    static Lock lock = new ReentrantLock();//创建锁对象
    @Override
    public void run() {
        while(true){

            try {
                lock.lock();//获得锁,加锁
                Thread.sleep(100);
                if(num>0){
                    System.out.println(num);
                    num--;
                }else{
                    break;
                }
                lock.unlock();//释放锁
            }catch (Exception e){
                e.printStackTrace();
                lock.unlock();//释放锁
            }
        }
    }
}


