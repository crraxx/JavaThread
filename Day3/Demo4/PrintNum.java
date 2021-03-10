package com.ff.javathread.Day3.Demo4;

public class PrintNum extends Thread {

    static int num = 0;
    static Object obj =new Object();//继承Thread方式,由于创建了多个对象,需要自己创建一个唯一的对象,充当锁
    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                obj.notify();
                if (num <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + num);
                    num++;
                } else {
                    break;
                }
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
