package Problem.kimminjun.Chapter5;

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

    System.out.println(a.hashCode());
    System.out.println(b.hashCode());
    /*
    4
    primitive 자료형의 경우는 call by value
    하지만 a는 ArrayList 객체. reference type을 전달
    둘의 hashCode를 비교해봐도 같다.
    만약 ArrayList<Integer> b = new ArrayList<>(a); 라면
    b 객체는 a 객체의 값을 복사한 새로은 객체를 가리키니 둘의 해시코드는 다르다.
     */
  }
}
