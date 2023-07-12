package Problem.ggang9.Chapter5;

interface Mineral {
    public int getValue();
}

class Bronze implements Mineral{

    @Override
    public int getValue() {
        return 80;
    }
}

class Silver implements Mineral{

    @Override
    public int getValue() {
        return 90;
    }
}

class Gold implements Mineral{

    @Override
    public int getValue() {
        return 100;
    }
}

public class MineralCalculator {
    int value = 0;

    public void add(Mineral mineral) {
        value += mineral.getValue();
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        MineralCalculator mineralCalculator = new MineralCalculator();
        mineralCalculator.add(new Bronze());
        mineralCalculator.add(new Silver());
        mineralCalculator.add(new Gold());
        System.out.println(mineralCalculator.getValue());
    }
}
