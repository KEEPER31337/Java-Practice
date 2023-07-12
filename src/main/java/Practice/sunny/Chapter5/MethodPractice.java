package Practice.sunny.Chapter5;

import java.awt.image.SampleModel;

public class MethodPractice {


  // 입력값이 있고 리턴값이 있는 메서드
  int sum(int a, int b) {
    return a + b;
  }

  // 입력값이 없는 메서드
  String say() {
    return "Hi";
  }

  // 리턴값이 없는 메서드
  void sum2(int a, int b) {
    System.out.println(a + "과 " + b + "의 합은 " + (a + b) + "입니다.");
  }

  // 입력값과 리턴값 둘 다 없는 메서드
  void say2() {
    System.out.println("Hi");
  }

  void sayNick(String nick) {
    if ("fool".equals(nick)) {
      return;
    }
    System.out.println("나의 별명은 " + nick + "입니다.");
  }

  void varTest(int a) {
    a++;
  }

  int varTest2(int a) {
    a++;
    return a;
  }

  int e;

  void varTest3(MethodPractice sample) {
    sample.e++;
  }

  void varTest4() {
    this.e++;
  }

  public static void main(String[] args) {
    int a = 3;
    int b = 4;

    MethodPractice sample = new MethodPractice();
    int c = sample.sum(a, b);
    System.out.println(c);

    String d = sample.say();
    System.out.println(d);

    sample.sum2(a, b);

    sample.say2();

    sample.sayNick("angel");
    sample.sayNick("fool");

    a = 1;
    sample.varTest(a);
    System.out.println(a);

    a = sample.varTest2(a);
    System.out.println(a);

    sample.e = 1;
    sample.varTest3(sample);
    System.out.println(sample.e);

    sample.varTest4();
    System.out.println(sample.e);

  }
}
