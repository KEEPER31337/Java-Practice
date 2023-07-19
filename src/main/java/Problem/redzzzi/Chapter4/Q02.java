package Problem.redzzzi.Chapter4;

// while문을 사용해 1부터 1000까지의 자연수 중 3의 배수의 합을 구해보자!
public class Q02 {

  public static void main(String[] args) {
    int fin = 0;
    int a = 1;
    while (a <= 1000) {
      if (a % 3 == 0) {
        fin += a;
      }
      a++;

    }
    System.out.println(fin);
  }

}
