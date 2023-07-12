package Problem.ggang9.Chapter5;

public class Q06 {

  /**
   * 생성자와 초깃값
   */
  public static void main(String[] args) {
    // TODO: 다음은 Calculator 객체를 생성하고 값을 더한 후에 그 결과값을 출력하는 예제이다. 하지만 코드를 실행하면 오류가 발생한다. 이 코드의 오류를 수정하시오.
    Calculator cal = new Calculator();
    cal.add(3);  // 여기서 NullPointerException 이 발생한다.
    System.out.println(cal.getValue());
  }
}
