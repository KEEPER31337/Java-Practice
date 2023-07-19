package Problem.redzzzi.Chapter3;

// 맵에서 값 추출하기!

import java.util.HashMap;

public class Q08 {

  public static void main(String[] args) {
    HashMap<String, Integer> grade = new HashMap<>();
    grade.put("A", 90);
    grade.put("B", 80);
    grade.put("C", 70);
    System.out.println("맵 grade에서 \"B\"에 해당되는 값을 추출해보자!");
    System.out.println(grade.remove("B"));
    System.out.println("grade에 \"B\"에 해당하는 아이템이 사라지면서 해당 value값을 반환하게 된다!");
  }
}
