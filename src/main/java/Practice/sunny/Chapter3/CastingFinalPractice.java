package Practice.sunny.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CastingFinalPractice {

  public static void main(String[] args) {

    // String to Integer
    String num1 = "123";
    int n1 = Integer.parseInt(num1);
    System.out.println(n1);

    // Integer to String
    int n2 = 123;
    String num2 = "" + n2;
    System.out.println(num2);

    int n3 = 123;
    String num3 = String.valueOf(n3);
    String num4 = Integer.toString(n3);
    System.out.println(num3);
    System.out.println(num4);

    // String to Float
    String num5 = "123.456";
    double d = Double.parseDouble(num5);
    System.out.println(d);

    // Integer to Float
    int n4 = 123;
    double d1 = n4;
    System.out.println(d1);

    // Float to Integer
    double d2 = 123.456;
    int n5 = (int) d2;
    System.out.println(n5);

    // NumberFormatException Error
    /*
    String num = "123.456;
    int n = Integer.parseInt(num);
     */

    // Final
    final int n6 = 123;
    // n6 = 456;  -> Compile Error

    // Final List
    final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
    // a = new ArrayList<>(Arrays.asList("c", "d")); -> Compile Error

    // List.of
    final List<String> b = List.of("a", "b");
    a.add("c");
  }
}
