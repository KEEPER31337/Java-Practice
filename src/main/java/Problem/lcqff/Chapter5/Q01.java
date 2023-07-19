package Problem.lcqff.Chapter5;

public class Q01 {

  public static class UpgradeCalculator extends Calculator {
    void minus(int num) {
      this.value -= num;
    }
  }

  public static void main(String[] args) {
    Calculator cal = new Calculator();
    cal.add(10);
    System.out.println("Calculator value:"+cal.getValue());  // 10 출력

    // TODO: Calculator 클래스를 상속하는 UpgradeCalculator를 만들고 값을 뺄 수 있는 minus 메서드를 추가해 보자.
    UpgradeCalculator upgradedCal = new UpgradeCalculator();
    upgradedCal.add(10);
    upgradedCal.minus(3);
    System.out.println("UpgradeCalculator value:"+upgradedCal.getValue());
  }
}

