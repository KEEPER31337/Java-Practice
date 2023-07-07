package Problem.stopmin.Chapter4;

public class Q05 {

  /**
   * 평균점수 구하기
   */
  public static void main(String[] args) {
    int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};

    // TODO: for each 문을 사용하여 A 학급의 평균 점수를 구해 보자.
    int average = 0;

    for (int entry : marks) {
      average += entry;
    }
    System.out.println(average / marks.length);
  }
}
