package Problem.yejun.Chapter5;

public class Q02 {

  public static class MaxLimitCalculator extends Calculator {

    @Override
    void add(int val) {
      this.value += val;
      if (100 < value) {
        value = 100;
      }
    }
  }

  public static void main(String[] args) {
    MaxLimitCalculator cal = new MaxLimitCalculator();
    cal.add(50);
    cal.add(60);
    System.out.println(cal.getValue());
  }
}
