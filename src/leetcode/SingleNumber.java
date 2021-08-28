package leetcode;

import java.util.HashSet;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] { 1, 3, 5, 3, 1 }));
    }

    private static int singleNumber(int[] nums) {
        System.out.println(solution1(nums));
        return optimalSolution(nums);
    }

    private static int optimalSolution(int[] nums) {
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            num ^= nums[i];
        }
        return num;
    }

    private static int solution1(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        int num = 0;
        for (int i : nums) {
            if (!numSet.remove(i)) {
                numSet.add(i);
            }
        }
        for (Integer integer : numSet) {
            num = integer.intValue();
            break;
        }
        return num;
    }
}
