class Solution {
  public int maxArea(int[] height) {
      int max = 0;
      for (int i = 0; i < height.length; i++){
          for (int j = i+1; j < height.length; j++){
              int top = Math.min(height[i], height[j]);
              int area = top * (j-i);
              if (area > max){
                  max = area;
              }
          }
      }
      return max;
  }
}