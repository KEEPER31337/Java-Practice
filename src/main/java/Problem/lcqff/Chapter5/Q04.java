package Problem.lcqff.Chapter5;

import java.util.ArrayList;
import java.util.Arrays;

public class Q04 {
  public static void main(String[] args) {

    // TODO: 다음과 같이 정수 배열 또는 정수의 리스트로 그 평균값을 구해 리턴하는 Calculator 클래스를 작성하시오. (메서드 오버로딩을 사용해 보자.)
    int[] data = {1, 3, 5, 7, 9};
    Calculator cal = new Calculator();
    int result1 = cal.avg(data);
    System.out.println("average1: "+result1);  // 5 출력

    ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
    Calculator cal2 = new Calculator();
    int result2 = cal2.avg(data2);
    System.out.println("average2: "+result2);  // 5 출력

  }
}
