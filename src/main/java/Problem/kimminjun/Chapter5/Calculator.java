package Problem.kimminjun.Chapter5;

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

  boolean isOdd(int num) {
    if (num % 2 == 0) {
      return false;
    }
    return true;
  }

  int avg(int[] array_data) {
    int sum = 0;

    for (int elem : array_data) {
      sum += elem;
    }

    return sum / array_data.length;
  }

  int avg(ArrayList<Integer> array_list_data) {
    int sum = 0;

    for (int elem : array_list_data) {
      sum += elem;
    }

    return sum / array_list_data.size();
  }

}