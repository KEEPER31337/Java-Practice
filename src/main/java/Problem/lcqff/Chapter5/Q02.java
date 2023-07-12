package Problem.lcqff.Chapter5;

public class Q02 {

  public class MaxLimitCalculator extends Calculator {
    public MaxLimitCalculator() {
      super();
    }

    void add(int num) {
      if (value>100)
        value += num;
      else System.out.println("100 넘으면 안됨!!");
    }

    public void main(String[] args) {
      MaxLimitCalculator cal = new MaxLimitCalculator();
      cal.add(50);
      cal.add(60);
      System.out.println(cal.getValue());
    }
  }

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
  }
}



