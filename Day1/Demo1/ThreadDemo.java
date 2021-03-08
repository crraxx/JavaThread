package com.ff.javathread.Day1.Demo1;
/*
创建线程的第一种方法:继承Thread类
重写Run()方法
 */
public class ThreadDemo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println("Thread1:"+i);
        }
    }
}
