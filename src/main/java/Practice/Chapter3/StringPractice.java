package Practice.Chapter3;

public class StringPractice {

    public static void main(String[] args) {

//    String a = "Happy Java";
        String b = "a";
        String c = "123";

        boolean result = true;
        char a = 'A';
        int i = 100000;

        String a1 = "hello";
        String b1 = "java";
        String c1 = "hello";
        System.out.println(a1.equals(b1)); // false 출력
        System.out.println(a1.equals(c1)); // true 출력

        String a2 = "hello";
        String b2 = new String("hello");
        System.out.println(a2.equals(b2));  // true
        System.out.println(a2 == b2);  // false

        String a3 = "Hello Java";
        System.out.println(a3.indexOf("Java"));  // 6 출력

        String a4 = "Hello Java";
        System.out.println(a4.charAt(6));  // "J" 출력

        String a5 = "Hello Java";
        System.out.println(a5.replaceAll("Java", "World"));  // Hello World 출력

        String a6 = "a:b:c:d";
        String[] result1 = a6.split(":");  // result는 {"a", "b", "c", "d"}


    }


}
