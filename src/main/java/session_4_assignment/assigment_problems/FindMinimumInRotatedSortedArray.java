package session_4_assignment.assigment_problems;

public class FindMinimumInRotatedSortedArray {

    public static int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // The minimum must be in the right half (excluding mid)
                left = mid + 1;
            } else {
                // The minimum is at mid or in the left half
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println(findMin(nums1));

        // Test Case 2
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(nums2));

        // Test Case 3
        int[] nums3 = {11, 13, 15, 17};
        System.out.println(findMin(nums3));
    }
}
