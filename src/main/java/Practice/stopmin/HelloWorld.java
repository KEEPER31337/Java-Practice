package Practice.stopmin;

public class HelloWorld {

  public static void main(String[] args) {
    System.out.println("Hello World!"); // 표준 출력
    System.err.println("Error!"); // 표준 에러 출력
    System.out.println("숫자" + 3 + "~~~");

    Sample sample = new Sample("EE");
    sample.myPublic();
  }
}
