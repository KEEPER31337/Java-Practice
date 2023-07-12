package Problem.redzzzi.Chapter5;

// 아래 코드에 추가하여, Caculator 클래스를 상속하는 UpgradeCaculator를 만들고 값을 뺄 수 있는 minus 메소드를 추가해보자.
// 다음과 같이 동작해야 한다
/*MaxLimitCalculator cal = new MaxLimitCalculator();
cal.add(50);  // 50 더하기
cal.add(60);  // 60 더하기
System.out.println(cal.getValue());  // 100 출력*/

class Calculator {

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
}

class Upgrad

public class Q01 {

  public static void main(String[] args) {
    Calculator cal = new Calculator();
    cal.add(10);
    System.out.println(cal.getValue());
  }

}
