import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TwoSumNoAddMemoryTest {

    @Test
    public void test1() {
        int[] input = {0, 1};
        TwoSumNoAddMemory test1 = new TwoSumNoAddMemory();
        ArrayList<Pair> output = test1.twoSumNoAddMemory(input, 1);
        ArrayList<Pair> expectedOutput = new ArrayList<>();
        expectedOutput.add(new Pair(0, 1));
        assertEquals(output, expectedOutput);
    }

    @Test
    public void test2() {
        int[] input = {0, 1, 2, 3, 1, 2};
        // 0, 1, 1, 2, 2, 3
        TwoSumNoAddMemory test1 = new TwoSumNoAddMemory();
        ArrayList<Pair> output = test1.twoSumNoAddMemory(input, 3);

        ArrayList<Pair> expectedOutput = new ArrayList<>();
        expectedOutput.addAll(Arrays.asList(new Pair(0, 3), new Pair(1, 2), new Pair(1, 2), new Pair(1, 2), new Pair(1, 2)));
        assertEquals(expectedOutput, output);
    }

    @Test
    public void test3() {
        int[] input = {-1, -5, 2, -3, 7, 0, 1, 2, 3, 4, 5, 1, -4, -3, 5, 6, 2};
        //-5, -4, -3, -3, -1, 0, 1, 1, 2, 2, 2, 3, 4, 5, 5, 6, 7
        TwoSumNoAddMemory test1 = new TwoSumNoAddMemory();
        test1.twoSumNoAddMemory(input, 3);
    }

    @Test
    public void test4() {
        int[] input = {1, 2, 1, 1, 2};
        //1, 1, 1, 2, 2
        TwoSumNoAddMemory test1 = new TwoSumNoAddMemory();
        test1.twoSumNoAddMemory(input, 3);
    }

    @Test
    public void test5() {
        int[] input = {0, 1, 2, 2, 2, 0, 0, 2};
        //2, 2, 2
        TwoSumNoAddMemory test1 = new TwoSumNoAddMemory();
        ArrayList<Pair> output = test1.twoSumNoAddMemory(input, 4);

        ArrayList<Pair> expectedOutput = new ArrayList<>();
        expectedOutput.addAll(Arrays.asList(new Pair(2, 2), new Pair(2, 2), new Pair(2, 2), new Pair(2, 2), new Pair(2, 2), new Pair(2, 2)));
        assertEquals(expectedOutput, output);
    }

    @Test
    public void test6() {
        Pair var1 = new Pair(1, 2);
        Pair var2 = new Pair(1, 2);

        System.out.println(var1.equals(var2));
    }

    @Test
    public void test7() {
        int[] input = {0, 1, 2, 3, 1};
        // 0, 1, 1, 2, 3
        TwoSumNoAddMemory test1 = new TwoSumNoAddMemory();
        ArrayList<Pair> output = test1.twoSumNoAddMemory(input, 3);

        ArrayList<Pair> expectedOutput = new ArrayList<>();
        expectedOutput.addAll(Arrays.asList(new Pair(0, 3), new Pair(1, 2), new Pair(1, 2)));
        assertEquals(expectedOutput, output);
    }

    @Test
    public void test8() {
        int[] input = {2, 2};
        //2, 2, 2
        TwoSumNoAddMemory test1 = new TwoSumNoAddMemory();
        ArrayList<Pair> output = test1.twoSumNoAddMemory(input, 4);

        ArrayList<Pair> expectedOutput = new ArrayList<>();
        expectedOutput.add(new Pair(2, 2));
        assertEquals(expectedOutput, output);
    }

}