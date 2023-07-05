package Problem.sunny.Chapter4;

public class Q01 {

  /**
   * 조건문의 참과 거짓
   */
  public static void main(String[] args) {
    String a = "write once, run anywhere";
    if (a.contains("wife")) {
      System.out.println("wife");
    } else if (a.contains("once") && !a.contains("run")) {
      System.out.println("once");
    } else if (!a.contains("everywhere")) {
      System.out.println("everywhere");
    } else if (a.contains("anywhere")) {
      System.out.println("anywhere");
    } else {
      System.out.println("none");
    }

    // TODO: 코드의 출력 결과가 무엇일지 생각해보기
  }
}
