package Problem.yejun.Chapter3;

public class Q03 {

  /**
   * 주민등록번호 나누기
   */
  public static void main(String[] args) {
    String personNumber = "881120-1068234";

    System.out.println(personNumber.substring(0, 6));
    System.out.println(personNumber.substring(7, 14));
  }
}
