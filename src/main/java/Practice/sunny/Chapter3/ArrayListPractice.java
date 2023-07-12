package Practice.sunny.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListPractice {

  public static void main(String[] args) {

    // Array
    int[] odds = {1, 3, 5, 7, 9};
    String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

    // String[] weeks = new String[]; -> compile error
    String[] weeks2 = new String[7];
    weeks2[0] = "월";
    weeks2[1] = "화";
    weeks2[2] = "수";
    weeks2[3] = "목";
    weeks2[4] = "금";
    weeks2[5] = "토";
    weeks2[6] = "일";

    // indexing
    System.out.println(weeks[3]);

    // length of array
    for (int i = 0; i < weeks.length; i++) {
      System.out.println(weeks[i]);
    }

    // ArrayIndexOutOfBoundsException
    // System.out.println(weeks[7]);

    // ArrayList
    ArrayList pitches = new ArrayList();

    // add
    pitches.add("138");
    pitches.add("129");
    pitches.add("142");
    pitches.add(0, "133");
    pitches.add(2, "133");

    // get
    System.out.println(pitches.get(1));

    // size
    System.out.println(pitches.size());

    // contains
    System.out.println(pitches.contains("142"));

    // remove
    System.out.println(pitches.remove("129"));
    System.out.println(pitches.remove(0));

    // Generics
    // ArrayList<String> pitches2 = new ArraList<String>();
    ArrayList<String> pitches2 = new ArrayList<>();

    ArrayList pitches3 = new ArrayList();
    pitches3.add("138");
    pitches3.add("129");
    String one = (String) pitches3.get(0);
    String two = (String) pitches3.get(1);

    ArrayList<String> pitches4 = new ArrayList<>();
    pitches4.add("138");
    pitches4.add("129");
    String three = pitches4.get(0);
    String four = pitches4.get(1);

    // asList
    String[] data = {"138", "129", "142"};
    ArrayList<String> pitches5 = new ArrayList<>(Arrays.asList(data));
    System.out.println(pitches5);

    ArrayList<String> pitches6 = new ArrayList<>(Arrays.asList("138", "129", "142"));
    System.out.println(pitches6);

    // String.join
    String result = String.join(",", pitches6);
    System.out.println(result);

    String result2 = String.join(",", data);
    System.out.println(result2);

    // sort
    pitches6.sort(Comparator.naturalOrder());
    System.out.println(pitches6);
  }
}
