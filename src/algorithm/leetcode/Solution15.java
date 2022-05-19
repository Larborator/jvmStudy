package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.cn/problems/3sum/
 *
 * @author labuladuo
 * @date 2022/5/16
 */
public class Solution15 {
    public List<List<Integer>> myFunction(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int l = nums.length - 1;
        if (l < 2) {
            return resList;
        }
        for (int i = 0; i < l - 1; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int target = -nums[i];
            int j = i + 1;
            int k = l;
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    resList.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return resList;
    }

    public static void main(String[] args) {
        Solution15 s = new Solution15();
        System.out.println(s.myFunction(new int[]{-2, 0, 1, 1, 2}));
    }
}
