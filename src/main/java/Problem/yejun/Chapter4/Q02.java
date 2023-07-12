package Problem.yejun.Chapter4;

public class Q02 {

  /**
   * 3의 배수의 합
   */
  public static void main(String[] args) {
    int n = 1, sum = 0;

    while (n <= 1000) {
      if (n % 3 == 0) {
        sum += n;
      }
      n++;
    }

    System.out.println(sum);
  }
}
