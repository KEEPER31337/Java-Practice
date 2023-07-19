package Practice.redzzzi.Chapter3;

public class StringFormatting {

  public static void main(String[] args) {

    System.out.println(String.format("I love you %d", 3000)); // %d 자리에 3000이 들어감 digit

    System.out.println(String.format("I %s you 3000", "love")); // %s 자리에 love가 들어감 string

    int number = 3000;
    System.out.println(String.format("I love you %d", number));

    int number2 = 3000;
    String heart = "love";
    System.out.println(String.format("I %s you %d", heart, number));

    System.out.println(String.format("I love you %d%%", 100));

    System.out.println(String.format("%10s", "hi")); // "        hi" 출력

    System.out.println(String.format("%-10sthere.", "hi"));  // "hi        there." 출력

    System.out.println(String.format("%5.2f", 3.111111));  // " 3.11" 출력

    // System.out.printf
    System.out.printf("I love you %d", 3000);


  }


}
