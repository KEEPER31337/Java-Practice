package Practice.sunny.Chapter3;

public class EnumPractice {

  enum CoffeeType {
    AMERICANO,
    ICE_AMERICANO,
    CAFE_LATE
  }

  ;

  public static void main(String[] args) {

    // print
    System.out.println(CoffeeType.AMERICANO);
    System.out.println(CoffeeType.ICE_AMERICANO);
    System.out.println(CoffeeType.CAFE_LATE);

    // for loop
    for (CoffeeType type : CoffeeType.values()) {
      System.out.println(type);
    }

    // Why use Enum
    /*
    int countSellCoffee(int type){
      ...
    }
    int americano = countSellCoffee(1);
    int result = countSellCoffee(99); -> error

    int countSellCoffee(CoffeeType type){
      ...
     }
     int americano = countSellCoffee(CoffeeType.AMERICANO);
     */
  }
}
