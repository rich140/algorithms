class Solution {
  public int reverse(int x) {
    String rev = new StringBuilder().append(Math.abs(x)).reverse().toString();
    try {
      return (x < 0) ? -1 * Integer.parseInt(rev) : Integer.parseInt(rev);
    } catch (NumberFormatException e) {
      return 0;
    }
  }
}