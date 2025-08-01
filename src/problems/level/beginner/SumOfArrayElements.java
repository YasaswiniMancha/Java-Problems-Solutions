package problems.level.beginner;

public class SumOfArrayElements {

    // Method to calculate the running sum of an array
    public int[] runningSum(int[] nums) { //time complexity: o(n) space comlexity: o(1)
    	
        int[] results = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            // Ensure no negative index is accessed
            if (i == 0) {
                results[i] = nums[i];  // First element is the same
            } else {
                results[i] = nums[i] + results[i - 1];  // Add previous result
            }
        }
        
        // Display the results
        System.out.println("results array: ");
        for (int result : results) {
            System.out.print(result + " ");
        }
        System.out.println();
        
        return results;
    }
    
    
    

    public int[] runningSumWithOverrideMethod(int[] nums) { //time complexity: o(n) space comlexity: o(1)
        
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                nums[i] = nums[i - 1] + nums[i];
            }
        }
        
        System.out.println("nums array using Override Method for sum up: ");
        for (int num : nums) {
            System.out.print(num + " "); // Print each number in the array
        }
        System.out.println();
        
        return nums;
    }


}
