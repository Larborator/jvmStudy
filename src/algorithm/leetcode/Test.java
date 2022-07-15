package algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author labuladuo
 * @date 2022/6/16
 */
public class Test {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("731");
        str.add("730");
        str.add("7131");
        str = str.stream()
                .map(e -> String.format("%-4s", e).replace(" ", "0"))
                .map(e -> e.substring(0, 1).concat(".").concat(e.substring(1)))
                .collect(Collectors.toList());
        System.out.println(str);
    }
}
