package Problem.yejun.Chapter3;

import java.util.HashMap;

public class Q08 {

  /**
   * 맵에서 값 추출하기
   */
  public static void main(String[] args) {
    HashMap<String, Integer> grade = new HashMap<>();
    grade.put("A", 90);
    grade.put("B", 80);
    grade.put("C", 70);

    System.out.println(grade.get("B"));
    grade.remove("B");
    System.out.println(grade);
  }
}
