import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Combinations77 {

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> curList = new LinkedList<>();
        generateCombinations(result, new LinkedList<>(), n, k, 0);
        return result;
    }

    public static void generateCombinations(List<List<Integer>> result, LinkedList<Integer> curList, int n, int k, int previous) {
        if (curList.size() == k) {
            result.add(new LinkedList<Integer>(curList));
            return;
        }
        for (int i = previous + 1; i <= n; i++) {
            curList.add(i);
            generateCombinations(result, curList, n, k, i);
            curList.removeLast();
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> outcome = combine(4, 3);
        for (List<Integer> list : outcome) {
            for (int x : list) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
