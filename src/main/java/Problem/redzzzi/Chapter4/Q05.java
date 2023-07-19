package Problem.redzzzi.Chapter4;

// 평균 구하기
public class Q05 {

  public static void main(String[] args) {
    int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
    int total = 0;
    for (int mark : marks) {
      total += mark;
    }
    System.out.println(total / marks.length);
  }

}
