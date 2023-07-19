package Problem.lcqff.Chapter5;

import java.util.ArrayList;
import java.util.Arrays;

public class Q05 {

  /**
   * 리스트와 객체
   */
  public static void main(String[] args) {
    // TODO: 다음 프로그램의 출력결과를 예측하고 그 이유에 대해서 주석으로 설명하시오.

    ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3)); // a는 ArrayList 객체를 참조하고 있다.
    ArrayList<Integer> b = a; // 새로운 변수 b에 a를 할당하므로써 a와 b는 동일한 ArrayList 객체를 참조하게 된다.
    a.add(4); //a가 참조하는 ArrayList에 4를 추가한다. 이는 b가 참조하고 있는 arrayList와 동일하다.
    System.out.println(b.size()); //b가 참조하는 ArrayList의 크기를 출력한다.
  }
}
