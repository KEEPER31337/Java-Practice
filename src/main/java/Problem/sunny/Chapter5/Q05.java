package Problem.sunny.Chapter5;

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

    // 4 -> b = a가 값을 복사하는 것이 아니라 a 객체 자체를 b에 assign하는 것이라면
    // a에 element를 추가하면 b에도 추가된다

  }
}
