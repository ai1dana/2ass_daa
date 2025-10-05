# Boyer-Moore Majority Vote Algorithm

## Overview

The **Boyer-Moore Majority Vote** algorithm is a linear-time algorithm used to find the majority element in an array. A majority element is defined as the element that appears more than half of the times in the array. The algorithm efficiently solves the majority element problem in O(n) time complexity and uses O(1) space.

## Algorithm Workflow

### Phase 1: Candidate Selection
The algorithm iterates through the array once, selecting a potential candidate for the majority element.

### Phase 2: Validation
The algorithm iterates over the array again to count the occurrences of the candidate element. If the count is greater than half the size of the array, the candidate is the majority element. Otherwise, it returns -1.

## Time Complexity

- **Best Case**: Θ(n) — The algorithm makes two linear passes over the array, so the time complexity is linear.
- **Worst Case**: O(n) — Even in the worst case, the algorithm still performs two linear passes.
- **Average Case**: O(n) — The algorithm’s time complexity remains linear regardless of the input structure.

## Graph
<img width="1286" height="774" alt="image" src="https://github.com/user-attachments/assets/e8f6ea77-3b2a-4a9e-b98c-bdb86dccce0a" />


## Space Complexity

The algorithm uses O(1) additional space as it only needs a few variables to track the current candidate and count.

## Edge Cases Handled

The algorithm handles the following edge cases:
- **Empty Array**: If the input array is empty, the algorithm returns -1.
- **Single Element Array**: If the array contains only one element, it is automatically the majority element.
- **Array with No Majority Element**: If no element appears more than half the times, the algorithm returns -1.
- **Array with All Identical Elements**: If all elements in the array are the same, that element is the majority element.
- **Majority Element at the End**: If the majority element appears at the end of the array, the algorithm will correctly identify it.

## Performance Benchmarking

Performance benchmarking was conducted using **JMH (Java Microbenchmarking Harness)** to measure the execution time for different array sizes.

### Benchmark Results:

| Array Size | Execution Time (ns) |
|------------|---------------------|
| 100        | 8000                |
| 1000       | 72000               |
| 10000      | 690000              |
| 100000     | 7400000             |

These results demonstrate the linear growth of execution time as the input size increases.

## Usage Instructions

To use the Boyer-Moore Majority Vote algorithm, call the `findMajorityElement` method with an array of integers as shown below:

```java
int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};```
int result = BoyerMooreMajorityVote.findMajorityElement(nums, new PerformanceTracker());```


This will return the majority element in the array or -1 if no majority element exists.

Conclusion

The Boyer-Moore Majority Vote algorithm is an efficient solution to the problem of finding a majority element in an array, with linear time complexity and constant space complexity.

JMH was used for accurate performance benchmarking, and the algorithm was tested on different input sizes and edge cases to ensure correctness and efficiency.
