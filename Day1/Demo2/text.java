package com.ff.javathread.Day1.Demo2;

public class text {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();//创建一个线程要执行的任务
        Thread t = new Thread(threadDemo, "自定义线程1");//创建线程,并将任务添加到线程中
        t.setPriority(1);
        t.start();//启动线程
        Thread t1 = new Thread(threadDemo );//创建线程,并将任务添加到线程中
        t1.setName("自定义线程2");//设置线程名称
        t1.setPriority(10);//设置优先级
        t1.start();//启动线程

        for (int i = 0; i < 10; i++) {
            System.out.println("main:" + i);
        }
        System.out.println(t.getPriority());
        System.out.println(t1.getPriority());
        System.out.println(Thread.currentThread().getName());//获取当前正在执行的线程名称
        System.out.println(Thread.currentThread().getPriority());//获取当前线程的优先级
    }
}
