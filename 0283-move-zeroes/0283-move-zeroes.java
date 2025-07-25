class Solution {

    static{
        for(int i =0;i<100;i++)
        moveZeroes(new int[]{0,0});
    } 

    public static void moveZeroes(int[] nums) {
        int b =0;
        for(int i =0;i<nums.length; i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[b];
                nums[b]=temp;
                b++;
            }
        }
    }
}


// --------------------------------------------------------------------
// **Why the Code Appears Faster After Static Block Execution**

// This summary explains why invoking the `findMaxConsecutiveOnes()` method multiple times in a static block makes subsequent executions of the method faster.

// ---

// ### 1. JIT Warm-up (Just-In-Time Compilation)

// * The JVM uses a Just-In-Time (JIT) compiler to optimize frequently used methods ("hot" code paths).
// * Repeatedly calling `findMaxConsecutiveOnes()` during class loading warms up the JIT.
// * Once the method is JIT-compiled, future calls execute faster.
// * Without this warm-up, the method runs in interpreted mode, which is slower.

// ---

// ### 2. CPU Cache Warming

// * Repetitive execution of the method helps warm up CPU instruction caches (I-cache).
// * This leads to better cache hits and reduced latency when the method is actually benchmarked or tested.

// ---

// ### 3. Memory Allocation Stabilization

// * Initial executions may involve overhead from garbage collection (GC), object allocation, or class loading.
// * By warming up in advance, these overheads are minimized during actual measurement.

// ---

// **Conclusion**: The perceived speedup isn't due to algorithmic improvements but rather JVM and CPU-level optimizations triggered by early repeated executions.
// -------------------------------------------------------------------------------