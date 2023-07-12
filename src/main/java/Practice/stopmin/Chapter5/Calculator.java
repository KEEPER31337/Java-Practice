package Practice.stopmin.Chapter5;

public class Calculator {

  int result = 0;

  int add(int num) {
    return result + num;
  }

  int sub(int num) {
    return result - num;
  }

  public static void main(String[] args) {
    Calculator calculator1 = new Calculator();
    Calculator calculator2 = new Calculator();

    System.out.println(calculator1);
    System.out.println(calculator2);
  }
}



