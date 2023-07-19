package Problem.kimminjun.Chapter7;

import java.util.ArrayList;

public class Q4 { // 홀수에만 2를 곱하여 리턴하기

  // TODO: 함수형 프로그래밍으로 코드 다시 짜보기 (stream 이용해보기)
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    ArrayList<Integer> temp = new ArrayList<>();
    for (int num : numbers) {
      if (num % 2 == 1) {  // 홀수이면
        temp.add(num * 2);  // 2를 곱하여 temp에 담는다.
      }
    }

    // 정수 리스트를 정수배열로 변환한다.
    int[] result = new int[temp.size()];
    for (int i = 0; i < temp.size(); i++) {
      result[i] = temp.get(i);
    }
  }

}
