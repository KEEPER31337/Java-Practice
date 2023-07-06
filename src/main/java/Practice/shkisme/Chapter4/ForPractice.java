package Practice.shkisme.Chapter4;

public class ForPractice {

  public static void main(String[] args) {
    String[] numbers = {"one", "two", "three"};
    for(int i=0; i<numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    int[] marks = {90, 25, 67, 45, 80};
    for(int i=0; i<marks.length; i++) {
      if (marks[i] < 60) {
        continue;  // 조건문으로 돌아간다.
      }
      System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
    }

    for(int i=2; i<10; i++) {
      for(int j=1; j<10; j++) {
        System.out.print(i*j+" ");
      }
      System.out.println("");  // 줄을 바꾸어 출력하는 역할을 한다.
    }

  }

}
