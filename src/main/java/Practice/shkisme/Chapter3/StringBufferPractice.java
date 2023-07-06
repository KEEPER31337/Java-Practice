package Practice.shkisme.Chapter3;

public class StringBufferPractice {

  public static void main(String[] args) {
    // StringBuffer
    StringBuffer sb = new StringBuffer();  // StringBuffer 객체 sb 생성
    sb.append("hello");
    sb.append(" ");
    sb.append("jump to java");
    String result = sb.toString();
    System.out.println(result);  // "hello jump to java" 출력

    // String 자료형
    result = "";
    result += "hello";
    result += " ";
    result += "jump to java";
    System.out.println(result);  // "hello jump to java" 출력

    /**
     * StringBuffer - 객체 한번만 생성됨.
     * - 값을 변경할 수 있음 (mutable)
     * - 다만, String 보다 객체 생성 비용이 비싸다. 값을 자주 바꿀 일이 있을 때 쓰자.
     *
     * String
     * - + 연산 있을 때마다 새로운 String 객체 생성됨.
     * - 한번 값이 생성되면 그 값을 변경할 수 없음. (immutable)
     * - trim, toUpperCase 등도 또 다른 String 객체를 생성하여 리턴할 뿐이다.
     */

    // StringBuilder - StringBuffer보다 멀티스레스에서 안전하고, 성능이 우수하다.
    StringBuilder sb2 = new StringBuilder();
    sb.append("hello");
    sb.append(" ");
    sb.append("jump to java");
    result = sb.toString();
    System.out.println(result);

    // insert
    sb = new StringBuffer();
    sb.append("jump to java");
    sb.insert(0, "hello ");
    System.out.println(sb.toString());

    // substring
    sb = new StringBuffer();
    sb.append("Hello jump to java");
    System.out.println(sb.substring(0, 4));
  }
}
