package Practice;

public class Test {
    public static void main(String[] args) {
        oddThread odd = new oddThread();
        Thread t1 = new Thread(odd);
        t1.setName("奇数");
        t1.start();
        evenTread eve = new evenTread();
        Thread t2 = new Thread(eve);
        t2.setName("偶数");
        t2.start();
    }
}
