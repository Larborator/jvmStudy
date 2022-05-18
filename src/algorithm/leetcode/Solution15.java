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
        return resList;
    }

    public static void main(String[] args) {
        Solution15 s = new Solution15();
        System.out.println(s.myFunction(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
