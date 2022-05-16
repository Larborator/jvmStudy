package algorithm.leetcode;

/**
 * https://leetcode.cn/problems/container-with-most-water/
 *
 * @author labuladuo
 * @date 2022/5/16
 */
public class Solution11 {
    public int myFunction(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while (i < j) {
            if (height[i] < height[j]) {
                max = Math.max(max, height[i] * (j - i));
                i++;
            } else {
                max = Math.max(max, height[j] * (j - i));
                j--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution11 s = new Solution11();
        System.out.println(s.myFunction(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
