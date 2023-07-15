package Problem.sunny.Chapter5;

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

  Boolean isOdd(int val) {
    if ((val % 2) == 0) {
      return false;
    } else {
      return true;
    }
  }

  int avg(int[] list) {
    int sum = 0;
    for (int i = 0; i < list.length; i++) {
      sum += list[i];
    }
    return sum / list.length;
  }

  int avg(ArrayList list) {
    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum += (int) list.get(i);
    }
    return sum / list.size();
  }
}
