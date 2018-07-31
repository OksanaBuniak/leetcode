import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses22 {

    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        backTracking(result, n, "", 0, 0);
        return result;
    }

    public void backTracking(List<String> result, int n, String s, int open, int close) {
        if (s.length() == n * 2) {
            result.add(s);
            return;
        }

        if (open < n) {
            backTracking(result, n, s + '(', open + 1, close);
        }
        if (close < open) {
            backTracking(result, n, s + ')', open, close + 1);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses22 gp = new GenerateParentheses22();
        List<String> output = gp.generateParenthesis(3);
        for (String s : output) {
            System.out.println(s);
        }
    }
}

// ( ( ( ) ) )    ( (
// ( ( ) ( ) )
// ( ( ) ) ( )
// ( ) ( ( ) )
// ( ) ( ) ( )
