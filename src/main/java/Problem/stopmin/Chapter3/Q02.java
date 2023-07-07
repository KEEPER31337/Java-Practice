package Problem.stopmin.Chapter3;

public class Q02 {

  /**
   * 홀수 짝수 판별
   */
  public static boolean isOdd(int a) {
    if (a % 2 == 1) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    int num = 13;

    if (isOdd(num)) {
      System.out.println("Odd");
    } else {
      System.out.println("even");
    }
  }
}
