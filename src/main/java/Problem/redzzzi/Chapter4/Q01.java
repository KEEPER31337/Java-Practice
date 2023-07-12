package Problem.redzzzi.Chapter4;

// 주어진 코드의 결과를 생각해보기
public class Q01 {

  public static void main(String[] args) {
    String a = "write once, run anywhere";
    if (a.contains("wife")) {
      System.out.println("wife"); // 해당 문자열없으니까 패스
    } else if (a.contains("once") && !a.contains("run")) {
      System.out.println("once"); // 전자는 만족하지만 후자 만족하지 않으므로 패스
    } else if (!a.contains("everywhere")) {
      System.out.println("everywhere"); // 만족하므로 출력
    } else if (a.contains("anywhere")) {
      System.out.println("anywhere");
    } else {
      System.out.println("none");
    }
  }

}
// 예상 결과: everywhere
