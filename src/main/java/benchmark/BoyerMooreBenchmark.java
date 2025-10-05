package benchmark;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Scope;
public class BoyerMooreBenchmark {
    private int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4}; // Example input

    @Benchmark
    public int testMajorityElement() {
        PerformanceTracker tracker = new PerformanceTracker();
        return BoyerMooreMajorityVote.findMajorityElement(nums, tracker);
    }
}
