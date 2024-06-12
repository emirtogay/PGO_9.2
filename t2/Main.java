package t2;

public class Main {

    public static void main(String[] args) {
        Cat mruczek = new Cat("Cat1");
        mruczek.start();
        System.out.println(mruczek.getType());
        mruczek.stop();
    }
}