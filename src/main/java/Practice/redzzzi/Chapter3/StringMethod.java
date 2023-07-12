package Practice.redzzzi.Chapter3;

public class StringMethod {

  public static void main(String[] args) {
    // 문자열 내장 메소드

    // equals 예제 1
    String a = "hello";
    String b = "java";
    String c = "hello";
    System.out.println(a.equals(b)); // false 출력 - a 문자열값과 b 문자열값이 같은지 판단
    System.out.println(a.equals(c)); // true 출력

    // equals 예제 2
    String a2 = "hello";
    String b2 = new String("hello");
    System.out.println(a2.equals(b2));  // true - 문자열 내용 같으므로
    System.out.println(a2 == b2);  // false - 서로 다른 객체이므로

    // indexOf
    String a3 = "Hello Java";
    System.out.println(a3.indexOf("Java"));  // 6 출력 - 숫자 0부터 세니까 6번째

    // contains
    String a4 = "Hello Java";
    System.out.println(a4.contains("Java"));  // true 출력

    // charAt
    String a5 = "Hello Java";
    System.out.println(a5.charAt(6));  // "J" 출력

    // replaceAll
    String a6 = "Hello Java";
    System.out.println(a6.replaceAll("Java", "World"));  // Hello World 출력

    // substring
    String a7 = "Hello Java";
    System.out.println(a7.substring(0, 4));  // Hell 출력, a에서 인덱스 0~3 부분 뽑아냄

    // toUpperCase
    String a8 = "Hello Java";
    System.out.println(a8.toUpperCase());  // HELLO JAVA 출력, 모두 다 대문자 처리

    // split
    String a9 = "a:b:c:d";
    String[] result = a9.split(":"); // result는 {"a", "b", "c", "d"} 형태

  }

}
