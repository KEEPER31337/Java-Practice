package Practice.redzzzi.Chapter3;

public class StringBuffer {

  public static void main(String[] args) {

    // StringBuffer의 메소드들

    // append
    java.lang.StringBuffer sb = new java.lang.StringBuffer();  // StringBuffer 객체 sb 생성
    sb.append("hello");
    sb.append(" ");
    sb.append("jump to java");
    String result = sb.toString();
    System.out.println(result);  // "hello jump to java" 출력

/*    String result = "";
    result += "hello";
    result += " ";
    result += "jump to java";
    System.out.println(result);  // "hello jump to java" 출력*/

    // insert
    java.lang.StringBuffer sb2 = new java.lang.StringBuffer();
    sb2.append("jump to java");
    sb2.insert(0, "hello ");
    System.out.println(sb2.toString());

    // substring
    java.lang.StringBuffer sb3 = new java.lang.StringBuffer();
    sb3.append("Hello jump to java");
    System.out.println(sb3.substring(0, 4));

  }

}
