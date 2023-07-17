package Problem.ggang9.Chapter5;

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

  String isOdd(int val) {
    if (val % 2 == 0) {
      return "even";
    }
    return "odd";
  }

  int avg(int[] val) {
    int sum = 0;
    for (int num : val) {
      sum += num;
    }
    return sum / val.length;
  }

  int avg(ArrayList<Integer> arr) {
    int sum = 0;
    for (int num : arr) {
      sum += num;
    }
    return sum / arr.size();
  }
}
