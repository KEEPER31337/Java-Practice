package Practice.sunny.Chapter3;

import java.nio.file.FileSystemNotFoundException;

public class NumBoolPractice {

  public static void main(String[] args) {

    // Integer
    int age = 10;
    long countOfstar = 8764827384923849L;

    // Float
    float pi = 3.14F;
    double morePi = 3.14159265358979323846;
    double d1 = 123.4;
    double d2 = 1.234e2;

    // Oct, Hex
    int octal = 023; // Decimal : 19
    int hex = 0xC;   // Decimal : 12

    // Add, Subtract, Multiply, Divide
    int a = 10;
    int b = 5;
    System.out.println(a + b); // print 15
    System.out.println(a - b); // print 5
    System.out.println(a * b); // print 50
    System.out.println(a / b); // print 2
    System.out.println(7 % 3); // print 1
    System.out.println(3 % 7); // print 3

    // Increment, Decrement
    int i = 1;
    int j = 10;
    i++;
    j--;
    System.out.println(i); // print 1
    System.out.println(j); // print 9

    i = 0;
    System.out.println(i++); // print 0
    System.out.println(i);   // print 1

    i = 0;
    System.out.println(++i); // print 1
    System.out.println(i);   // print 1

    // Boolean
    boolean isSuccess = true;
    boolean isTest = false;

    // Boolean operation
    // 2 > 1           -> true
    // 1 == 2          -> false
    // 3 % 2 == 1      -> true
    // "3".equals("2") -> false

    // Conditional
    int base = 180;
    int height = 185;
    boolean isTall = height > base;

    if (isTall) {
      System.out.println("키가 큽니다."); // print 키가 큽니다.
    }

    i = 3;
    boolean isOdd = i % 2 == 1;
    System.out.println(isOdd);  // print true
  }
}
