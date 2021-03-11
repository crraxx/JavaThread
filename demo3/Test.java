package Practice.demo3;

public class Test {
    public static void main(String[] args) {
        RaceThread r = new RaceThread();
        RaceThread t = new RaceThread();
        r.setName("兔子跑");
        t.setName("乌龟跑");
        r.start();
        t.start();


    }
}
