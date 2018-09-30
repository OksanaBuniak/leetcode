import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets78 {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(result, new LinkedList<>(), nums, 0);
        return result;
    }

    public static void generateSubsets(List<List<Integer>> result, LinkedList<Integer> curList, int[] nums, int index) {
        if (index >= nums.length) {
            result.add(new ArrayList<Integer>(curList));
            return;
        }

        generateSubsets(result, curList, nums, index + 1);

        curList.add(nums[index]);
        generateSubsets(result, curList, nums, index + 1);
        curList.removeLast();
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        List<List<Integer>> outcome = subsets(input);
        for (List<Integer> list1 : outcome) {
            for (int x : list1) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
