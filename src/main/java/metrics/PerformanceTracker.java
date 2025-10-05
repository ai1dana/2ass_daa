package metrics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.logging.*;

public class PerformanceTracker {
    private static final Logger logger = Logger.getLogger(PerformanceTracker.class.getName());

    private long comparisons = 0;
    private long swaps = 0;
    private long arrayAccesses = 0;
    private long memoryAllocations = 0;

    public void incrementComparison() {
        comparisons++;
    }

    public void incrementSwap() {
        swaps++;
    }

    public void incrementArrayAccess() {
        arrayAccesses++;
    }

    public void incrementMemoryAllocation() {
        memoryAllocations++;
    }

    public long getComparisons() {
        return comparisons;
    }

    public long getSwaps() {
        return swaps;
    }

    public long getArrayAccesses() {
        return arrayAccesses;
    }

    public long getMemoryAllocations() {
        return memoryAllocations;
    }

    public void reset() {
        comparisons = 0;
        swaps = 0;
        arrayAccesses = 0;
        memoryAllocations = 0;
    }

    public void exportToCSV(String fileName, int inputSize, String algorithmName) {
        String header = "input_size,time_ns,comparisons,swaps,array_accesses,memory_allocations,algorithm\n";
        String data = inputSize + "," + System.nanoTime() + "," + comparisons + "," + swaps + "," +
                arrayAccesses + "," + memoryAllocations + "," + algorithmName + "\n";

        try {
            Path path = Paths.get(fileName);
            if (!Files.exists(path)) {
                Files.createFile(path);
                Files.write(path, header.getBytes());
            }
            Files.write(path, data.getBytes(), java.nio.file.StandardOpenOption.APPEND);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error while writing to CSV", e);
        }
    }
}


