package Problem.lcqff.Chapter9;

import java.util.Arrays;

public class Calculator {
    int[] nums;
    public Calculator (int[] data) {
        nums = data;
    }

    public int sum() {
        return Arrays.stream(nums).sum();
    }
    public double avg() {
        return Arrays.stream(nums).average().orElse(0);
    }
}
