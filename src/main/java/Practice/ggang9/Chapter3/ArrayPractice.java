package Practice.ggang9.Chapter3;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] odds = {1, 3, 5, 7, 9};
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

        weeks = new String[7];
        weeks[0] = "월";
        weeks[1] = "화";
        weeks[2] = "수";
        weeks[3] = "목";
        weeks[4] = "금";
        weeks[5] = "토";
        weeks[6] = "일";

        System.out.println(weeks[3]);

    }
}
