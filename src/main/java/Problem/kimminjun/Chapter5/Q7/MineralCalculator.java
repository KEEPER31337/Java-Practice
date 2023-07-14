package Problem.kimminjun.Chapter5.Q7;

class MineralCalculator {

  int value = 0;

  public void add(Mineral mineralType) {
    this.value += mineralType.getValue();
  }

  public int getValue() {
    return this.value;
  }
}
