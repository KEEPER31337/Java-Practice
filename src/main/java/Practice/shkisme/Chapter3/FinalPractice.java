package Practice.shkisme.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalPractice {

  public static void main(String[] args) {
    final int n = 123;  // final 로 설정하면 값을 바꿀수 없다.
    // n = 456;  // 컴파일 에러 발생

    final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
    // a = new ArrayList<>(Arrays.asList("c", "d"));  // 컴파일 에러 발생

    a.add("이건 된다.");

    // 만약 그 값을 더하거나 빼는 것도 불가능하게 하고 싶은 경우에는 List.of로 수정이 불가능한 리스트(Unmodifiable List)를 사용해야 한다.
    final List<String> b = List.of("a", "b");
    b.add("c");  // UnsupportedOperationException 발생
  }

}
