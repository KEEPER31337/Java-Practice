package Practice.redzzzi.Chapter3;

public class Enum {

  enum CoffeeType {
    AMERICANO,
    ICE_AMERICANO,
    CAFE_LATTE
  }

  ;

  public static void main(String[] args) {
    System.out.println(CoffeeType.AMERICANO);  // AMERICANO 출력
    System.out.println(CoffeeType.ICE_AMERICANO);  // ICE_AMERICANO 출력
    System.out.println(CoffeeType.CAFE_LATTE);  // CAFE_LATTE 출력
  }

}
