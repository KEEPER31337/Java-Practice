package Problem.redzzzi.Chapter4;

// 별 표시하기 !
public class Q03 {

  public static void main(String[] args) {
    int star = 0;
    while (star <= 4) {
      star++;
      for (int play = 1; play <= star; play++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

}
