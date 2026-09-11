package session_4_assignment.assigment_problems;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Map to store frequency of prefix sums
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        // Base case: prefix sum of 0 occurs once before considering any elements
        prefixSumCount.put(0, 1);

        int count = 0;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;

            // Check if there is an earlier prefix sum such that currentSum - prefixSum = k
            if (prefixSumCount.containsKey(currentSum - k)) {
                count += prefixSumCount.get(currentSum - k);
            }

            // Record current prefix sum in map
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {1, 1, 1};
        System.out.println(subarraySum(nums1, 2));

        // Test Case 2
        int[] nums2 = {1, -1, 0};
        System.out.println(subarraySum(nums2, 0));
    }
}
