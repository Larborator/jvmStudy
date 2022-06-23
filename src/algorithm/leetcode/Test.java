package algorithm.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author labuladuo
 * @date 2022/6/16
 */
public class Test {
    public static void main(String[] args) {
        String str = "DLI, HIVE_C4, HW_MRS, ODPS";
        HashMap<String, Integer> clusterOrderMap = new HashMap<String, Integer>(8) {{
            put("ODPS", 0);
            put("HW_MRS", 1);
            put("HIVE_C4", 2);
            put("DLI", 3);
        }};
        List<String> strs = Arrays.stream(str.split(",")).sorted(Comparator.comparing(e -> clusterOrderMap.getOrDefault(e.trim(), clusterOrderMap.size()))).collect(Collectors.toList());
        String res = strs.toString().replace(" ", "");
        System.out.println(res);
    }
}
