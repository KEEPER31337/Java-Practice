package Practice.sunny.Chapter3;

public class StringPractice {

  public static void main(String[] args) {

    // char
    char a1 = 'a';
    char a2 = 97;
    char a3 = '\u0061';

    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);

    // String
    String a = "Happy Java";
    String b = "a";
    String c = "123";
    /*
    String a = new String("Happy Java");
    String b = new String("a");
    String c = "123";
     */

    // Primitive
    boolean result = true;
    Boolean result2 = true;

    char d = 'A';
    Character d2 = 'A';

    int i = 100000;
    Integer i2 = 100000;

    // String Method
    // equals
    String e = "hello";
    String f = "java";
    String g = "hello";
    System.out.println(e.equals(f));
    System.out.println(e.equals(g));

    String h = "hello";
    String j = new String("hello");
    System.out.println(h.equals(j));  // print true
    System.out.println(h == j);       // print false

    // indexOf
    String k = "Hello Java";
    System.out.println(k.indexOf("Java")); // print 6

    // contains
    System.out.println(k.contains("Java")); // print true

    // charAt
    System.out.println(k.charAt(6)); // print J

    // replaceAll
    System.out.println(k.replaceAll("Java", "World")); // print "Hello World"

    // substring
    System.out.println(k.substring(0, 4));

    // toUpperCase
    System.out.println(k.toUpperCase());

    // split
    String l = "a:b:c:d";
    String[] result3 = a.split(":"); // result3 = {"a", "b", "c", "d"}

    // Formatting
    System.out.println(String.format("I eat %d apples.", 3));

    System.out.println(String.format("I eat %s apples.", "five"));

    int number = 3;
    System.out.println(String.format("I ate %d apples.", number));

    number = 10;
    String day = "three";
    System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));

    System.out.println(String.format("I have %s apples", 3));
    System.out.println(String.format("rate is %s", 3.234));

    System.out.println(String.format("Error is %d%%", 98));
    //System.out.println(String.format("Error is %d%", 98));

    System.out.println(String.format("%10s", "hi"));
    System.out.println(String.format("%-10sjane.", "hi"));

    System.out.println(String.format("%.4f", 3.42134234));
    System.out.println(String.format("%10.4f", 3.42134234));

    // System.out.printf
    System.out.printf("I eat %d apples.", 3);

    // StringBuffer
    // append
    StringBuffer sb = new StringBuffer();
    sb.append("hello");
    sb.append(" ");
    sb.append("jump to java");
    String result4 = sb.toString();
    System.out.println(result4);

    String result5 = "";
    result5 += "hello";
    result5 += " ";
    result5 += "jump to java";
    System.out.println(result5);

    // StringBuilder
    StringBuilder sbu = new StringBuilder();
    sbu.append("hello");
    sbu.append(" ");
    sbu.append("jump to java");
    String result6 = sbu.toString();
    System.out.println(result6);

    // insert
    StringBuffer sb1 = new StringBuffer();
    sb1.append("jump to java");
    sb1.insert(0, "hello ");
    System.out.println(sb1.toString());

    // substring
    StringBuffer sb2 = new StringBuffer();
    sb2.append("Hello jump to java");
    System.out.println(sb.substring(0, 4));

  }
}
