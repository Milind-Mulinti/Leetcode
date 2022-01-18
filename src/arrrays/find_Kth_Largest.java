package arrrays;

import java.util.Arrays;

public class find_Kth_Largest {
    public static void main(String args[]) {
        int[] a = {1};
        int k = 2;
        System.out.println(findKthLargest(a, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = nums[0];

        for (int i = n - 1; i > 0; i--) {
            while (k > 0) {
                max = nums[i];
                i--;
                k--;
            }
        }
        return max;
    }
}
