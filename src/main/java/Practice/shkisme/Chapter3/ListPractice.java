package Practice.shkisme.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListPractice {

  public static void main(String[] args) {
    // 리스는 크기가 정해져 있지 않다. 배열보다 편리한 기능이 많다.

    // ArrayList
    // add
    ArrayList pitches = new ArrayList();
    pitches.add("138");
    pitches.add("129");
    pitches.add("142");

    pitches.add(0, "133");    // 첫번째 위치에 133 삽입.
    pitches.add(1, "133"); // 두번째 위치에 133 삽입.

    // get
    System.out.println(pitches.get(1));

    //size
    System.out.println(pitches.size());

    // contains
    System.out.println(pitches.contains("142"));

    // remove
    System.out.println(pitches.remove("129")); // 값 삭제
    System.out.println(pitches.remove(0)); // 인덱스로 값 삭제

    // 제네릭스 - 더 명확한 타입 체크 가능.
    ArrayList<String> pitches2 = new ArrayList<>(); // <> 안의 자료형은 적지 않아도 된다.
    pitches2.add("138");
    pitches2.add("129");

    Object o = pitches.get(0); // 형 변환이 필요하다.
    String s = pitches2.get(0); // 형 변환이 필요없다.

    // 다양한 방법으로 ArrayList 만들어보기
    String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
    pitches = new ArrayList<>(Arrays.asList(data));
    System.out.println(pitches);  // [138, 129, 142] 출력

    pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
    System.out.println(pitches);

    // String.join - 사용전
    pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
    String result = "";
    for (int i = 0; i < pitches.size(); i++) {
      result += pitches.get(i);
      result += ",";  // 콤마를 추가한다.
    }
    result = result.substring(0, result.length() - 1);  // 마지막 콤마는 제거한다.
    System.out.println(result);  // 138,129,142 출력
    // String.join - 사용후
    pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
    result = String.join(",", pitches);
    System.out.println(result);  // 138,129,142 출력
    // String.join - 문자열 배열에서도 사용 가능
    String[] pitches3 = new String[]{"138", "129", "142"};
    result = String.join(",", pitches);
    System.out.println(result);  // 138,129,142 출력

    // 리스트 정렬하기
    pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
    pitches.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
    System.out.println(pitches);  // [129, 138, 142] 출력
  }

}
