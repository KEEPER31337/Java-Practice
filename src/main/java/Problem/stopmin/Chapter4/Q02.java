package Problem.stopmin.Chapter4;

public class Q02 {

  /**
   * 3의 배수의 합
   */
  public static void main(String[] args) {
    // TODO: while 문을 사용해서 1부터 1000까지의 자연수 중 3의 배수의 합을 구하기
    int num = 1;
    int sum = 0;

    while (num < 1000) {
      if (num % 3 == 0) {
        sum += num;
      }
      num++;
    }

    System.out.println(sum);
  }
}
