package Practice.sunny.Chapter5;

class Calculator {

  int result = 0;

  int add(int num) {
    result += num;
    return result;
  }

  int sub(int num) {
    result -= num;
    return result;
  }

  int mult(int num) {
    result *= num;
    return result;
  }
}

public class ObjectOrientedPractice {

  public static void main(String[] args) {
    Calculator cal1 = new Calculator();
    Calculator cal2 = new Calculator();

    System.out.println(cal1);
    System.out.println(cal2);

    System.out.println(cal1.add(3));
    System.out.println(cal1.add(4));

    System.out.println(cal2.add(3));
    System.out.println(cal2.add(7));

    System.out.println(cal1.sub(3));
  }
}
