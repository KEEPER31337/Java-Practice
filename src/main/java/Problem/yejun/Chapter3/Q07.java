package Problem.yejun.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q07 {

  /**
   * 리스트를 문자열로 만들기
   */
  public static void main(String[] args) {
    ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
    System.out.println(myList); // [Life, is, too, short] 출력됨.

    String str = String.join(" ", myList);
    System.out.println(str);
  }
}
