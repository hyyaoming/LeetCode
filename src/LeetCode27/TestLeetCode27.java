package LeetCode27;

public class TestLeetCode27 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 5};
        new Solution().removeElement(nums, 2);
        for (int element : nums) {
            System.out.println(element);
        }
    }
}
