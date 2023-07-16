package Problem.lcqff.Chapter5;

public class Q02 {

  public static class MaxLimitCalculator extends Calculator {
    void add(int num) {
      if (value+num<=100)
        value += num;
      else {
        System.out.println("100 넘으면 안됨!! num should be less then "+(100-value));
      }
    }
  }

  public static void main(String[] args) {
    // TODO: 객체변수 value가 100 보다 큰 값은 가질 수 없도록 제한하는 MaxLimitCalculator 클래스를 만들어 보자.
    MaxLimitCalculator MaxLimitCal = new MaxLimitCalculator();
    MaxLimitCal.add(50);
    MaxLimitCal.add(60);
    System.out.println("current value:" + MaxLimitCal.getValue());
  }
}



