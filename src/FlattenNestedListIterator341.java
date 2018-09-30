import java.util.*;

public class FlattenNestedListIterator341 {

    public static class NestedInteger {
        int val;
        List<NestedInteger> list;

        NestedInteger(int x) {
            val = x;
        }

        NestedInteger(List<NestedInteger> x) {
            list = x;
        }

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        boolean isInteger() {
            return list == null;
        }

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        Integer getInteger() {
            return val;
        }

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        List<NestedInteger> getList() {
            return list;
        }
    }

    public static class NestedIterator implements Iterator<Integer> {

        private Stack<List<NestedInteger>> stackOfLists = new Stack<>();
        private Stack<Integer> stackOfIndexes = new Stack<>();
        private int curIndex;
        private List<NestedInteger> curList;

        public NestedIterator(List<NestedInteger> nestedList) {
            curList = nestedList;
            curIndex = 0;
        }

        @Override
        public Integer next() {
            curIndex++;
            return curList.get(curIndex - 1).getInteger();
        }

        @Override
        public boolean hasNext() {
            while (curIndex >= curList.size() || !curList.get(curIndex).isInteger()) {
                if (curIndex >= curList.size()) {
                    if (stackOfLists.isEmpty()) {
                        return false;
                    }
                    curList = stackOfLists.pop();
                    curIndex = stackOfIndexes.pop();
                } else {
                    stackOfIndexes.push(curIndex + 1);
                    stackOfLists.push(curList);

                    curList = curList.get(curIndex).getList();
                    curIndex = 0;
                }
            }
           return true;
        }
    }

    public static void main(String[] args) {
        List<NestedInteger> nestedList = new ArrayList<>();
        nestedList.add(new NestedInteger(1));
        List<NestedInteger> first = new ArrayList<>();
        first.add(new NestedInteger(2));
        first.add(new NestedInteger(3));
        nestedList.add(new NestedInteger(first));
        nestedList.add(new NestedInteger(new ArrayList<>()));
        nestedList.add(new NestedInteger(new ArrayList<>()));

        NestedIterator i = new NestedIterator(nestedList);
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}
