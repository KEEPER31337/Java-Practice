package Problem.lcqff.Chapter5.Q7;

public class Q07 {

  /**
   * 하지만 이 광물 계산기는 광물이 추가될 때마다 add 메서드를 추가해야 한다는 단점이 있다.
   * 광물이 추가되더라도 MineralCalculator 클래스를 변경할 필요가 없도록 코드를 수정하시오.
   * (Mineral 인터페이스를 생성하고 광물 클래스에 적용해 보자.)
   */
  public static void main(String[] args) {
    MineralCalculator cal = new MineralCalculator();
    cal.add(new Gold());
    cal.add(new Silver());
    cal.add(new Bronze());
    System.out.println(cal.getValue());  // 270 출력
  }
}
