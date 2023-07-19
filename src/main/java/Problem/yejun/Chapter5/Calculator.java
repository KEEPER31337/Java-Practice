package Problem.yejun.Chapter5;

import java.util.ArrayList;

public class Calculator {

  int value;

  Calculator() {
    this.value = 0;
  }

  void add(int val) {
    this.value += val;
  }

  int getValue() {
    return this.value;
  }

  boolean isOdd(int val) {
    return (val % 2 == 1);
  }

  int avg(int[] arr) {
    int sum = 0;
    for (int n : arr) {
      sum += n;
    }
    return sum / arr.length;
  }

  int avg(ArrayList<Integer> arr) {
    int sum = 0;
    for (int n : arr) {
      sum += n;
    }
    return sum / arr.size();
  }
}
