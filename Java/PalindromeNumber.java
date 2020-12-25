class Solution {
  public boolean isPalindrome(int x) {
    String s = Integer.toString(x);
    while (s.length() > 1) {
      if (s.charAt(0) != s.charAt(s.length() - 1))
        return false;
      s = s.substring(1, s.length() - 1);
    }
    return true;
  }
}