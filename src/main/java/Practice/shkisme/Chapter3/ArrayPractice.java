package Practice.shkisme.Chapter3;

public class ArrayPractice {

  public static void main(String[] args) {
    int[] odds = {1, 3, 5, 7, 9};
    String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

    // 배열의 길이는 고정적이다.
    weeks = new String[7];
    weeks[0] = "월";
    weeks[1] = "화";
    weeks[2] = "수";
    weeks[3] = "목";
    weeks[4] = "금";
    weeks[5] = "토";
    weeks[6] = "일";

    // String[] weeks = new String[];    // 길이에 대한 숫자값이 없으므로 컴파일 오류가 발생한다.

    // 배열 값 접근
    System.out.println(weeks[3]);

    // 배열의 길이
    System.out.println(weeks.length);

    // 배열 오류 - 잘못된 인덱스 접근 오류 (ArrayIndexOutOfBoundsException)
    System.out.println(weeks[7]);  // 8번째 배열값이 없으므로 ArrayIndexOutOfBoundsException 오류가 발생한다.
  }

}
