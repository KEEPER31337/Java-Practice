package Practice.shkisme.Chapter3;

public class BooleanPractice {

  public static void main(String[] args) {
    // boolean 변수 이름은 is~, has~, can~ 쓴다.
    boolean isSuccess = true;
    boolean isTest = false;

    System.out.println(2 > 1); // true
    System.out.println(1 == 2); // false
    System.out.println(3 % 2 == 1); // true
    System.out.println("3".equals("2")); // false

    int base = 180;
    int height = 185;
    boolean isTall = height > base;

    if (isTall) {
      System.out.println("키가 큽니다.");
    }

    int i = 3;
    boolean isOdd = i % 2 == 1;
    System.out.println(isOdd);  // true 출력
  }

}
