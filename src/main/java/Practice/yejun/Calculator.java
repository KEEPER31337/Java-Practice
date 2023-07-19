package Practice.yejun;

public class Calculator {

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

  public static void main(String[] args) {
    Calculator calculator1 = new Calculator();
    System.out.println(calculator1);
    Calculator calculator2 = new Calculator();
    System.out.println(calculator2);
  }
}