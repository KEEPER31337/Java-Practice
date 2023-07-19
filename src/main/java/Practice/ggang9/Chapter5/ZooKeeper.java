package Practice.ggang9.Chapter5;

public class ZooKeeper {
    void feed(Predator predator) {

    }

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.feed(new Tiger("tiger1"));
        zooKeeper.feed(new Tiger("lion1"));
    }
}
