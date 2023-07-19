package Problem.ggang9.Chapter5;

class MaxLimitCalculator extends Calculator {
  public MaxLimitCalculator() {

  }

  public void add(int val) {
    this.value += val;
    if (this.value >= 100) {
      this.value = 100;
    }
  }
}

public class Q02 {

  /**
   * MaxLimitCalculator
   */
  public static void main(String[] args) {
    // TODO: 객체변수 value가 100 보다 큰 값은 가질 수 없도록 제한하는 MaxLimitCalculator 클래스를 만들어 보자.

    /** 다음과 같이 동작하는 클래스를 만들어야 한다. (단 MaxLimitCalculator 클래스는 반드시 다음의 Calculator 클래스를 상속해서 만들어야 한다.)
     *
     * MaxLimitCalculator cal = new MaxLimitCalculator();
     * cal.add(50);  // 50 더하기
     * cal.add(60);  // 60 더하기
     * System.out.println(cal.getValue());  // 100 출력
     * */
    MaxLimitCalculator maxLimitCalculator = new MaxLimitCalculator();
    maxLimitCalculator.add(50);
    maxLimitCalculator.add(60);
    System.out.println("maxLimitCalculator = " + maxLimitCalculator.getValue());
  }
}
