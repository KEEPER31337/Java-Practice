package Practice.yejun;

public class Tiger extends Animal implements Predator {

  Tiger(String name) {
    super(name);
  }

  @Override
  public String getFood() {
    return null;
  }
}
