package com.ff.javathread.Day3.Demo5;

/*
柜台中 存放共享数据
 */
public class Counter {
    int num = 1;

    /*
    生产商品
     */
    public synchronized void add() {
        if (num == 0) {
            num++;
            System.out.println("生产一个");
            this.notify();//唤醒消费者线程  this表示同一个柜台
        } else {
            try {
                this.wait();//生产者等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    消费商品
     */
    public synchronized void sub() {
        if (num == 1) {
            num--;
            System.out.println("消费一个");
            this.notify();//唤醒生产者线程  this表示同一个柜台
        } else {
            try {
                this.wait();//消费者等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
