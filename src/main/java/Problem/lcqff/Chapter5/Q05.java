package Problem.lcqff.Chapter5;

import java.util.ArrayList;
import java.util.Arrays;

public class Q05 {

  /**
   * 리스트와 객체
   */
  public static void main(String[] args) {
    // TODO: 다음 프로그램의 출력결과를 예측하고 그 이유에 대해서 주석으로 설명하시오.

    ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
    ArrayList<Integer> b = a;
    a.add(4);
    System.out.println(b.size());
  }
}
