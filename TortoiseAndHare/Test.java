package Practice.TortoiseAndHare;

public class Test {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.setName("乌龟");
        ThreadDemo threadDemo2 = new ThreadDemo();
        threadDemo2.setName("兔子");
        threadDemo2.start();
        threadDemo.start();

    }
}
