package Practice.shkisme.Chapter3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapPractice {

  public static void main(String[] args) {
    // HashMap
    // put
    HashMap<String, String> map = new HashMap<>();
    map.put("people", "사람");
    map.put("baseball", "야구");
    // get
    System.out.println(map.get("people"));  // "사람" 출력
    // getOrDefault
    System.out.println(map.getOrDefault("java", "자바"));  // "자바" 출력
    // containsKey
    System.out.println(map.containsKey("people"));  // true 출력
    // remove
    System.out.println(map.remove("people"));  // "사람" 출력
    // size
    System.out.println(map.size());
    // keySet
    System.out.println(map.keySet());  // [baseball, people] 출력
    // - keySet() 메서드는 Map의 모든 Key를 모아서 Set 자료형으로 리턴한다. Set 자료형은 다음과 같이 List 자료형으로 바꾸어 사용할수도 있다.
    List<String> keyList = new ArrayList<>(map.keySet());

  }

}
