package Problem.lcqff.Chapter5;

public class Calculator {

  int value;

  Calculator() {
    this.value = 0;
  }

  boolean isOdd(int num) {
    return num%2==0 ? false : true;
  }
  void add(int val) {
    this.value += val;
  }

  int getValue() {
    return this.value;
  }

}
