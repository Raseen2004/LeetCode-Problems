class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty())
                    return false;
                else if (ch == ')' && stack.peek() != '(')
                    return false;
                else if (ch == '}' && stack.peek() != '{')
                    return false;
                else if (ch == ']' && stack.peek() != '[')
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty() ? true : false;
    }
}