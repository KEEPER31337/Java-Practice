package Practice.ggang9.Chapter5;

public class Lion extends Animal implements Predator{

    public Lion(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String getFood() {
        return null;
    }
}
