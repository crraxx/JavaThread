package com.ff.javathread.Day2.Demo1;

public class Test {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.setName("线程1");
        threadDemo.start();//启动线程  就绪状态(等待CPU加载)
                           // 当线程获得了CPU的执行权   ,进入到运行状态
                            //当线程失去CPU执行权(因为CPU还要轮流执行其他线程),进入就绪状态
                            //当线程中所有任务执行完以后,进入死亡状态

       /* try {
            threadDemo.join();//线程合并,等待threadDemo线程执行完后,其他线程执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //threadDemo.stop();//强制让线程销毁
        ThreadDemo threadDemo2 = new ThreadDemo();
        threadDemo2.setName("线程2");
        threadDemo2.start();//启动线程
        //threadDemo2.stop();//强制让线程销毁

    }
}
