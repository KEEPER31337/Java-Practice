package Practice.yejun;

public interface Predator {

  String getFood();

  default void printFood() {
    System.out.println();
  }
}
