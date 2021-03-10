package com.ff.javathread.Day3.Demo4;

public class Test {
    public static void main(String[] args) {
        PrintNum p1 = new PrintNum();
        PrintNum p2 = new PrintNum();
        p1.start();
        p2.start();
    }
}
