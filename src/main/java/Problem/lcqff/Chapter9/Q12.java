package Problem.lcqff.Chapter9;

import java.awt.*;
import java.util.Scanner;

public class Q12 { // 문자열 압축하기

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    String res ="";

    int i=1;
    str = str+" ";

    while(i<str.length()) {
      int seq = 1;
      while (str.charAt(i) == str.charAt(i-1)) {
        seq++;
        i++;
      }
      res = res+str.charAt(i-1)+seq;
      i++;
    }

    System.out.println(res);
  }

  /**
   * 문자열을 입력받아 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시해 문자열을 압축하여 표시하시오.
   *
   * 입력 예시: aaabbcccccca
   * 출력 예시: a3b2c6a1
   */

}
