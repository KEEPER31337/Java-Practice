package Practice.Ch05._01;

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

  int mul(int num) {
    result *= num;
    return result;
  }
}


class Calculator1 {

  static int result = 0;

  static int add(int num) {
    result += num;
    return result;
  }
}

class Calculator2 {

  static int result = 0;

  static int add(int num) {
    result += num;
    return result;
  }
}

public class Ch05_01 {

  public static void main(String[] args) {

//    System.out.println(Calculator1.add(3));
//    System.out.println(Calculator1.add(4));
//
//    System.out.println(Calculator2.add(7));
//    System.out.println(Calculator2.add(3));

//    Calculator cal1 = new Calculator();
//    Calculator cal2 = new Calculator();
//
//    System.out.println(cal1.add(3));
//    System.out.println(cal1.add(4));
//    System.out.println(cal1.sub(9));
//
//    System.out.println(cal2.add(3));
//    System.out.println(cal2.add(7));
    Calculator whatever = new Calculator();
    Calculator cal1 = new Calculator();
    Calculator cal2 = new Calculator();
    System.out.println(cal1);
    System.out.println(cal2);
    cal1.add(3);

  }
}
