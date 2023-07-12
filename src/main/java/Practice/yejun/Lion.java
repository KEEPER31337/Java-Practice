package Practice.yejun;

public class Lion extends Animal implements Predator {

  Lion(String name) {
    super(name);
  }

  @Override
  public String getFood() {
    return null;
  }
}
