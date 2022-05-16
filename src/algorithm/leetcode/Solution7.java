package algorithm.leetcode;

/**
 * https://leetcode.cn/problems/reverse-integer/
 *
 * @author labuladuo
 * @date 2022/5/12
 */
public class Solution7 {
    /**
     * 看解法思路后写的优化算法
     *
     * @param x x
     * @return res
     */
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            if (res < Integer.MIN_VALUE / 10 || res > Integer.MAX_VALUE / 10) {
                return 0;
            }
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return res;
    }

    /**
     * 自己撸的垃圾代码
     *
     * @param x x
     * @return res
     */
    public int myFunction(int x) {
        String str = String.valueOf(x);
        if (str.startsWith("-")) {
            str = str.replace("-", "");
        }
        char[] chs = str.toCharArray();
        for (int i = 0; i < chs.length / 2; i++) {
            char temp = chs[i];
            chs[i] = chs[chs.length - i - 1];
            chs[chs.length - i - 1] = temp;
        }
        try {
            int res = Integer.parseInt(String.valueOf(chs));
            return x > 0 ? res : -res;
        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution7 s = new Solution7();
        System.out.println(s.reverse(1534236469));
    }
}
