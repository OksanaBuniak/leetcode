import java.util.HashMap;

public class twoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int[] res = new int[2];

        int i = 0;
        while (i < nums.length) {
            int req = target - nums[i];
            if (hmap.containsKey(req)) {
                res[0] = hmap.get(req);
                res[1] = i;
                return res;
            }

            if (!hmap.containsKey(req)) {
                hmap.put(nums[i], i);
            }
            i++;
        }
        return null;
    }

    public static void main(String[] args) {

    }

}




/*      int ind1;
        int[] array = new int[2];

        for (int i = 0; i < nums.length; i++) {
        int j = i;
        ind1 = j;

        while (j < nums.length - 1) {
            if (nums[ind1] + nums[j + 1] != target) j++;
            else {
                array[0] = ind1;
                array[1] = j + 1;
                return array;
                }
            }
        }
        return array;  */