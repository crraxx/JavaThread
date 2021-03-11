package Practice.demo3;

/*
2.使用两个线程模拟龟兔赛跑(使用继承Thread方式实现).
   假定乌龟和兔子谁先跑够1000步谁就获胜.

   要求最终乌龟获胜.
 */
public class RaceThread extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        int Wu = 0;
        int Tu = 0;
        if (name == "乌龟跑") {
            for (int i = 1; i <= 1000; i++) {
                System.out.println(name + ":" + i);
                Wu = i;
            }
        }
        if (name == "兔子跑") {
            for (int i = 1; i <= 1000; i++) {
                if ((i - 1) % 200 == 0 && i > 1) {
                    try {
                        Thread.sleep(100);  //兔子在比赛过程中会跑一会休息一会，所以在此线程中需要调用sleep()
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("跑了100米了，休息一会吧，乌龟一定还在后面");
                }
                System.out.println(name + ":" + i);
                Tu = i;
            }
        }
        if (Wu == 1000 && Wu > Tu) {
            System.out.println("乌龟赢");
            System.exit(0);
        }
    }
}

