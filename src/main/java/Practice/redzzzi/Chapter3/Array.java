package Practice.redzzzi.Chapter3;

public class Array {

  public static void main(String[] args) {

    // 요일의 집합 예제 - 초기값 없는 배열의 경우 길이에 대한 명시 필요
    String[] weeks = new String[7];
    weeks[0] = "월";
    weeks[1] = "화";
    weeks[2] = "수";
    weeks[3] = "목";
    weeks[4] = "금";
    weeks[5] = "토";
    weeks[6] = "일";

    // 인덱스를 통한 배열 값 접근
    String[] weeks2 = {"월", "화", "수", "목", "금", "토", "일"};
    System.out.println(weeks2[3]);

    // for문과 함께 자주 쓰이는 배열
    String[] weeks3 = {"월", "화", "수", "목", "금", "토", "일"};
    for (int i = 0; i < weeks3.length; i++) {
      System.out.println(weeks3[i]);
    }

  }

}
