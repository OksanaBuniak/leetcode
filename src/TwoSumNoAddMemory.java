import java.util.*;

public class TwoSumNoAddMemory {

    int res;

    public ArrayList<Pair> twoSumNoAddMemory(int[] nums, int target) {
        Arrays.sort(nums);
        res = nums.length;
        ArrayList<Pair> output = new ArrayList<>();

        for (int i = 0; i < res - 1; i++) {
            int needed = target - nums[i];
            int rightIndex = binarySearch(nums, needed, i+1, res - 1);
            if (rightIndex != -1) {
                Pair pair = new Pair(nums[i], nums[rightIndex]);
                output.add(pair);

                if (nums[i] == nums[rightIndex]) {
                    addDuplicates(rightIndex - i + 1, output, pair);
                    return output;
                }

                int leftCount = 1;
                while ((i < nums.length - 1) && (nums[i] == nums[i + 1])) {
                    leftCount++;
                    i++;
                }
                int rightCount = 1;
                while ((rightIndex < nums.length) && (nums[rightIndex] == nums[rightIndex - 1])) {
                    rightCount++;
                    rightIndex--;
                }

                if (leftCount > 1 || rightCount > 1) {
                    for (int j = 0; j < leftCount * rightCount - 1; j++) {
                        output.add(pair);
                    }
                }

                res = rightIndex;
            }
        }
        return output;
    }

    public int binarySearch(int[] arr, int element, int start, int end) {
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == element) {
                while ((mid < end) && (arr[mid + 1] == element)) {
                    mid++;
                }
                return mid;
            }
            if (arr[mid] < element) {
                start = mid + 1;
            }
            if (arr[mid] > element) {
                end = mid - 1;
            }
        }
        return -1;
    }

    private void addDuplicates(int count, ArrayList<Pair> output, Pair pair) {
        int numberofPairs = 0;
        //for (int j = 0; j < count; j++) {
          //  numberofPairs = numberofPairs + j;
        //}
        numberofPairs = (count - 1) * count / 2;
        for (int j = 1; j < numberofPairs; j++) {
            output.add(pair);
        }
    }

    public static void main(String[] args) {

    }

}

/*    public int binarySearch(int[] arr, int element, int start, int end) {
        if (end >= start) {
            int mid = (end - start) / 2 + start;
            if (arr[mid] == element) {
                while ((mid < end) && (arr[mid + 1] == element)) {
                    mid++;
                }
                return mid;
            }
            if (arr[mid] < element) {
                return binarySearch(arr, element, mid + 1, end);
            } else {
                return binarySearch(arr, element, start, mid - 1);
            }
        } else {
            return -1;
        }
    }

    System.out.println("found element " + pair.firstIndex + " " + pair.secondIndex);

    int index = i;
    while ((index < nums.length - 1) && (nums[index] == nums[index + 1])) {
                    pair = new Pair(nums[index + 1], nums[rightIndex]);
                    output.add(pair);
                    System.out.println("from first loop " + pair.firstIndex + " " + pair.secondIndex);
                    index++;
                }

    int index = rightIndex; something like this
    while ((index < nums.length) && (nums[index] == nums[index - 1])) {
                    pair = new Pair(nums[i], nums[index]);
                    output.add(pair);
                    System.out.println("from second loop " + pair.firstIndex + " " + pair.secondIndex);
                    index--;
                }


    */




// binary search with while
// return list of objects x, y
// 1, 1, 1, 2, 2  ask whether I can use element once or more -- 6 pairs if asked for unique
