package Practice.redzzzi.Chapter3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapHashMap {

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("people", "사람");
    map.put("baseball", "야구");
    System.out.println(map);
    System.out.println(map.get("people"));

    System.out.println(map.keySet());

    List<String> keyList = new ArrayList<>(map.keySet());
    System.out.println(keyList);

  }

}
