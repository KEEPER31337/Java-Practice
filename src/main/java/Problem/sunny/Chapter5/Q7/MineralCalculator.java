package Problem.sunny.Chapter5.Q7;

class MineralCalculator {

  int value = 0;

  public void add(Mineral mineral) {
    this.value += mineral.mineralValue();
  }

  public int getValue() {
    return this.value;
  }
}
