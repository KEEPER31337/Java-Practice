package Save.Chapter5.Q7;

class MineralCalculator {

  int value = 0;

  public void add(Gold gold) {
    this.value += 100;
  }

  public void add(Silver silver) {
    this.value += 90;
  }

  public void add(Bronze bronze) {
    this.value += 80;
  }

  public int getValue() {
    return this.value;
  }
}
