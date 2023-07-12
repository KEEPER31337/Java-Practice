package Practice.ggang9.Chapter5;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public void sleep() {
        System.out.println("zzz..");
    }
    public static void main(String[] args) {
        Dog dog = new Dog("white");
        dog.sleep();
    }
}
