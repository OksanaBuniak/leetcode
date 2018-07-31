import org.junit.Test;

import static org.junit.Assert.*;

public class HouseRobberTest {

    @Test
    public void test1() {
        int[] input = {9, 20, 47, 0, 5, 90, 100, 3, 2, 200};
        assertEquals(361, HouseRobber.rob(input));
    }

    @Test
    public void test2() {
        int[] input = {0, 0};
        assertEquals(0, HouseRobber.rob(input));
    }

    @Test
    public void test3() {
        int[] input = {1, 3, 1};
        assertEquals(3, HouseRobber.rob(input));
    }

    @Test
    public void test4() {
        int[] input = {1, 1, 1};
        assertEquals(2, HouseRobber.rob(input));
    }

    @Test
    public void test5() {
        int[] input = {1, 2};
        assertEquals(2, HouseRobber.rob(input));
    }

    @Test
    public void test6() {
        int[] input = {2, 3, 2};
        assertEquals(4, HouseRobber.rob(input));
    }

}