package Problem.yejun.Chapter5;

public class Q01 {

  public static class UpgradeCalculator extends Calculator {
    public void minus(int val) {
      value -= val;
    }
  }
  public static void main(String[] args) {
    UpgradeCalculator cal = new UpgradeCalculator();
    cal.add(10);
    cal.minus(3);
    System.out.println(cal.getValue());
  }
}
