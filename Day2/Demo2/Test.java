package com.ff.javathread.Day2.Demo2;

import com.ff.javathread.Day1.Demo1.ThreadDemo2;

public class Test {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.setDaemon(true);//将线程设置为守护线程
        threadDemo.start();//启动线程

        for (int i = 0; i < 1000; i++) {
            System.out.println("我是用户线程");
        }
    }
}
