package Practice.redzzzi.Chapter4;

import java.util.Arrays;

public class For {

  public static void main(String[] args) {
    String[] numbers = {"one", "two", "three"};
    System.out.println(Arrays.toString(numbers));

    // for 문의 구조
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    // for 문 예제 - “총 5명의 학생이 시험을 보았는데 시험점수가 60점이 넘으면 합격이고 그렇지 않으면 불합격이다. 합격, 불합격을 판단하여 출력하시오.”
    int[] marks = {90, 25, 67, 45, 80};
    for (int i = 0; i < marks.length; i++) {
      if (marks[i] >= 60) {
        System.out.println((i + 1) + "번 학생은 합격입니다.");
      } else {
        System.out.println((i + 1) + "번 학생은 불합격입니다.");
      }
    }

    // "60점 이상이면 축하 메시지, 나머지에겐 아무것도 전하지 않는 프로그램을 만들어보자"
    int[] score = {90, 25, 67, 45, 80};
    for (int i = 0; i < score.length; i++) {
      if (score[i] >= 60) {
        System.out.println(score[i] + "점 학생 축하해요!");
      } else {
        continue;
      }
    }

  }

}
