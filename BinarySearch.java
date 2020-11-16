package BinarySearch;

import java.util.Arrays;

public class BinarySearch {

    public static int find(int target, int ar[]) {
        int lo = 0;
        int hi = ar.length - 1;

        // {1, 2, 3, 4, 5}
        while (lo <= hi) {
            int mid = (lo + hi) / 2; // mid is the position
            int num = ar[mid]; // num is the actual # in the array at that position
            System.out.println("trying: " + num);
            if (num == target) {
                return mid;
            } else if (num < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        System.out.println("Did not find " + target);
        return -1;
    }

    public static void main(String[] args) {
        int ar[] = {1, 3, 5, 7, 38, 17, 19, 20, 32, 12};
        Arrays.sort(ar);

        int target = 1000;

        System.out.println("Found " + target + " at position " + find(target, ar));

    }
}
