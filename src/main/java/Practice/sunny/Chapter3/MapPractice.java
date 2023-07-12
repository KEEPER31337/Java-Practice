package Practice.sunny.Chapter3;

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
    System.out.println(map.get("people"));
    System.out.println(map.get("java"));
    System.out.println(map.getOrDefault("java", "자바"));

    // containsKey
    System.out.println(map.containsKey("people"));

    // remove
    System.out.println(map.remove("people"));

    // size
    System.out.println(map.size());

    // keySet
    System.out.println(map.keySet());
    List<String> keyList = new ArrayList<>(map.keySet());
  }
}
