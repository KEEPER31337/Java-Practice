package Practice.ggang9.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;

public class FinalPractice {
    public static void main(String[] args) {
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);  // 123 출력

        String num1 = String.valueOf(n);
        String num2 = Integer.toString(n);

        final int n1 = 123;  // final 로 설정하면 값을 바꿀수 없다.
        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));





    }

}
