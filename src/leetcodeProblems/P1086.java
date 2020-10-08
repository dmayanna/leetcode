package leetcodeProblems;

import java.util.TreeMap;
import java.util.TreeSet;

public class P1086 {

    public static void main(String[] args) {

        highFive(new int[][]{{1,84},{1,72},{1,47},{1,43},{1,78},{2,79},{2,4},{2,23},{2,88},{2,79},{3,75},{3,80},{3,38},{3,73},{3,4}});

    }

    public static int[][] highFive(int[][] items) {
        TreeMap<Integer, TreeSet> tm = new TreeMap();

        for (int[] item : items) {

            if (tm.containsKey(item[0])) {
                tm.get(item[0]).add(item[1]);
            } else {
                TreeSet<Integer> treeSet = new TreeSet();
                treeSet.add(item[1]);
                tm.put(item[0], treeSet);
            }

        }
        int[][] result = new int[tm.keySet().size()][];
        int counter = 0;
        for (int k : tm.keySet()) {
            TreeSet treeSet = tm.get(k);
            Object[] objects = treeSet.toArray();

            int sum = 0;
            int avarage = 0;
            for (int i = 0; i < 5; i++) {
                sum = sum + (int) objects[(objects.length - 1) - i];
            }
            avarage = sum / 5;

            result[counter] = new int[]{k, avarage};
            counter++;
        }
        return result;
    }

}

