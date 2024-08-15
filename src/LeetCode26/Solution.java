package LeetCode26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[index]) {
                nums[++index] = nums[i];
            }
        }
        return index + 1;
    }
}
