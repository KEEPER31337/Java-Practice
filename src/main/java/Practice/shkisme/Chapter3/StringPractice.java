package Practice.shkisme.Chapter3;

public class StringPractice {

  public static void main(String[] args) {
    String a = "Happy Java"; // 리터럴 방식 - 고정된 값을 사용하는 것이다.
    String b = new String("a"); // 객체 생성 방식 (권장하지 않음.)

    // Primitive 자료형
    boolean result = true;
    char a2 = 'A';
    int i = 100000;
    // Wrapper 클래스
    Integer integer;
    Long longg;
    Double doublee;
    Float floatt;
    Boolean booleann;
    Character character;

    // String - equals
    a = "hello";
    b = "java";
    String c = "hello";
    System.out.println(a.equals(b)); // false 출력
    System.out.println(a.equals(c)); // true 출력
    // 문자열을 비교할때는 반드시 equals 를 사용해야 한다.
    a = "hello";
    b = new String("hello");
    System.out.println(a.equals(b));  // true
    System.out.println(a == b);  // false - a 와 b는 서로 다른 객체이기 떄문이다.

    // indexOf
    a = "Hello Java";
    System.out.println(a.indexOf("Java"));  // 6 출력

    // contains
    a = "Hello Java";
    System.out.println(a.contains("Java"));  // true 출력

    // charAt
    a = "Hello Java";
    System.out.println(a.charAt(6));  // "J" 출력

    // replaceAll
    a = "Hello Java";
    System.out.println(a.replaceAll("Java", "World"));  // Hello World 출력

    // substring
    a = "Hello Java";
    System.out.println(a.substring(0, 4));  // Hell 출력

    // toUpperCase
    a = "Hello Java";
    System.out.println(a.toUpperCase());  // HELLO JAVA 출력

    // split
    a = "a:b:c:d";
    String[] result2 = a.split(":");  // result는 {"a", "b", "c", "d"}

    // 문자열 포매팅
    // 1. 숫자 바로 대입
    System.out.println(String.format("I eat %d apples.", 3));  // "I eat 3 apples." 출력
    // 2. 문자열 바로 대입
    System.out.println(String.format("I eat %s apples.", "five"));  // "I eat five apples." 출력
    // 3. 숫자 값을 나타내는 변수로 대입
    int number = 3;
    System.out.println(String.format("I eat %d apples.", number));  // "I eat 3 apples." 출력
    // 4. 2개 이상의 값 넣기
    number = 10;
    String day = "three";
    System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));

    // 문자열 포맷 코드
    System.out.println(String.format("I have %s apples", 3));  // "I have 3 apples" 출력
    System.out.println(
        String.format("rate is %s", 3.234));  // "rate is 3.234" 출력 - %s는 자동으로 전달되는 파라미터 값을 문자열로 바꿔서 사용한다.
    // 포매팅 연산자 %d와 %를 같이 쓸 때는 %%를 쓴다
    System.out.println(String.format("Error is %d%%.", 98));  // "Error is 98%." 출력

    // 포맷 코드와 숫자 함께 사용하기
    // 1. 정렬과 공백
    System.out.println(String.format("%10s", "hi"));  // "        hi" 출력
    System.out.println(String.format("%-10sjane.", "hi"));  // "hi        jane." 출력
    // 2. 소수점 표현
    System.out.println(String.format("%.4f", 3.42134234));  // 3.4213 출력
    System.out.println(String.format("%10.4f", 3.42134234));  // '    3.4213' 출력
    // System.out.printf
    System.out.printf("I eat %d apples.", 3);  // "I eat 3 apples." 출력
  }

}
