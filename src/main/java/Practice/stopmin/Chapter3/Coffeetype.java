package Practice.stopmin.Chapter3;

public enum Coffeetype {
  AMERICANO,
  ICE_AMERICANO,
  CAFE_LATTE;
  public static void main(String[] args) {
    System.out.println(AMERICANO);
    for (Coffeetype type : Coffeetype.values()) {
      System.out.println(type);
    }
  }
};


