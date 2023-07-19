package Practice.ggang9.Chapter4;

public class WhilePractice {
    public static void main(String[] args) {
        int treeHit = 0;
        while (treeHit < 10) {
            treeHit++;
            System.out.println("나무를  " + treeHit + "번 찍었습니다.");
            if (treeHit == 10) {
                System.out.println("나무 넘어갑니다.");
            }
        }

//        while (true) {
//            System.out.println("Ctrl-C를 눌러야 while문을 빠져 나갈 수 있습니다.");
//        }

        int a2 = 0;
        while (a2 < 10) {
            a2++;
            if (a2 % 2 == 0) {
                continue;  // 짝수인 경우 조건문으로 돌아간다.
            }
            System.out.println(a2);  // 홀수만 출력된다.
        }


    }
}
