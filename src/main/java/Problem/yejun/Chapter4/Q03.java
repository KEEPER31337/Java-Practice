package Problem.yejun.Chapter4;

public class Q03 {

  /**
   * 별 표시하기
   */
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print('*');
      }
      System.out.println();
    }
  }
}
