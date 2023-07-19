package Problem.kimminjun.Chapter7;

public class Q3 { // 스레드 적용하기

  String name;

  Q3(String name) {
    this.name = name;
  }

  public void work() {
    for (int i = 0; i < 5; i++) {
      try {
        Thread.sleep(100);  // 0.1 초 대기한다.
      } catch (Exception e) {
      }
    }
    System.out.printf("%s done.\n", this.name);
  }

  /**
   * 아래 코드의 수행 결과는 다음과 같다.
   *
   * w1 done.
   * w2 done.
   * w3 done.
   * w4 done.
   * elapsed time:2038 ms
   *
   * work 메서드에는 Thread.sleep(100)이 포함되어 있어서 총 수행시간이 0.5초정도 소요된다. 따라서 work 메서드를 4번 수행하면 대략 2초 가량이 소요된다.
   *
   * 스레드를 사용하여 work 메서드를 동시에 수행하면 시간을 단축할 수 있을 것이다. 아래 코드에 스레드를 적용하여 시간을 단축해 보자.
   *
   */

  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    for (int i = 1; i < 5; i++) {
      Q3 w = new Q3("w" + i);
      w.work();
    }
    long end = System.currentTimeMillis();
    System.out.printf("elapsed time:%s ms\n", end - start);
  }
}
