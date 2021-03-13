package Practice.TortoiseAndHare;

/*
创建线程的第一种方法:继承Thread类
重写Run()方法
 */
public class ThreadDemo extends Thread {
    @Override
    public void run() {
        int T = 0, S = 0;
        if (Thread.currentThread().getName().equals("乌龟")) {
            for (int i = 1; i <= 1000; i++) {
                System.out.println(Thread.currentThread().getName() + "跑了:" + i);
                T = i;
            }
        }
        if (Thread.currentThread().getName().equals("兔子")) {
            for (int i = 1; i <= 1000; i++) {
                try {
                    if (i % 200 == 0) {
                        Thread.sleep(100);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "跑了:" + i);
                S = i;
            }
        }
        if (T > S && T == 1000) {
            System.out.println("乌龟赢");
            System.exit(0);
        }
    }
}
