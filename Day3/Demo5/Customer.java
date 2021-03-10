package com.ff.javathread.Day3.Demo5;

/*
消费者线程
 */
public class Customer extends Thread {

    Counter c;

    public Customer(Counter c) {
        this.c = c;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(1000);
                c.sub();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
