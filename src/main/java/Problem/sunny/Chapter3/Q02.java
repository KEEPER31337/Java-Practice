package Problem.sunny.Chapter3;

public class Q02 {

  /**
   * 홀수 짝수 판별
   */
  public static void main(String[] args) {
    int num = 13;

    // TODO: num이 홀수라면 odd를, 짝수라면 even을 출력하기
    if ((num % 2) == 1) {
      System.out.printf("odd");
    } else {
      System.out.println("even");
    }
  }
}
