import java.lang.reflect.Array;
import java.util.*;

public class ExclusiveTimeOfFunctions636 {

    public static int[] exclusiveTime(int n, List<String> logs) {
        int[] outcome = new int[n];
        Stack<Integer> tasks = new Stack<>();
        String[] functions = logs.get(0).split(":");
        tasks.push(Integer.parseInt(functions[0]));
        int prev = Integer.parseInt(functions[2]);

        for (int i = 1; i < logs.size(); i++) {
            functions = logs.get(i).split(":");
            int time = Integer.parseInt(functions[2]);
            if (functions[1].equals("start")) {
                if (!tasks.isEmpty()) {
                    outcome[tasks.peek()] = outcome[tasks.peek()] + time - prev;
                }
                tasks.push(Integer.parseInt(functions[0]));
                prev = time;
            } else {
                outcome[tasks.peek()] = outcome[tasks.peek()] + time - prev + 1;
                prev = time + 1;
                tasks.pop();
            }
        }

        return outcome;
    }

    public static void main(String[] args) {
        List<String> input = new LinkedList<>();
        input.addAll(Arrays.asList("0:start:0","0:end:0","1:start:1","1:end:1","2:start:2","2:end:2","2:start:3","2:end:3"));
        int[] outcome = exclusiveTime(3, input);
        for (int i : outcome) {
            System.out.println(i);
        }
    }
}
