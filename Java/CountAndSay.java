class Solution {
  public String countAndSay(int n) {
    if (n == 1)
      return "1";
    String s = countAndSay(n - 1);
    String res = "";
    int index = 0;
    int m = 0;
    for (int i = 0; i <= s.length(); i++) {
      char c = s.charAt(index);
      if (i == s.length() || s.charAt(i) != s.charAt(index)) {
        res += Integer.toString(m) + s.charAt(index);
        index = i;
        m = 0;
      }
      m++;
    }
    return res;
  }
}