package leetcodeProblems;

import java.util.HashMap;

public class P1 {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap();
        Integer num2 = 0;
        int[] output = new int[2];

        for (int i = 0; i < nums.length; i++) {
            num2 = target - nums[i];
            if (map.containsKey(num2)) {
                output[0] = i;
                output[1] = map.get(num2);
                return output;

            } else {
                map.put(nums[i], i);

            }

        }

        return output;

    }
}
