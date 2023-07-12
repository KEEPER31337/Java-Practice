package Problem.yejun.Chapter3;

public class Q05 {

  /**
   * 문자열 바꾸기
   */
  public static void main(String[] args) {
    String a = "a:b:c:d";

    a = a.replaceAll(":", "#");
    System.out.println(a);
  }
}
