package Problem.yejun.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q06 {

  /**
   * 리스트 역순 정렬하기
   */
  public static void main(String[] args) {
    ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
    System.out.println(myList); // [1, 3, 5, 4, 2]가 출력됨.

    myList.sort(Collections.reverseOrder());
    System.out.println(myList);
  }
}
