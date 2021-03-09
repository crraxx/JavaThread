package com.ff.javathread.Day2.Demo5;

public class DieLock extends Thread {

    static Object objA = new Object();
    static Object objB = new Object();

    boolean flag;


    public DieLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag){
            synchronized (objA){
                System.out.println("if objA");
                synchronized (objB){
                    System.out.println("if objB");
                }
            }
        }else{
            synchronized (objB){
                System.out.println("else objB");
                synchronized (objA){
                    System.out.println("else objA");
                }
            }
        }
    }
}
