package com.ff.javathread.Day2.Demo4;

public class Test {
    public static void main(String[] args) {
        VoteDemo voteDemo = new VoteDemo();
        Thread thread1 = new Thread(voteDemo);
        Thread thread2 = new Thread(voteDemo);
        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread1.start();
        thread2.start();
    }
}
