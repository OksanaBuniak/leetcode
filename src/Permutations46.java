import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Permutations46 {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        generatePermutations(result, new LinkedList<>(), nums, seen);
        return result;
    }

    public static void generatePermutations(List<List<Integer>> result, LinkedList<Integer> curList, int[] nums, HashSet<Integer> seen) {
        if (curList.size() == nums.length) {
            result.add(new ArrayList<Integer>(curList));
            return;
        }

        HashSet<Integer> usedDigit = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (usedDigit.contains(nums[i])) {
                continue;
            }

            if (!seen.contains(i)) {
                usedDigit.add(nums[i]);
                seen.add(i);
                curList.add(nums[i]);
                generatePermutations(result, curList, nums, seen);
                seen.remove(i);
                curList.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 2};
        List<List<Integer>> outcome = permute(input);
        for (List<Integer> list1 : outcome) {
            for (int x : list1) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
