package Practice.shkisme.Chapter4;

import com.sun.tools.javac.Main;
import java.util.ArrayList;

public class IfPractice {

  public static void main(String[] args) {
    boolean money = true;
    if (money) {
      System.out.println("택시를 타고 가라");
    } else {
      System.out.println("걸어가라");
    }

    ArrayList<String> pocket = new ArrayList<String>();
    pocket.add("paper");
    pocket.add("handphone");
    pocket.add("money");

    if (pocket.contains("money")) {
      System.out.println("택시를 타고 가라");
    } else {
      System.out.println("걸어가라");
    }
  }

}
