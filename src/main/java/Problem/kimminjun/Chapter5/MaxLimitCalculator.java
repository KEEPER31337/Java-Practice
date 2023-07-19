package Problem.kimminjun.Chapter5;

public class MaxLimitCalculator extends Calculator {

  MaxLimitCalculator() {
    super();
  }

  void add(int num) {
    this.value += num;

    if (this.value > 100) {
      this.value = 100;
    }
  }
}
