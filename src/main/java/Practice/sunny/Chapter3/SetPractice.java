package Practice.sunny.Chapter3;

import java.util.Arrays;
import java.util.HashSet;

public class SetPractice {

  public static void main(String[] args) {

    // HashSet
    HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
    System.out.println(set);

    HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

    // Intersection
    HashSet<Integer> intersection = new HashSet<>(s1);
    intersection.retainAll(s2);
    System.out.println(intersection);

    // Union
    HashSet<Integer> union = new HashSet<>(s1);
    union.addAll(s2);
    System.out.println(union);

    // Relative Complement
    HashSet<Integer> subtract = new HashSet<>(s1);
    subtract.removeAll(s2);
    System.out.println(subtract);

    // Add
    HashSet<String> set2 = new HashSet<>();
    set2.add("Jump");
    set2.add("to");
    set2.add("Java");
    System.out.println(set2);

    // AddAll
    HashSet<String> set3 = new HashSet<>();
    set3.add("Jump");
    set3.addAll(Arrays.asList("To", "Java"));
    System.out.println(set3);

    // Remove
    HashSet<String> set4 = new HashSet<>();
    set4.remove("To");
    System.out.println(set4);

  }
}
