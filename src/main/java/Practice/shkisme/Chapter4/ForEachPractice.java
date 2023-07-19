package Practice.shkisme.Chapter4;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachPractice {

  public static void main(String[] args) {
    String[] numbers = {"one", "two", "three"};
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    for (String number : numbers) { // 순차적으로 값이 복사되어 number 변수에 담긴다.
      System.out.println(number);
    }

    ArrayList<String> numbers2 = new ArrayList<>(Arrays.asList("one", "two", "three"));
    for (String number : numbers2) {
      System.out.println(number);
    }
  }

}
