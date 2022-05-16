package algorithm.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * https://leetcode.cn/problems/palindrome-number/
 *
 * @author labuladuo
 * @date 2022/5/13
 */
public class Solution9 {
    public boolean myFunction(int x) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        if (x < 0) {
            return false;
        }
        while (x != 0) {
            stack.push(x % 10);
            queue.add(x % 10);
            x = x / 10;
        }
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution9 s = new Solution9();
        System.out.println(s.myFunction(-12));
    }
}
