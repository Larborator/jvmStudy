package algorithm.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/longest-common-prefix/
 *
 * @author labuladuo
 * @date 2022/5/16
 */
public class Solution14 {
    public String myFunction(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int len = strs.length == 0 ? 0 : Arrays.stream(strs).map(String::length).min(Integer::compareTo).get();
        for (int i = 0; i < len; i++) {
            boolean flag = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sb.append(strs[0].charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution14 s = new Solution14();
        System.out.println(s.myFunction(new String[]{"cir","car"}));
    }
}
