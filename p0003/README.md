# Problem 0003: The Memory Sentinel

## Description
In high-performance Java applications, understanding how the Garbage Collector (GC) interacts with your objects is essential. You are tasked with creating a "Memory Sentinel" system that monitors the free memory of the JVM before and after allocating a heavy set of objects.



**Requirements:**
1.  **Package**: Use the package name `p0003`.
2.  **Resource Class (`Resource.java`)**: 
    * Include a `private int id` and a `private long[] data` (this array will simulate memory load).
    * Initialize the `data` array in the constructor based on a provided size `S`.
    * **Finalization**: Override the `protected void finalize()` method. Inside, print: `Sentinel: Resource [id] is being reclaimed.`
3.  **Memory Monitoring (`Main.java`)**: In your `Main` class, use the `java.lang.Runtime` class to:
    * Capture and print the **Initial Free Memory**.
    * Create a loop to instantiate `N` `Resource` objects.
    * Print the **Free Memory after Allocation**.
    * **Cleanup**: Set your object references to `null` and explicitly suggest garbage collection using `System.gc()`.
    * Print the **Final Free Memory** after the GC suggestion.

*Note: Since Garbage Collection is non-deterministic, the `finalize()` messages may appear in any order or slightly delayed. Your code should focus on the correct sequence of logic.*

## Input
Two integers separated by a space:
1.  **N**: The number of `Resource` objects to create.
2.  **S**: The size of the `long` array inside each `Resource` object (to consume memory).

## Output
1.  `Initial Free Memory: [value]`
2.  `Free Memory after Allocation: [value]`
3.  `Free Memory after GC: [value]`
4.  `Sentinel: Resource [id] is being reclaimed.` (Repeated for each object)

## Example
**Input**
```text
3 500000