package Practice.redzzzi.Chapter3;

public class NumberCal {

  public static void main(String[] args) {

    // 사칙연산
    int a = 10;
    int b = 5;
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);

    // 증감연산
    int i = 0;
    int j = 10;
    i++;
    j--;

    System.out.println(i);  // 1 출력
    System.out.println(j);  // 9 출력

    // 증감연산2
    int k = 0;
    System.out.println(k++);  // 0 출력
    // System.out.println(++i);
    System.out.println(k);  // 1 출력

    // 나머지
    System.out.println(7 % 3);  // 1 출력
    System.out.println(3 % 7);  // 3 출력
  }

}