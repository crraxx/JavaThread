package com.ff.javathread.Day1.Demo1;

public class Test {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();//启动线程
        ThreadDemo2 threadDemo2 = new ThreadDemo2();
        threadDemo2.start();//启动线程

        for (int i = 0; i < 1000; i++) {
            System.out.println("main:"+i);
        }
    }
}
