public class MergeTwoSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = n + m - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] input1 = new int[7];
        input1[0] = -5;
        input1[1] = 0;
        input1[2] = 1;
        input1[3] = 2;
        int[] input2 = {0, 2, 4};
        merge(input1, 4, input2, 3);
    }
}
