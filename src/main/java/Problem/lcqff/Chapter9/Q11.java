package Problem.lcqff.Chapter9;

import java.util.Scanner;

public class Q11 { // DashInsert

  public static boolean isEven(int n) {
    return n%2==0;
  }
  public static String DashInsert(String str) {
    str = str + " ";
    String res = "";
    for (int i=1; i<str.length(); i++) {
      if (isEven(str.charAt(i-1)) && isEven(str.charAt(i)))
        res = res + str.charAt(i-1) + "*";
      else if (!isEven(str.charAt(i-1)) && !isEven(str.charAt(i)))
        res = res + str.charAt(i-1) + "-";
      else res = res+str.charAt(i-1);
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String str = scanner.next();
    System.out.println(DashInsert(str));
  }

  /**
   * DashInsert 메서드는 숫자로 구성된 문자열을 입력받은 뒤 문자열 안에서 홀수가 연속되면 두 수 사이에 - 를 추가하고, 짝수가 연속되면 * 를 추가하는 기능을 갖고 있다. 다음과 같이 동작하는 DashInsert 메서드를 완성하시오.
   *
   * 입력 예시: 4546793
   * 출력 예시: 454*67-9-3
   */

}
