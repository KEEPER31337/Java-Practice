package Problem.shkisme.Chapter5;

public class Q01 {

  /**
   * UpgradeCalculator
   */
  public static void main(String[] args) {
    Calculator cal = new Calculator();
    cal.add(10);
    System.out.println(cal.getValue());  // 10 출력

    // TODO: Calculator 클래스를 상속하는 UpgradeCalculator를 만들고 값을 뺄 수 있는 minus 메서드를 추가해 보자.
    /** 다음과 같이 동작하는 클래스를 만들어야 한다.
     *
     * UpgradeCalculator cal = new UpgradeCalculator();
     * cal.add(10);
     * cal.minus(3);
     * System.out.println(cal.getValue());  // 10에서 3을 뺀 7을 출력
     */
  }
}
