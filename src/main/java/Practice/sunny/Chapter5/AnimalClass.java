package Practice.sunny.Chapter5;
/*
interface Predator {

  String getFood();

  default void printFood() {
    System.out.printf("my food is %s\n", getFood());
  }

  int LEG_COUNT = 4;

  static int speed() {
    return LEG_COUNT * 30;
  }
}
 */

abstract class Predator extends Animal {

  abstract String getFood();

  void printFood() {
    System.out.printf("my food is %s\n", getFood());
  }

  static int LEG_COUNT = 4;

  static int speed() {
    return LEG_COUNT * 30;
  }
}

interface Barkable {

  void bark();
}
/*
interface BarkablePredator extends Predator, Barkable{

}
 */

class Animal { // == class Animal extends Object

  String name;

  void setName(String name) {
    this.name = name;
  }
}

class Tiger extends Predator implements Barkable {

  @Override
  public String getFood() {
    return "apple";
  }

  @Override
  public void bark() {
    System.out.println("어흥");
  }
}

class Lion extends Predator implements Barkable {

  @Override
  public String getFood() {
    return "banana";
  }

  @Override
  public void bark() {
    System.out.println("으르렁");
  }
}

class Crocodile extends Animal {

}

class Leopard extends Animal {

}

class ZooKeeper {

  void feed(Tiger tiger) {
    System.out.println("feed apple");
  }

  void feed(Lion lion) {
    System.out.println("feed banana");
  }

  public void feed(Crocodile crocodile) {
    System.out.println("feed strawberry");
  }

  public void feed(Leopard leopard) {
    System.out.println("feed orange");
  }

  void feed(Predator predator) {
    System.out.println("feed " + predator.getFood());
  }
}

class Bouncer {

  void barkAnimal(Barkable animal) {
    animal.bark();
  }
}


