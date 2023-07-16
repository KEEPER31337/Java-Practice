package Problem.stopmin.Chapter5;

public class MaxLimitCalculator extends Calculator {

  @Override
  int getValue() {
    if (value > 100) {
      return 100;
    } else {
      return value;
    }
  }
}
