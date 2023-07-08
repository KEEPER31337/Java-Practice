package Practice.sunny.Chapter4;

import java.util.ArrayList;
import java.util.Arrays;

public class ForPractice {

  public static void main(String[] args) {

    // For Loop
    String[] numbers = {"one", "two", "three"};
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    // For Example
    int[] marks = {90, 25, 67, 45, 80};
    for (int i = 0; i < marks.length; i++) {
      if (marks[i] >= 60) {
        System.out.println((i + 1) + "번 학생은 합격입니다.");
      } else {
        System.out.println((i + 1) + "번 학생은 불합격입니다.");
      }
    }

    // Continue For
    for (int i = 0; i < marks.length; i++) {
      if (marks[i] < 60) {
        continue;
      }
      System.out.println((i + 1) + "번 학생 축하합니다. 합격입니다.");
    }

    // Double For
    for (int i = 2; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.print(i * j + " ");
      }
      System.out.println("");
    }

    // For Each
    /*
    for (type var: iterate){
      body-of-loop
    }
     */
    String[] numbers2 = {"one", "two", "three"};
    for (String number : numbers2) {
      System.out.println(number);
    }

    // For Each Arraylist
    ArrayList<String> numbers3 = new ArrayList<>(Arrays.asList("one", "two", "three"));
    for (String number : numbers3) {
      System.out.println(number);
    }
  }
}
