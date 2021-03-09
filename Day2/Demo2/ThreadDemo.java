package com.ff.javathread.Day2.Demo2;
/*
创建线程的第一种方法:继承Thread类
重写Run()方法
 */
public class ThreadDemo extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("我是守护线程");
        }
    }
}
