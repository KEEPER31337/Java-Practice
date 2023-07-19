package Practice.stopmin.Chapter5;

public class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }


  public static void main(String[] args) {
    Dog dog1 = new Dog("Puppy");
    dog1.sleep();
  }
}
