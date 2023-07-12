package Practice.sunny.Chapter4;

import java.util.ArrayList;

public class IfPractice {

  public static void main(String[] args) {

    // IF Example
    boolean money = true;
    if (money) {
      System.out.println("택시를 타고 가라");
    } else {
      System.out.println("걸어가라");
    }

    // Comparison Operator
    int x = 3;
    int y = 2;
    System.out.println(x > y);
    System.out.println(x < y);
    System.out.println(x == y);
    System.out.println(x != y);

    // IF Example with Comparison Operator
    int money2 = 2000;
    if (money2 >= 3000) {
      System.out.println("택시를 타고 가라");
    } else {
      System.out.println("걸어가라");
    }

    // And, Or, Not
    int money3 = 2000;
    boolean hasCard = true;
    if (money3 >= 3000 || hasCard) {
      System.out.println("택시를 타고 가라");
    } else {
      System.out.println("걸어가라");
    }

    // contains
    ArrayList<String> pocket = new ArrayList<String>();
    pocket.add("paper");
    pocket.add("handphone");
    pocket.add("money");

    if (pocket.contains("money")) {
      System.out.println("택시를 타고 가라");
    } else {
      System.out.println("걸어가라");
    }

    // Else If
    boolean hascard2 = true;
    ArrayList<String> pocket2 = new ArrayList<>();
    pocket2.add("paper");
    pocket2.add("handphone");

    if (pocket2.contains("money")) {
      System.out.println("택시를 타고 가라");
    } else if (hascard2) {
      System.out.println("택시를 타고 가라");
    } else {
      System.out.println("걸어가라");
    }
  }
}
