package Practice.redzzzi.Chapter5;

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

  int mulb(int a, int b) {
    return a * b;
  }

  public static void main(String[] args) {
    Calculator calculator1 = new Calculator(); // 변수 만들기 단축키 설명
    Calculator calculator2 = new Calculator();
  }
}