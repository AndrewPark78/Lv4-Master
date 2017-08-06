package threads;

import java.util.Random;

public class ThreadedNumberSorter {
	static final int TOTAL_NUMS = 10;

	// Complete the method below so that it uses threads to sort the integer
	// array.
	// Try to get the completion time as short as possible.
	// Use the printArray method to check sorting accuracy
	public static void parallelSort(int[] nums) {
		long startTime = System.nanoTime();
		// Complete this method starting at this point
		int lowest = nums[0];
		int counter = 0;
		int[] nums2 = new int[TOTAL_NUMS];
		for (int i = 0; i < TOTAL_NUMS; i++) {
			for (int c : nums) {
				if (c < lowest) {
					lowest = c;
				}
				counter++;
			}
			counter --;
			nums2[i] = lowest;
			nums[counter] = Integer.MAX_VALUE;
			counter = 0;
		}

		long totalTime = System.nanoTime() - startTime;
		double timeInSeconds = (double) totalTime / 1_000_000_000;
		System.out.println("The total computing time in seconds was: " + timeInSeconds);
	}

	public static void main(String[] args) {
		int[] nums = new int[TOTAL_NUMS];

		Random randGen = new Random();
		for (int i = 0; i < TOTAL_NUMS; i++) {
			nums[i] = randGen.nextInt(TOTAL_NUMS);
		}

		printArray(nums);
		parallelSort(nums);
		printArray(nums);
	}

	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
