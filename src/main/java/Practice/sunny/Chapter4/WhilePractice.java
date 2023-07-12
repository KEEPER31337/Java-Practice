package Practice.sunny.Chapter4;

public class WhilePractice {

  public static void main(String[] args) {

    // While
    int treeHit = 0;
    while (treeHit < 10) {
      treeHit++;
      System.out.println("나무를 " + treeHit + "번 찍었습니다.");
      if (treeHit == 10) {
        System.out.println("나무 넘어갑니다.");
      }
    }

    // Infinity Loop
    /*
    while(true){
      System.out.println("Ctrl-C를 눌러야 while문을 빠져 나갈 수 있습니다.");
    }
    */

    // Break While
    int coffee = 10;
    int money = 300;

    while (money > 0) {
      System.out.println("돈을 받았으니 커피를 줍니다.");
      coffee--;
      System.out.println("남은 커피의 양은 " + coffee + "입니다.");
      if (coffee == 0) {
        System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
        break;
      }
    }

    // Continue While
    int a = 0;
    while (a < 10) {
      a++;
      if (a % 2 == 0) {
        continue;
      }
      System.out.println(a);
    }
  }
}
