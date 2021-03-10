package com.ff.javathread.Day3.Demo5;

public class Productor extends Thread {

    Counter c;

    public Productor(Counter c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                c.add();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
