import org.junit.Test;

import static org.junit.Assert.*;

public class twoSumTest {

    @Test
    public void test1() {
        int target = 9;
        int[] input = {2, 7, 9, 10};
        int[] output = {0, 1};
        assertArrayEquals(output, twoSum.twoSum(input, target));
    }

    @Test
    public void test2() {
        int target = 17;
        int[] input = {2, 7, 9, 10};
        int[] output = {1, 3};
        assertArrayEquals(output, twoSum.twoSum(input, target));
    }

    @Test
    public void test3() {
        int target = 19;
        int[] input = {2, 7, 9, 10, 7, 6, 5};
        int[] output = {2, 3};
        assertArrayEquals(output, twoSum.twoSum(input, target));
    }

    @Test
    public void test4() {
        int target = -8;
        int[] input = {-1, -2, -3, -4, -5};
        int[] output = {2, 4};
        assertArrayEquals(output, twoSum.twoSum(input, target));
    }

    @Test
    public void test5() {
        int target = 0;
        int[] input = {-1, -2, -3, 2, -5};
        int[] output = {1, 3};
        assertArrayEquals(output, twoSum.twoSum(input, target));
    }

}