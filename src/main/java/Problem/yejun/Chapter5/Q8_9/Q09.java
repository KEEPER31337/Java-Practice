package Problem.yejun.Chapter5.Q8_9;

public class Q09 {

  public static void main(String[] args) {
    Animal a = new Lion();
    Lion b = new Lion();
    Predator c = new Lion();

    System.out.println(a.hello());
    System.out.println(b.hello());
    System.out.println(b.bark());
    System.out.println(c.bark());
  }
}
