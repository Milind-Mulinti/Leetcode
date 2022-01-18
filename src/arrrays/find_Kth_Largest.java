package arrrays;

import java.util.Arrays;

public class find_Kth_Largest {
    public static void main(String args[]) {
        int[] a = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(a, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int m = n;
        Arrays.sort(nums);
        for (int i = n - 1; i > 0; i--) {
            while (k > 0) {

                m = nums[i];
                k--;
                i--;

            }
        }
        return m;
    }
}
