import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class UndirectedGraphNode {
    int label;
    List<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
};

public class CloneGraph133 {

    public static UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }
        return cloneNode(node, new HashMap<>());
    }

    public static UndirectedGraphNode cloneNode(UndirectedGraphNode node, HashMap<UndirectedGraphNode, UndirectedGraphNode> originalToClone) {
        if (originalToClone.containsKey(node)) {
            return originalToClone.get(node);
        }

        UndirectedGraphNode cloned = new UndirectedGraphNode(node.label);
        originalToClone.put(node, cloned);

        for (UndirectedGraphNode originalNeighbor : node.neighbors) {
            cloned.neighbors.add(cloneNode(originalNeighbor, originalToClone));
        }
        return cloned;
    }

    public static void main(String[] args) {
        UndirectedGraphNode one = new UndirectedGraphNode(1);
        UndirectedGraphNode two = new UndirectedGraphNode(0);
        UndirectedGraphNode three = new UndirectedGraphNode(2);
        List<UndirectedGraphNode> neighbors = new LinkedList<>();
        neighbors.add(two);
        neighbors.add(three);
        one.neighbors = neighbors;
        neighbors = new LinkedList<>();
        neighbors.add(two);
        neighbors.add(one);
        two.neighbors = neighbors;
        neighbors = new LinkedList<>();
        neighbors.add(two);
        neighbors.add(one);
        neighbors.add(three);
        three.neighbors = neighbors;
        UndirectedGraphNode clone = cloneGraph(one);
        System.out.println();
    }
}
