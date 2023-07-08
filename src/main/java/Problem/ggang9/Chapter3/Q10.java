package Problem.ggang9.Chapter3;

import java.util.HashMap;

import static Problem.ggang9.Chapter3.Coffee.*;

enum Coffee {
    AMERICANO(3000),
    ICE_AMERICANO(4000),
    CAFE_LATTE(5000);

    private final int coffeePrice;
    Coffee(int coffeePrice) {
        this.coffeePrice = coffeePrice;
    }
    public int getCoffeePrice() {
        return coffeePrice;
    }
}
public class Q10 {

    /**
     * 다음은 커피의 종류(1: 아메리카노, 2:아이스 아메리카노, 3:카페라떼)를 입력하면 커피의 가격을 알려주는 프로그램이다. 위 코드에서 1, 2, 3과 같은 매직넘버를 제거하여 프로그램을 개선해보자.
     */
    static void printCoffeePrice(Coffee type) {
        HashMap<Coffee, Integer> priceMap = new HashMap<>();
        priceMap.put(AMERICANO, AMERICANO.getCoffeePrice());  // 1: 아메리카노
        priceMap.put(ICE_AMERICANO, ICE_AMERICANO.getCoffeePrice());  // 2: 아이스 아메리카노
        priceMap.put(CAFE_LATTE, CAFE_LATTE.getCoffeePrice());  // 3: 카페라떼
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

    public static void main(String[] args) {
        printCoffeePrice(AMERICANO);  // "가격은 3000원 입니다." 출력
//        printCoffeePrice(99);  // NullPointerException 발생
    }
}

