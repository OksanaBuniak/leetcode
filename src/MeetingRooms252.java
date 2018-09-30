import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Function;

public class MeetingRooms252 {

    private static class Interval {
        int start;
        int end;
        Interval(int a, int b) {
            start = a;
            end = b;
        }
    }

    public static boolean Solution(Interval[] input) {
        Arrays.sort(input, (a, b) -> a.start - b.start);
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i + 1].start < input[i].end) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Interval first = new Interval(1, 5);
        Interval second = new Interval(6, 10);
        Interval third = new Interval(11, 15);
        Interval forth = new Interval(1, 15);
        Interval[] input = new Interval[4];
        input[0] = first;
        input[1] = second;
        input[2] = third;
        input[3] = forth;
        System.out.println(Solution(input));
    }
}
