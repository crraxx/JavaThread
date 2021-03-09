package com.ff.javathread.Day2.Demo1;
/*
创建线程的第一种方法:继承Thread类
重写Run()方法
 */
public class ThreadDemo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            /*if (i%5==0){
                Thread.yield();//线程主动让步
            }*/
          /*  try {
                Thread.sleep(1000);//让线程休眠指定时间,进入阻塞状态
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
