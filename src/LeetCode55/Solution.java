package LeetCode55;

public class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int rightmost = 0;
        for (int i = 0; i < len; i++) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
                if (rightmost >= len - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
