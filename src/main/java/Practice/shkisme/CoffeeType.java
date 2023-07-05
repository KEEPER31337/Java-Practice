package Practice.shkisme;

public enum CoffeeType {
  AMERICANO,
  ICE_AMERICANO,
  CAFE_LATTE;

  public static void main(String[] args) {
    System.out.println(AMERICANO);

    for (CoffeeType type : CoffeeType.values()) {
      System.out.println(type);
    }
  }
}
