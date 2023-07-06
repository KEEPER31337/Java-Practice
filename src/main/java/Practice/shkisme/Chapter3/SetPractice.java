package Practice.shkisme.Chapter3;

import java.util.Arrays;
import java.util.HashSet;

public class SetPractice {

  public static void main(String[] args) {
    HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
    System.out.println(set);  //  [e, H, l, o] 출력 - 중복 허용하지 않음.

    HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

    // 교집합
    HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 intersection 생성
    intersection.retainAll(s2);  // 교집합 수행
    System.out.println(intersection);  // [4, 5, 6] 출력
    // 합집합
    HashSet<Integer> union = new HashSet<>(s1);  // s1으로 union 생성
    union.addAll(s2); // 합집합 수행
    System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력
    // 차집합
    HashSet<Integer> substract = new HashSet<>(s1);  // s1으로 substract 생성
    substract.removeAll(s2); // 차집합 수행
    System.out.println(substract);  // [1, 2, 3] 출력

    // add
    set = new HashSet<>();
    set.add("Jump");
    set.add("To");
    set.add("Java");
    System.out.println(set);  // [Java, To, Jump] 출력

    // addAll
    set = new HashSet<>();
    set.add("Jump");
    set.addAll(Arrays.asList("To", "Java"));
    System.out.println(set);  // [Java, To, Jump] 출력

    // remove
    set = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
    set.remove("To");
    System.out.println(set);  // [Java, Jump] 출력
  }

}
