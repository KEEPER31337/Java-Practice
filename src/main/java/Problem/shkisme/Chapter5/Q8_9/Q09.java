package Problem.shkisme.Chapter5.Q8_9;

public class Q09 {

  /**
   * 오류 찾기 2 다음의 코드를 보고 1번, 2번, 3번, 4번, 5번, 6번 문장 중에서 오류가 발생하는 문장을 모두 찾고 오류의 원인에 대해서 주석으로 설명하시오.
   */
  public static void main(String[] args) {
    Animal a = new Lion();
    Lion b = new Lion();
    Predator c = new Lion();

    //  System.out.println(a.hello());  // 1번
    //  System.out.println(a.bark());   // 2번
    //  System.out.println(b.hello());  // 3번
    //  System.out.println(b.bark());   // 4번
    //  System.out.println(c.hello());  // 5번
    //  System.out.println(c.bark());   // 6번
  }
}
