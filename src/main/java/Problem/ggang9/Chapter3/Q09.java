package Problem.ggang9.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q09 {

    /**
     * 중복 숫자 제거하기
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력됨.

        Set<Integer> set = new HashSet<>(numbers);
        System.out.println(set);
        // TODO: numbers 리스트에서 중복 숫자를 제거해 보자.
    }
}

