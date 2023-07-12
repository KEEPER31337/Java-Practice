package Practice.redzzzi.Chapter4;

import java.util.ArrayList;

public class If {

  public static void main(String[] args) {
    // 조건 판단 연산자
    int money = 2000;
    boolean hasCard = true;

    if (money >= 3000 || hasCard) {
      System.out.println("택시를 타고 가라");
    } else {
      System.out.println("걸어가라");
    }

    // contains
    ArrayList<String> brain = new ArrayList<>();
    brain.add("worry");
    brain.add("love");
    brain.add("future");
    brain.add("study");

    if (brain.contains("study")) {
      System.out.println("Go to the library!");
    } else {
      System.out.println("Turn on the Youtube");
    }

    // else if
    // 카드 있는 상태.
    ArrayList<String> pocket = new ArrayList<String>();
    pocket.add("paper");
    pocket.add("handphone");

    if (pocket.contains("money")) {
      System.out.println("택시를 타고 가라");
    } else if (hasCard) {
      System.out.println("택시를 타고 가라");
    } else {
      System.out.println("걸어가라");
    }

  }

}
