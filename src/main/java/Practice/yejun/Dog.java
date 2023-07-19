package Practice.yejun;

public class Dog extends Animal {
  public Dog(String name) {
    super(name);
  }

  public void sleep() {
    System.out.println(name);
  }

  public static void main(String[] args) {
    Dog dog = new Dog("댕댕이");
    dog.sleep();
  }
}