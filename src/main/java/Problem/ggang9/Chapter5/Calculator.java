package Problem.ggang9.Chapter5;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculator {
    int value;
    public Calculator() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    void isOdd(int val) {
        if (val % 2 == 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    int avg(int[] val) {
        int sum = 0;
        for (int num : val) {
            sum += num;
        }
        return sum / val.length;
    }

    int avg(ArrayList<Integer> val) {
        int sum = 0;
        for (int num : val) {
            sum += num;
        }
        return sum / val.size();
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.isOdd(3);
        cal.isOdd(4);

        int[] data = {1, 3, 5, 7, 9};
        int result = cal.avg(data);
        System.out.println(result);

        ArrayList<Integer> data1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int result1 = cal.avg(data1);
        System.out.println(result1);

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size());
    }
}
