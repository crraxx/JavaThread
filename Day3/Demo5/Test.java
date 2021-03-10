package com.ff.javathread.Day3.Demo5;

public class Test {

    public static void main(String[] args) {

        Counter c = new Counter();//创建柜台对象,是生产或者和消费者
        Productor p = new Productor(c);
        Customer ct = new Customer(c);
        p.start();
        ct.start();
    }
}
