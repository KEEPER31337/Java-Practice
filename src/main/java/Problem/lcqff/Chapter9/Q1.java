package Problem.lcqff.Chapter9;

import static org.mockito.internal.util.StringUtil.join;

public class Q1 { // 문자열 바꾸기

  public static void main(String[] args) {
    String str = "a:b:c:d";

    // TODO: 문자열의 split와 join 메서드를 사용하여 위 문자열을 다음과 같이 고치시오.
    // a#b#c#d
    String res = String.join("#",str.split(":"));
    System.out.println(res);

  }

}
