package Problem.ggang9.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q07 {

    /**
     * 리스트를 문자열로 만들기
     */
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        System.out.println(myList); // [Life, is, too, short] 출력됨.

        String a = "";
        for (String str : myList) {
            a += str + " ";
        }
        a = a.stripTrailing();
        System.out.println(a);
        // TODO: 리스트를 "Life is too short" 문자열로 만들어 출력해 보자.
    }
}
