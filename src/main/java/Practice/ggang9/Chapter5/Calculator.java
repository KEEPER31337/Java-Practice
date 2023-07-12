package Practice.ggang9.Chapter5;

public class Calculator {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }

    static int mul(int num) {
        result *= num;
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();

        System.out.println(calculator1);
        System.out.println(calculator2);
    }

}
