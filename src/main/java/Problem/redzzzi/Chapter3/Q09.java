package Problem.redzzzi.Chapter3;

// 중복 숫자 제거하기!

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q09 {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
    System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력
    System.out.println("\n중복 숫자가 제거된다면?");
    HashSet<Integer> clean = new HashSet<>(numbers);
    System.out.println(clean);
  }
}
