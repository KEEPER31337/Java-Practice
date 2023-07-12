package Problem.yejun.Chapter4;

public class Q05 {

  /**
   * 평균점수 구하기
   */
  public static void main(String[] args) {
    int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
    int sum = 0;
    double average = 0;

    for (int score : marks) {
      sum += score;
    }
    average = (double) sum / marks.length;

    System.out.println(average);
  }
}
