package Problem.yejun.Chapter5;

import java.util.ArrayList;
import java.util.Arrays;

public class Q04 {


  public static void main(String[] args) {
    int[] data = {1, 3, 5, 7, 9};
    Calculator cal = new Calculator();
    int result = cal.avg(data);
    System.out.println(result);  // 5 출력

    ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
    Calculator cal2 = new Calculator();
    int result2 = cal2.avg(data2);
    System.out.println(result2);
  }
}
