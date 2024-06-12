package t2;

public class Cat extends Animal implements Moveable {

    public String name;

    public Cat(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String getType() {
        return "Cat";
    }

    public String getName() {
        return name;
    }

    @Override
    public void start() {
        System.out.println("Cat started");
    }

    @Override
    public void stop() {
        System.out.println("Cat stopped");
    }
}
