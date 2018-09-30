import java.util.*;

public class MergeIntervals {

    public static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public static List<Interval> merge(List<Interval> intervals) {

        if (intervals.size() == 0) {
            return new ArrayList<Interval>();
        }
        if (intervals.size() == 1) {
            return intervals;
        }

/*        List<Interval> output = new ArrayList<>();
        Interval element = new Interval();
        int size = intervals.size();

        int[] start = new int[size];
        int[] end = new int[size];

        for (int i = 0; i < size; i++) {
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        element.start = start[0];
        element.end = end[0];

        for (int i = 1; i < size; i++) {
            if (start[i] <= element.end) {
                element.end = end[i];
            } else {
                output.add(element);
                element = new Interval();
                element.start = start[i];
                element.end = end[i];
            }
        }
        output.add(element);

        return output; */

        Collections.sort(intervals, (a, b) -> a.start - b.start);
        LinkedList<Interval> result = new LinkedList<>();
        result.add(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start <= result.getLast().end) {
                result.getLast().end = Math.max(result.getLast().end, intervals.get(i).end);
            } else {
                result.add(intervals.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //[1,3],[2,6],[8,10],[15,18]
        List<Interval> input = new ArrayList<>();
        Interval a = new Interval(1, 3);
        input.add(a);
        a = new Interval(2, 6);
        input.add(a);
        a = new Interval(6, 10);
        input.add(a);
        a = new Interval(15, 18);
        input.add(a);

        List<Interval> input2 = new ArrayList<>();
        Interval b = new Interval(1, 4);
        input2.add(b);
        b = new Interval(1, 4);
        input2.add(b);

        List<Interval> output = merge(input);

        for (Interval el : output) {
            System.out.print(el.start + " " + el.end + " ");
            System.out.println();
        }
    }

}
