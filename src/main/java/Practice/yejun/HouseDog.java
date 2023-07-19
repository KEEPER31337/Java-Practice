package Practice.yejun;

public class HouseDog extends Dog {

  public HouseDog(String name) {
    super(name);
  }

  @Override
  public void sleep() {
    System.out.println("house " + name);
  }

  public void sleep(int num) {
    System.out.println("house " + name + " " + num);
  }

  public static void main(String[] args) {
    HouseDog dog = new HouseDog("댕댕이");
    dog.sleep();
    dog.sleep(1);
  }
}
