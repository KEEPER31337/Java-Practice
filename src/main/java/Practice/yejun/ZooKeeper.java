package Practice.yejun;

public class ZooKeeper {

  void feed(Predator predator) {

  }

  public static void main(String[] args) {
    ZooKeeper zooKeeper = new ZooKeeper();
    zooKeeper.feed(new Lion("lion"));
    zooKeeper.feed(new Tiger("tiger"));

    Lion lion = new Lion("");
    lion.printFood();
  }
}
