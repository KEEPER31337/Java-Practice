package Problem.lcqff.Chapter5;

public class Q06 {

  /**
   * 생성자와 초깃값
   */
  public static void main(String[] args) {
    // TODO: 다음은 Calculator 객체를 생성하고 값을 더한 후에 그 결과값을 출력하는 예제이다. 하지만 코드를 실행하면 오류가 발생한다. 이 코드의 오류를 수정하시오.
    Calculator cal = new Calculator();
    cal.add(3);  // 여기서 NullPointerException 이 발생한다.
    System.out.println(cal.getValue());

    // Integer 클래스를 사용해 선언된 변수는 null로 초기화 된다. 따라서 초기화 하지 않고 사용할 경우 NullPointException이 발생한다.
    // int로 선언된 변수는 기본적으로 0으로 초기화된다. 따라서 따로 초기화 하지 않아도 NullPointException이 발생하지 않는다.
  }
}
