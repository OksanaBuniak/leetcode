import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                myStack.push(s.charAt(i));
            } else if (myStack.size() != 0) {
                Character ch = myStack.get(myStack.size() - 1);
                if (ch == '(' && s.charAt(i) == ')') {
                    myStack.pop();
                } else if (ch == '{' && s.charAt(i) == '}') {
                    myStack.pop();
                } else if (ch == '[' && s.charAt(i) == ']') {
                    myStack.pop();
                } else {
                    return false;
                }
            }
        }
        if (myStack.size() != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "(){}[](){}(}";
        String input1 = "([)]{})(";
        String input2 = "(){[}]{)(}";
        String input3 = "([{}])";
        String input4 = "){";
        System.out.println(isValid(input));
        System.out.println(isValid(input1));
        System.out.println(isValid(input2));
        System.out.println(isValid(input3));
        System.out.println(isValid(input4));
    }
}

// SHORTER SOLUTION NICER

/*
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();

 */
