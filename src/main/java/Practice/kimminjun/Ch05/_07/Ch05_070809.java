package Practice.Ch05._07;

abstract class Predator extends Animal {

  abstract String getFood();

  void printFood() {
    System.out.println("my food is " + getFood());
  }

  static int LEG_COUNT = 4;

  static int speed() {
    return LEG_COUNT * 30;
  }
}

interface Barkable {

  void bark();
}

//interface BarkablePredator extends Predator, Barkable {
//
//}

class Animal {

  String name;

  void setName(String name) {
    this.name = name;
  }
}

class Tiger extends Predator implements Barkable {

  public String getFood() {
    return "apple";
  }

  public void bark() {
    System.out.println("어흥");
  }

}

class Lion extends Predator implements Barkable {

  public String getFood() {
    return "banana";
  }

  public void bark() {
    System.out.println("으르렁");
  }
}

class ZooKepper {

  void feed(Predator predator) {
    System.out.println("feed " + predator.getFood());
  }
}

class Bouncer {

  void barkAnimal(Barkable animal) {
    animal.bark();
  }
}

public class Ch05_070809 {

  public static void main(String[] args) {
    ZooKepper zooKepper = new ZooKepper();
    Tiger tiger = new Tiger();
    Lion lion = new Lion();

    Bouncer bouncer = new Bouncer();
    bouncer.barkAnimal(tiger);
    bouncer.barkAnimal(lion);
//    tiger.printFood();
//    lion.printFood();

//    System.out.println(Predator.speed());
//    zooKepper.feed(tiger);
//    zooKepper.feed(lion);

  }

}
