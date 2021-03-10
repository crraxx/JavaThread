package com.ff.javathread.Day3.Demo3;

public class PrintNum implements Runnable{

    static int num=0;
    @Override
    public void run() {
        while (true){
            synchronized (this){//implements Runnable 情况下,this只有一个,this可以充当锁
                this.notify();//唤醒等待线程 使用锁对象来调用notify(),wait();
                if (num<=100){
                    System.out.println(Thread.currentThread().getName()+":"+num);
                    num++;
                }else{
                    break;
                }
                try {
                    this.wait();//线程等待,并释放锁
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
