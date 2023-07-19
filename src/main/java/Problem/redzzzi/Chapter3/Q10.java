package Problem.redzzzi.Chapter3;

// 매직넘버 제거하기! - 어렵다..

import java.util.HashMap;

public class Q10 {

  enum CoffeeType {
    AMERICANO,
    ICE_AMERICANO,
    CAFE_LATTE
  }

  ;

  static void printCoffeePrice(CoffeeType type) {
    HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
    priceMap.put(CoffeeType.AMERICANO, 3000);  // 1: 아메리카노
    priceMap.put(CoffeeType.ICE_AMERICANO, 4000);  // 2: 아이스 아메리카노
    priceMap.put(CoffeeType.CAFE_LATTE, 5000);  // 3: 카페라떼
    int price = priceMap.get(type);
    System.out.println(String.format("가격은 %d원 입니다.", price));
  }

  public static void main(String[] args) {
    printCoffeePrice(CoffeeType.AMERICANO);
    printCoffeePrice(CoffeeType.ICE_AMERICANO);
    printCoffeePrice(CoffeeType.CAFE_LATTE);
  }

}
