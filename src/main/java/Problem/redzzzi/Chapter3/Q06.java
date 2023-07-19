package Problem.redzzzi.Chapter3;

// 리스트 역순 정렬하기!

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Q06 {

  public static void main(String[] args) {
    ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
    System.out.println(myList); // [1, 3, 5, 4, 2] 출력
    myList.sort(Comparator.reverseOrder()); // 이거 바로 프린트 안됨.
    System.out.println(myList);
  }

}
