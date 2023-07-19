package Practice.shkisme.Chapter3;

public class CastingPractice {

  public static void main(String[] args) {
    String num = "123";
    int n = Integer.parseInt(num);
    System.out.println(n);  // 123 출력

    n = 123;
    num = "" + n;
    System.out.println(num);  // 123 출력

    n = 123;
    String num1 = String.valueOf(n);
    String num2 = Integer.toString(n);
    System.out.println(num1);  // 123 출력
    System.out.println(num2);  // 123 출력

    num = "123.456";
    double d = Double.parseDouble(num);
    System.out.println(d);

    // 정수 - 실수 사이의 형변환
    int n1 = 123;
    double d1 = n1;  // 정수를 실수로 바꿀때에는 캐스팅이 필요없다.
    System.out.println(d1);  // 123.0 출력

    double d2 = 123.456;
    int n2 = (int) d2; // 실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅해 주어야 한다.
    System.out.println(n2);  // 소숫점이 생략된 123 출력

    // 실수 형태의 문자열을 정수로 변경하려고 하면 - NumberFormatException
    num = "123.456";
    n = Integer.parseInt(num);  // 실수 형태의 문자열을 정수로 변환할 경우 NumberFormatException이 발생한다.
  }

}
