package Practice.sunny.Chapter5;

public class InterfacePractice {

  public static void main(String[] args) {
    ZooKeeper zooKeeper = new ZooKeeper();
    Tiger tiger = new Tiger();
    Lion lion = new Lion();
    zooKeeper.feed(tiger);
    zooKeeper.feed(lion);

    Predator.speed();
  }
}
