package algorithms;

import metrics.PerformanceTracker;

public class BoyerMooreMajorityVote {

    public static int findMajorityElement(int[] nums, PerformanceTracker tracker) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int candidate = -1;
        int count = 0;

        for (int num : nums) {
            tracker.incrementComparison();
            tracker.incrementArrayAccess();
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : nums) {
            tracker.incrementComparison();
            tracker.incrementArrayAccess();
            if (num == candidate) {
                count++;
            }
        }

        return count > nums.length / 2 ? candidate : -1;
    }
}





