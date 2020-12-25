class Solution {
  public boolean isValid(String s) {
    Stack<Character> stk = new Stack<Character>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(' || c == '{' || c == '[') {
        stk.push(c);
      } else {
        if (stk.empty())
          return false;
        char p = stk.peek();
        if (p == '(' && c == ')' || p == '{' && c == '}' || p == '[' && c == ']') {
          stk.pop();
        } else {
          return false;
        }
      }
    }
    return stk.empty();
  }
}
