package arrrays;

import java.util.Arrays;

class third_max {
    public static void main(String args[]) {
        int[] a = {1, 3, 2};
        System.out.println(thirdMax(a));
    }

    static int thirdMax(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        int idx = n - 1, i, distinctCount = 0;
        while (idx >= 0) {
            distinctCount++;
            i = idx - 1;
            //to check all the values with same value as a[idx]
            while (i >= 0 && a[i] == a[idx])
                i--;
            //no third distinct element
            if (i == -1)
                return a[n - 1];
            idx = i;
            //found 2 bigger elements before?
            if (distinctCount == 2)
                return a[idx];
        }
        return -1;
    }
}
