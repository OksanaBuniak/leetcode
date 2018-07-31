public class Pair {
    int firstIndex;
    int secondIndex;

    public Pair(int a, int b) {
        firstIndex = a;
        secondIndex = b;
    }

    @Override
    public boolean equals(Object other) {
        Pair obj2 = (Pair) other;
        return firstIndex == obj2.firstIndex && secondIndex == obj2.secondIndex;
    }

    public int hashCode() {
        return firstIndex * 27 + secondIndex;
    }

    @Override
    public String toString() {
        return '<' + Integer.toString(firstIndex) + " : " + Integer.toString(secondIndex) + '>';
    }

}
