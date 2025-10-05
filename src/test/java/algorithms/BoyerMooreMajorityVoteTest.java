package algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import metrics.PerformanceTracker;

public class BoyerMooreMajorityVoteTest {

    @Test
    public void testMajorityElement() {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int result = BoyerMooreMajorityVote.findMajorityElement(nums, new PerformanceTracker());
        assertEquals(4, result, "The majority element should be 4");
    }

    @Test
    public void testNoMajorityElement() {
        int[] nums = {3, 3, 4, 2, 4, 2, 2};
        int result = BoyerMooreMajorityVote.findMajorityElement(nums, new PerformanceTracker());
        assertEquals(-1, result, "There is no majority element");
    }

    @Test
    public void testSingleElement() {
        int[] nums = {1};
        int result = BoyerMooreMajorityVote.findMajorityElement(nums, new PerformanceTracker());
        assertEquals(1, result, "The majority element should be 1");
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int result = BoyerMooreMajorityVote.findMajorityElement(nums, new PerformanceTracker());
        assertEquals(-1, result, "There should be no majority element in an empty array");
    }

    @Test
    public void testAllSameElements() {
        int[] nums = {1, 1, 1, 1};
        int result = BoyerMooreMajorityVote.findMajorityElement(nums, new PerformanceTracker());
        assertEquals(1, result, "The majority element should be 1");
    }

    @Test
    public void testMajorityElementAtEnd() {
        int[] nums = {1, 1, 2, 2, 2};
        int result = BoyerMooreMajorityVote.findMajorityElement(nums, new PerformanceTracker());
        assertEquals(2, result, "The majority element should be 2");
    }

    @Test
    public void testArrayWithMultipleSameFrequencyElements() {
        int[] nums = {1, 2, 3, 4};
        int result = BoyerMooreMajorityVote.findMajorityElement(nums, new PerformanceTracker());
        assertEquals(-1, result, "There should be no majority element");
    }
}

