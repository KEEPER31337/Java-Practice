package Problem.stopmin.Chapter5;

public class Calculator {

  int value;

  Calculator() {
    this.value = 0;
  }

  void add(int val) {
    this.value += val;
  }

  void sub(int val) {
    this.value -= val;
  }

  boolean isOdd(int num) {
    if (num % 2 == 1) {
      return true;
    } else {
      return false;
    }
  }

  int avg(int[] data) {
    int sum = 0;

    for (int entry : data) {
      sum += entry;
    }

    return sum / data.length;
  }


  int getValue() {
    return this.value;
  }

}
