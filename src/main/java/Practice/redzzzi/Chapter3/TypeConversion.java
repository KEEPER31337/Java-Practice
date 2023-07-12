package Practice.redzzzi.Chapter3;

public class TypeConversion {

  public static void main(String[] args) {
    // 문자열을 정수로
    String num = "123";
    int n = Integer.parseInt(num);
    System.out.println(n);  // 123 출력

    // 정수를 문자열로
    int n2 = 123;
    String num2 = "" + n2;
    System.out.println(num2);  // 123 출력

    int m = 123;
    String num3 = String.valueOf(m);
    String num4 = Integer.toString(m);
    System.out.println(num3);  // 123 출력
    System.out.println(num4);  // 123 출력

    // 정수와 실수 사이 변환
    int n1 = 123;
    double d1 = n1;  // 정수를 실수로 바꿀때에는 캐스팅이 필요없다.
    System.out.println(d1);  // 123.0 출력

    double d2 = 123.456;
    int m2 = (int) d2; // 실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅해 주어야 한다.
    System.out.println(m2);  // 소숫점이 생략된 123 출력

  }

}
