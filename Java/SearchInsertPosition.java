class Solution {
  public int searchInsert(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target)
        return i;
    }
    int[] nums2 = new int[nums.length + 1];
    for (int i = 0; i < nums.length; i++) {
      nums2[i] = nums[i];
    }
    nums2[nums.length] = target;
    Arrays.sort(nums2);
    for (int i = 0; i < nums2.length; i++) {
      if (nums2[i] == target)
        return i;
    }
    return 0;
  }
}