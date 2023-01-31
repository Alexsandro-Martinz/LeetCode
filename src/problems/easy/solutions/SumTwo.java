package problems.easy.solutions;

import java.util.HashMap;

public class SumTwo {

	public static int[] sumTwo(int[] nums, int target) {
		HashMap<Integer, Integer> components = new HashMap<Integer, Integer>();
		for(int i = 0 ; i < nums.length ; i++) {
			Integer componentIndex = components.get(nums[i]);
			if(componentIndex != null) {
				return new int[] {i, componentIndex};
			}
			components.put(target-nums[i], i);
		}
		return nums;
	}
	
}
