package Practice.shkisme.Chapter3;

public class NumberPractice {

  public static void main(String[] args) {
    int age = 10;
    long countOfStar = 8764827384923849L; // int 자료형의 최대값인 2147483647 보다 큰 경우 8764827384923849L과 같이 L 접미사 붙여야 함.

    // 자바에서 실수형은 디폴트가 double이므로 위의 예에서 보듯이 float 변수에 값을 대입할 때에는 3.14F 와 같이 F접미사(또는 소문자 f)를 꼭 붙여 주어야 한다.
    float pi = 3.14F;
    double morePi = 3.14159265358979323846;

    int octal = 023;
    int hex = 0xC;

    int a = 10;
    int b = 5;
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);

    System.out.println(7 % 3);  // 1 출력
    System.out.println(3 % 7);  // 3 출력

    int i = 0;
    int j = 10;
    i++;
    j--;

    System.out.println(i);  // 1 출력
    System.out.println(j);  // 9 출력

    i = 0;
    System.out.println(i++);  // 0 출력
    System.out.println(i);  // 1 출력

    i = 0;
    System.out.println(++i);  // 1 출력
    System.out.println(i);  // 1 출력
  }

}
