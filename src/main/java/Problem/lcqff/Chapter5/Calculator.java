package Problem.lcqff.Chapter5;

import java.util.ArrayList;

public class Calculator {

  int value;

  Calculator() {
    this.value = 0;
  }

  int avg(int[] data) {
    int sum = 0;
    for (int num:data) sum += num;
    return sum/ data.length;
  }

  int avg(ArrayList<Integer> data) {
    int sum = 0;
    for (int num:data) sum += num;
    return sum/ data.size();
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
