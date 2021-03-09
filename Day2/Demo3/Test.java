package com.ff.javathread.Day2.Demo3;

public class Test {
    public static void main(String[] args) {
        VoteDemo voteDemo = new VoteDemo();
        voteDemo.setName("窗口1");
        voteDemo.start();

        VoteDemo voteDemo2 = new VoteDemo();
        voteDemo2.setName("窗口2");
        voteDemo2.start();
    }
}
