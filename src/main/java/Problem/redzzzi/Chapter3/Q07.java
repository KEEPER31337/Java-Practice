package Problem.redzzzi.Chapter3;

// 리스트를 문자열로 만들기!

import java.util.ArrayList;
import java.util.Arrays;

public class Q07 {

  public static void main(String[] args) {
    ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
    System.out.println(myList);
    System.out.println("\n리스트를 문자열로!");
    System.out.println(String.join(" ", myList));
  }
}
