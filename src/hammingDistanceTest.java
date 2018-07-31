import org.junit.Test;

import static org.junit.Assert.*;

public class hammingDistanceTest {

    @Test
    public void test1() {
        assertEquals(2, hammingDistance.hammingDist(1, 4));
    }

    @Test
    public void test2() {
        assertEquals(6, hammingDistance.hammingDist(16, 203));
        //16   0 0 0 1 0 0 0 0
        //203  1 1 0 0 1 0 1 1
    }

    @Test
    public void test3() {
        assertEquals(1, hammingDistance.hammingDist(3, 1));
    }
}