package Problem.ggang9.Chapter5;

public class UpgradeCalculator {
    int value;


    UpgradeCalculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    void minus(int val) {
        this.value -= val;
    }

    int getValue() {
        return value;
    }

    public static void main(String[] args) {
        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue());
    }
}


