package Problem.redzzzi.Chapter3;

// 주민등록번호 나누기!

public class Q03 {

  public static void main(String[] args) {
    String id = "881120-1068234";
    int front = Integer.parseInt(id.substring(0, 6));
    int back = Integer.parseInt(id.substring(7, 14));
    System.out.println(front);
    System.out.println(back);

  }

}
