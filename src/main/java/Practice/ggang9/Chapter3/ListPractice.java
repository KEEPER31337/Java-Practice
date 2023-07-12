package Practice.ggang9.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;

public class ListPractice {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        pitches.add(0, "133");    // 첫번째 위치에 133 삽입.
        pitches.add(1, "133");

        System.out.println(pitches.size());
        System.out.println(pitches.remove("129"));

        ArrayList<String> pitches1 = new ArrayList<>();  // 선호되는 방식
        pitches1.add("138");
        pitches1.add("129");

        String one = pitches1.get(0);  // 형 변환이 필요없다.
        String two = pitches1.get(1);  // 형 변환이 필요없다.

        String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
        ArrayList<String> pitches2 = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches2);  // [138, 129, 142] 출력


    }
}
