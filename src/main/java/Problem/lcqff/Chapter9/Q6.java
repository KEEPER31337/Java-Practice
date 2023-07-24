package Problem.lcqff.Chapter9;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6 { // 입력 숫자의 총합 구하기

  /**
   * 사용자로부터 다음과 같은 숫자를 입력받아 입력받은 숫자의 총합을 구하는 프로그램을 작성하시오. (단 숫자는 콤마로 구분하여 입력한다.)
   *
   * 65,45,2,3,45,8
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> nums = new ArrayList<Integer>();
    while (true) {
      System.out.print("숫자를 입력하세요(Type 'exit' to quit): ");
      String res = scanner.next();
      if (res.equals("exit")) break;
      nums.add(Integer.parseInt(res));
    }

    System.out.println(nums.stream().reduce(0,(res,num) ->{return res+num;}));
  }

}
