package Problem.lcqff.Chapter9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

public class Q13 { // Duplicate Numbers

  public static boolean checkContainsAll(String str) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i <= 9; i++) {
      set.add(i);
    }

    Stream arr = Arrays.stream(str.split("")).map(num -> parseInt(num));
    if (arr.toList().containsAll(set)) {
      return true;
    }
    else return false;
  }

  public static boolean checkNoDup(String str) {
    Set<Character> set = new HashSet<>();
    for (char c : str.toCharArray()) {
      if (!set.add(c)) {
        return false;
      }
    }
    return true;
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] strArr = scanner.nextLine().split(" ");

    for (String str:strArr) {
      System.out.print((checkNoDup(str) && checkContainsAll(str))+" ");
    }

  }

  /**
   * 0~9의 문자로 된 숫자를 입력받았을 때, 이 입력값이 0~9의 모든 숫자를 각각 한 번씩만 사용한 것인지 확인하는 프로그램을 작성하시오.
   *
   * 입력 예시: 0123456789 01234 01234567890 6789012345 012322456789
   * 출력 예시: true false false true false
   */

}
