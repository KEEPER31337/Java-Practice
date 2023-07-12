package Practice.ggang9.Chapter5;

public class Tiger extends Animal implements Predator{

    public Tiger(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String getFood() {
        return null;
    }
}
