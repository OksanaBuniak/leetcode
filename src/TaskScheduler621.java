import java.util.*;
import java.util.stream.Collector;

public class TaskScheduler621 {

    public static int leastInterval(char[] tasks, int n) {
        if (tasks.length == 0) {
            return 0;
        }
        int opCount = 0;

        HashMap<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            letters.put(tasks[i], letters.getOrDefault(tasks[i], 0) + 1);
        }

        PriorityQueue<Character> queue = new PriorityQueue<>((o1, o2) -> letters.get(o2) - letters.get(o1));

        queue.addAll(letters.keySet());

        List<Character> visited = new LinkedList<>();
        int idleOperations = 0;

        while (!queue.isEmpty()) {
            int i = 0;
            while (i <= n && !queue.isEmpty()) {
                char cur = queue.poll();
                visited.add(cur);
                i++;
            }
            opCount += i;
            if (i <= n) {
                opCount = opCount + (n - i + 1);
                idleOperations = (n - i + 1);
            }

            i = 0;
            while(i < visited.size()) {
                if (letters.get(visited.get(i)) - 1 != 0) {
                    letters.put(visited.get(i), letters.get(visited.get(i)) - 1);
                    queue.add(visited.get(i));
                }
                i++;
            }
            visited.clear();
        }

        return opCount - idleOperations;

    }

    public static void main(String[] args) {
        //char[] input = {'A', 'A', 'A', 'B', 'B', 'B'};
        //System.out.println(leastInterval(input, 2));
        //char[] input1 = {'A', 'A', 'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C'};
        //System.out.println(leastInterval(input1, 2));
        char[] input2 = {'A','A','A','A','A','A','B','C','D','E','F','G'};
        System.out.println(leastInterval(input2, 2));
    }
}
