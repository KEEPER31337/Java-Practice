package Practice.redzzzi.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class List {

  public static void main(String[] args) {

    ArrayList pitches = new ArrayList();
    pitches.add("138");
    pitches.add("129");
    pitches.add("142");

    System.out.println(pitches.get(1));

    System.out.println(pitches.size());

    System.out.println(pitches.contains("142"));

    System.out.println(pitches.remove("129")); // "129"라는 항목이 성공적으로 삭제되고 true를 리턴
    System.out.println(pitches.remove(0)); // 138

    ArrayList univ = new ArrayList();
    univ.add("pusan");
    univ.add("national");
    univ.add("university");

    univ.add(3, "best");

    System.out.println(univ);

    System.out.println(univ.get(0));

    System.out.println(univ.size());

    System.out.println(univ.contains("worst"));

    System.out.println(univ.remove("pusan"));

    System.out.println(univ);

    System.out.println(univ.remove(0));

    System.out.println(univ);

    ArrayList fruits = new ArrayList();
    fruits.add("watermelon");
    fruits.add("mango");

    String one = (String) fruits.get(0);
    String two = (String) fruits.get(1);

    // java.util.Array 클래스의 asList 메소드 이용
    String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
    ArrayList<String> pitches2 = new ArrayList<>(Arrays.asList(data));
    System.out.println(pitches2);  // [138, 129, 142] 출력

    // 리스트 정렬하기 - import java.util.Comparator;
    ArrayList<String> pitches3 = new ArrayList<>(Arrays.asList("138", "129", "142"));
    pitches3.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
    System.out.println(pitches3);  // [129, 138, 142] 출력

  }

}
