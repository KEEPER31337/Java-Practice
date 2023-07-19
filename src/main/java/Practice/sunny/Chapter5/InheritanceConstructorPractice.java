package Practice.sunny.Chapter5;


class Dog extends Animal {

  // Default Constructor
  Dog() {

  }

  void sleep() {
    System.out.println(this.name + " zzz");
  }
}

class HouseDog extends Dog {

  // Constructor
  HouseDog(String name) {
    this.name = name;
  }

  // Constructor Overloading
  HouseDog(int type) {
    if (type == 1) {
      this.setName("yorkshire");
    } else if (type == 2) {
      this.setName("bulldog");
    }
  }

  // Method Overriding
  @Override
  void sleep() {
    System.out.println(this.name + " zzz in house");
  }

  // Method Overloading
  void sleep(int hour) {
    System.out.println(this.name + " zzz in house for " + hour + " hours");
  }
}

// Multiple Inheritance
/*
class A {
  public void msg(){
    System.out.println("A message");
  }
}

class B {
  public void msg(){
    System.out.println("B message");
  }
}

class C extends A, B {
  public void static main(String[] args){
    C test = new C();
    test.msg();
  }
}
 */

public class InheritanceConstructorPractice {

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.setName("poppy");
    System.out.println(dog.name);
    dog.sleep();

    // Dog dog = new Animal(); -> Animal is Dog (Compile error)
    // Animal dog = new Dog(); -> Dog is Animal

    // Object animal = new Animal();  -> Animal is an Object
    // Object dog = new Dog();        -> Dog is an Object

    HouseDog houseDog = new HouseDog("a");
    houseDog.setName("poppy");
    houseDog.sleep();
    houseDog.sleep(3);

    HouseDog happy = new HouseDog("happy");
    HouseDog yorkshire = new HouseDog(1);
    System.out.println(happy.name);
    System.out.println(yorkshire.name);
  }
}
