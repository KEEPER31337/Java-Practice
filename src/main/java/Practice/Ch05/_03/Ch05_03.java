package Practice.Ch05._03;

public class Ch05_03 {

  int a;

  int sum(int a, int b) {
    return a + b;
  }

  String say() {
    return "Hi";
  }

  void print_sum(int a, int b) {
    System.out.println("a + b = " + (a + b));
  }

  void print_hi() {
    System.out.println("hi");
  }

  void sayNick(String nick) {
    if ("fool".equals(nick)) {
      return;
    }
    System.out.println("my nickname :" + nick);
  }

  void varTest(Ch05_03 sample) {
    sample.a++;
  }

  void varTest1() {
    this.a++;
  }

  public static void main(String[] args) {
    int a = 3;
    int b = 4;

    Ch05_03 sample = new Ch05_03();
    int c = sample.sum(a, b);

    System.out.println(c);
    System.out.println(sample.say());
    sample.print_sum(5, 10);
    sample.print_hi();
    sample.sayNick("evil");
    sample.sayNick("fool");

    sample.a = 1;
    sample.varTest(sample);
    System.out.println(sample.a);

    sample.varTest1();
    System.out.println(sample.a);
  }
}
