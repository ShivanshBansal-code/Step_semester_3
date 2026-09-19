package session_4_assignment.class_problems;

import java.util.Arrays;

public class RotateArray {

    public static int[] rotateArray(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }

        int n = nums.length;
        k = k % n;
        if (k < 0) {
            k += n;
        }

        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            newArray[(i + k) % n] = nums[i];
        }

        // Copy back to nums
        for (int i = 0; i < n; i++) {
            nums[i] = newArray[i];
        }

        return newArray;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(rotateArray(nums1, 3)));

        // Test Case 2
        int[] nums2 = {1, 2};
        System.out.println(Arrays.toString(rotateArray(nums2, 3)));
    }
}
