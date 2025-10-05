package cli;

import algorithms.BoyerMooreMajorityVote;
import metrics.PerformanceTracker;

import java.util.Random;

public class BenchmarkRunner {

    public static void main(String[] args) {

        int[] sizes = {100, 1000, 10000, 100000};

        for (int size : sizes) {
            int[] nums = new int[size];
            Random rand = new Random();

            for (int i = 0; i < size; i++) {
                nums[i] = rand.nextInt(10);
            }

            PerformanceTracker tracker = new PerformanceTracker();
            tracker.incrementMemoryAllocation();
            long start = System.nanoTime();
            int result = BoyerMooreMajorityVote.findMajorityElement(nums, tracker);
            long end = System.nanoTime();

            System.out.println("Size: " + size + " => Majority Element: " + result);
            System.out.println("Execution Time: " + (end - start) + " ns");
            System.out.println("Comparisons: " + tracker.getComparisons());
            System.out.println("Swaps: " + tracker.getSwaps());
            System.out.println("Array Accesses: " + tracker.getArrayAccesses());
            System.out.println("Memory Allocations: " + tracker.getMemoryAllocations());
            System.out.println("-----------------------------------------");

            tracker.exportToCSV("performance_metrics.csv", size, "BoyerMooreMajorityVote");
        }
    }
}


