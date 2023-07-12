package Practice.stopmin.Chapter5;

public class HouseDog extends Dog {

  public HouseDog(String name) {
    super(name);
  }

  @Override
  public void sleep() {
    System.out.println(this.name + " is Sleeping!");
  }

  public static void main(String[] args) {
    Dog dog1 = new Dog("Hi");
    dog1.sleep();
  }
}
