package Problem.sunny.Chapter5.Q8_9;

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

    // 답
    // 2번 : Lion 객체에는 bark가 있지만 Animal 객체에는 bark라는 함수가 존재하지 않는다
    //       따라서 사용할 수 없다
    // 5번 : Predator 인터페이스에는 hello 함수가 없기 때문에 사용할 수 없다
  }
}
