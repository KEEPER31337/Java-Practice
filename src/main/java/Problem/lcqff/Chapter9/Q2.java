package Problem.lcqff.Chapter9;

import java.util.HashMap;

public class Q2 { // 맵에서 값 추출하기

  // 다음은 맵 a에서 "C"라는 key에 해당하는 value를 출력하는 프로그램이다.
  public static void main(String[] args) {
    HashMap<String, Integer> a = new HashMap<>();
    a.put("A", 90);
    a.put("B", 80);
    System.out.println(a.get("C"));  // null 출력


    // TODO: a 맵에는 'C'라는 key가 없으므로 위처럼 null이 출력된다. 'C'에 해당하는 key 값이 없을 경우 null 대신 70을 얻을 수 있도록 수정하시오.
  }

}
