package Practice.Chapter4;

public class ForPractice {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three"};
        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] marks = {90, 25, 67, 45, 80};
        for(int i=0; i<marks.length; i++) {
            if (marks[i] >= 60) {
                System.out.println((i+1)+"번 학생은 합격입니다.");
            }else {
                System.out.println((i+1)+"번 학생은 불합격입니다.");
            }
        }

        int[] marks1 = {90, 25, 67, 45, 80};
        for(int i=0; i<marks1.length; i++) {
            if (marks1[i] < 60) {
                continue;  // 조건문으로 돌아간다.
            }
            System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
        }

    }
}
