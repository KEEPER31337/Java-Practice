package Practice.stopmin.Chapter3;

import java.util.ArrayList;
import java.util.Comparator;

public class ListPractice {

  public static void main(String[] args) {
    ArrayList pitches = new ArrayList();
    pitches.add("123");
    pitches.add("312");
    pitches.add("213");
    System.out.println(pitches);

    System.out.println("pitches.get(1) = " + pitches.get(1));
    System.out.println("pitches.size() = " + pitches.size());

    pitches.sort(Comparator.naturalOrder());
    System.out.println(pitches);
  }
}
