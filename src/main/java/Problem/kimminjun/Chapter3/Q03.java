package Problem.kimminjun.Chapter3;

public class Q03 {

  /**
   * 주민등록번호 나누기
   */
  public static void main(String[] args) {
    String personNumber = "881120-1068234";

    // TODO: 주민등록번호를 연월일(YYYYMMDD) 부분과 그 뒤의 숫자 부분으로 나누어 출력하기

    System.out.println(
        personNumber.substring(0, 6) + " " + personNumber.substring(7, personNumber.length()));
  }
}
