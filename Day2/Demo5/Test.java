package com.ff.javathread.Day2.Demo5;

public class Test {
    public static void main(String[] args) {
        DieLock t1= new DieLock(true);
        DieLock t2= new DieLock(false);

        t1.start();
        t2.start();
    }
}
